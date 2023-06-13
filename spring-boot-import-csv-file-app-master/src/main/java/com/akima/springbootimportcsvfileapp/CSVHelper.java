package com.akima.springbootimportcsvfileapp;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.springframework.web.multipart.MultipartFile;


public class CSVHelper {
	public static String TYPE = "text/csv";
	static String[] HEADERs = { "Incident_id","Data_year", "Offense_id", "Victim_id","Offender_id","Incident_date","Incident_hour", "Ori", "Agency",		  
			"County", "State", "Agency_type", "Offense", "Offense_category", "Cleared_except", "Victim_sex", "Victim_age", "Victim_race", "Victim_ethnicity",
			"victim_type","Offender_sex", "Offender_age", "Offender_race", "Offender_ethnicity"  , "Relationship_status", "Clearance_status", "Is_retail_commercial_location",
			"Crime_type", "Inc_date", "Month_year_date", "Hour", "Hour_group", "Latitude", "Longitude","Beat","Month_date","Week_year_date","Day_of_week",
			"Week_day","Quarter","Location_Type","Method_of_Entry","Forced_NonForced","Point_of_Entry" };

	public static boolean hasCSVFormat(MultipartFile file) {
		System.out.println(file.getContentType());
		if (TYPE.equals(file.getContentType())
				|| file.getContentType().equals("application/vnd.ms-excel")) {
			return true;
		}

		return false;
	}

	public static List<CsvEntity> csvToTutorials(InputStream is) {
		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

			List<CsvEntity> developerTutorialList = new ArrayList<>();

			Iterable<CSVRecord> csvRecords = csvParser.getRecords();

			for (CSVRecord csvRecord : csvRecords) {
				CsvEntity developerTutorial = new CsvEntity(
						//Long.parseLong(csvRecord.get("Incident_id")),
						Integer.parseInt(csvRecord.get("Incident_id")),


						csvRecord.get("Data_year"),

						csvRecord.get("Offense_id"),
						csvRecord.get("Victim_id"),
						csvRecord.get("Offender_id"),
						csvRecord.get("Incident_date"),
						csvRecord.get("Incident_hour"),
						csvRecord.get("Ori"),
						csvRecord.get("Agency"),
						csvRecord.get("County"),
						csvRecord.get("State"),
						csvRecord.get("Agency_type"),
						csvRecord.get("Offense"),
						csvRecord.get("Offense_category"),
						csvRecord.get("Cleared_except"),
						csvRecord.get("Victim_sex"),
						csvRecord.get("Victim_age"),
						csvRecord.get("Victim_race"),
						csvRecord.get("Victim_ethnicity"),
						csvRecord.get("victim_type"),
						csvRecord.get("Offender_sex"),
						csvRecord.get("Offender_age"),
						csvRecord.get("Offender_race"),
						csvRecord.get("Offender_ethnicity"),
						csvRecord.get("Relationship_status"),
						csvRecord.get("Clearance_status"),
						csvRecord.get("Is_retail_commercial_location"),
						csvRecord.get("Crime_type"),
						csvRecord.get("Inc_date"),
						csvRecord.get("Month_year_date"),
						csvRecord.get("Hour"),
						csvRecord.get("Hour_group"),
						csvRecord.get("Latitude"),
						csvRecord.get("Longitude"),
						csvRecord.get("Beat"),
						csvRecord.get("Month_date"),
						csvRecord.get("Week_year_date"),
						csvRecord.get("Day_of_week"),
						csvRecord.get("Week_day"),
						csvRecord.get("Quarter"),
						csvRecord.get("Location_Type"),
						csvRecord.get("Method_of_Entry"),
						csvRecord.get("Point_of_Entry")
						);

				developerTutorialList.add(developerTutorial);
			}

			return developerTutorialList;
		} catch (IOException e) {
			throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
		}
	}

	public static ByteArrayInputStream tutorialsToCSV(List<CsvEntity> developerTutorialList) {
		final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);

		try (ByteArrayOutputStream out = new ByteArrayOutputStream();
				CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
			for (CsvEntity developerTutorial : developerTutorialList) {
				List<String> data = Arrays.asList(
						developerTutorial.getOffense_id(),
						String.valueOf(developerTutorial.getIncident_id()),
						developerTutorial.getCrime_type(),
						developerTutorial.getIncident_date(),
						developerTutorial.getIncident_hour(),
						developerTutorial.getHour_group(),
						developerTutorial.getOffender_id(),
						developerTutorial.getOri(),
						developerTutorial.getVictim_id(),
						developerTutorial.getAgency(),
						developerTutorial.getAgency_type(),
						developerTutorial.getBeat(),
						developerTutorial.getClearance_status(),
						developerTutorial.getCleared_except(),
						developerTutorial.getCounty(),
						developerTutorial.getCrime_type(),
						developerTutorial.getData_year(),
						developerTutorial.getDay_of_week(),
						developerTutorial.getHour(),
						developerTutorial.getHour_group(),
						developerTutorial.getInc_date(),
						developerTutorial.getIncident_date(),
						developerTutorial.getIs_retail_commercial_location(),
						developerTutorial.getLatitude(),
						developerTutorial.getLocation_Type(),
						developerTutorial.getLongitude(),
						developerTutorial.getMethod_of_Entry(),
						developerTutorial.getMonth_date(),
						developerTutorial.getMonth_year_date(),
						developerTutorial.getOffender_age(),
						developerTutorial.getOffender_ethnicity(),
						developerTutorial.getOffender_id(),
						developerTutorial.getOffender_race(),
						developerTutorial.getOffender_sex(),
						developerTutorial.getOffense(),
						developerTutorial.getOffense_category(),
						developerTutorial.getOffense_id(),
						developerTutorial.getPoint_of_Entry(),
						developerTutorial.getQuarter(),
						developerTutorial.getRelationship_status(),
						developerTutorial.getState(),
						developerTutorial.getVictim_age(),
						developerTutorial.getVictim_ethnicity(),
						developerTutorial.getVictim_id(),
						developerTutorial.getVictim_race(),
						developerTutorial.getVictim_sex(),
						developerTutorial.getVictim_type(),
						developerTutorial.getWeek_day(),
						developerTutorial.getWeek_year_date()



						);

				csvPrinter.printRecord(data);
			}

			csvPrinter.flush();
			return new ByteArrayInputStream(out.toByteArray());
		} catch (IOException e) {
			throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
		}
	}
}
