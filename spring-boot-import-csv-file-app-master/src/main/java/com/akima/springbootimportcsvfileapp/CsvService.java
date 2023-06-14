package com.akima.springbootimportcsvfileapp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CsvService {
  @Autowired
  CsvRepository repository;

  public void save(MultipartFile file) {
    try {
      List<CsvEntity> tutorials = CsvHelper.csvToTutorials(file.getInputStream());
      repository.saveAll(tutorials);
    } catch (IOException e) {
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }

  public ByteArrayInputStream load() {
    List<CsvEntity> tutorials = repository.findAll();

    ByteArrayInputStream in = CsvHelper.tutorialsToCSV(tutorials);
    return in;
  }

  public List<CsvEntity> getAllTutorials() {
    return repository.findAll();
  }
}

