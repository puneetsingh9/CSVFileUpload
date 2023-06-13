package com.akima.springbootimportcsvfileapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsvRepository extends JpaRepository<CsvEntity, Integer>{

}
