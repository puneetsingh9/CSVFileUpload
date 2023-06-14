package com.akima.springbootimportcsvfileapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bjs_data")
public class CsvEntity {

	@Id
	@Column(name = "incident_id")
	private int incident_id;

	@Column(name = "data_year")
	private String data_year;


	@Column(name = "offense_id") 
	private String offense_id;
	
	@Column(name = "victim_id")
	private String victim_id;

	@Column(name = "offender_id")
	private String offender_id;

	@Column(name = "incident_date")
	private String incident_date;

	@Column(name = "incident_hour")
	private String incident_hour;

	
	@Column(name = "ori")
	private String ori;
	
	@Column(name = "agency")
	private String agency;

	@Column(name = "county")
	private String county;

	@Column(name = "state")
	private String state;

	@Column(name = "agency_type")
	private String agency_type;
	
	@Column(name = "offense")
	private String offense;

	@Column(name = "offense_category")
	private String offense_category;

	@Column(name = "cleared_except")
	private String cleared_except;

	@Column(name = "victim_sex")
	private String victim_sex;

	@Column(name = "victim_age")
	private String victim_age;

	@Column(name = "victim_race")
	private String victim_race;

	@Column(name = "victim_ethnicity")
	private String victim_ethnicity;

	@Column(name = "victim_type")
	private String victim_type;

	@Column(name = "offender_sex")
	private String offender_sex;

	@Column(name = "offender_age")
	private String offender_age;

	@Column(name = "offender_race")
	private String offender_race;

	@Column(name = "offender_ethnicity")
	private String offender_ethnicity;

	@Column(name = "relationship_status")
	private String relationship_status;

	@Column(name = "clearance_status")
	private String clearance_status;

	@Column(name = "is_retail_commercial_location")
	private String is_retail_commercial_location;

	@Column(name = "crime_type")
	private String crime_type;

	@Column(name = "inc_date")
	private String inc_date;

	@Column(name = "month_year_date")
	private String month_year_date;

	@Column(name = "hour")
	private String hour;

	@Column(name = "hour_group")
	private String hour_group;

	@Column(name = "latitude")
	private String latitude;

	@Column(name = "longitude")
	private String longitude;

	@Column(name = "Beat")
	private String Beat;

	@Column(name = "month_date")
	private String month_date;

	@Column(name = "week_year_date")
	private String week_year_date;

	@Column(name = "day_of_week")
	private String day_of_week;

	@Column(name = "week_day")
	private String week_day;

	@Column(name = "quarter")
	private String quarter;

	@Column(name = "Location_Type")
	private String Location_Type;

	@Column(name = "Method_of_Entry")
	private String Method_of_Entry;


	@Column(name = "Point_of_Entry")
	private String Point_of_Entry;



	public CsvEntity() {

	}



	

	




	public CsvEntity(int incident_id, String data_year, String offense_id, String victim_id, String offender_id,
			String incident_date, String incident_hour, String ori, String agency, String county, String state,
			String agency_type, String offense, String offense_category, String cleared_except, String victim_sex,
			String victim_age, String victim_race, String victim_ethnicity, String victim_type, String offender_sex,
			String offender_age, String offender_race, String offender_ethnicity, String relationship_status,
			String clearance_status, String is_retail_commercial_location, String crime_type, String inc_date,
			String month_year_date, String hour, String hour_group, String latitude, String longitude, String beat,
			String month_date, String week_year_date, String day_of_week, String week_day, String quarter,
			String location_Type, String method_of_Entry, String point_of_Entry) {
		super();
		this.incident_id = incident_id;
		this.data_year = data_year;
		this.offense_id = offense_id;
		this.victim_id = victim_id;
		this.offender_id = offender_id;
		this.incident_date = incident_date;
		this.incident_hour = incident_hour;
		this.ori = ori;
		this.agency = agency;
		this.county = county;
		this.state = state;
		this.agency_type = agency_type;
		this.offense = offense;
		this.offense_category = offense_category;
		this.cleared_except = cleared_except;
		this.victim_sex = victim_sex;
		this.victim_age = victim_age;
		this.victim_race = victim_race;
		this.victim_ethnicity = victim_ethnicity;
		this.victim_type = victim_type;
		this.offender_sex = offender_sex;
		this.offender_age = offender_age;
		this.offender_race = offender_race;
		this.offender_ethnicity = offender_ethnicity;
		this.relationship_status = relationship_status;
		this.clearance_status = clearance_status;
		this.is_retail_commercial_location = is_retail_commercial_location;
		this.crime_type = crime_type;
		this.inc_date = inc_date;
		this.month_year_date = month_year_date;
		this.hour = hour;
		this.hour_group = hour_group;
		this.latitude = latitude;
		this.longitude = longitude;
		Beat = beat;
		this.month_date = month_date;
		this.week_year_date = week_year_date;
		this.day_of_week = day_of_week;
		this.week_day = week_day;
		this.quarter = quarter;
		Location_Type = location_Type;
		Method_of_Entry = method_of_Entry;
		Point_of_Entry = point_of_Entry;
	}










	public int getIncident_id() {
		return incident_id;
	}



	public void setIncident_id(int incident_id) {
		this.incident_id = incident_id;
	}



	public String getData_year() {
		return data_year;
	}



	public void setData_year(String data_year) {
		this.data_year = data_year;
	}



	public String getOffense_id() {
		return offense_id;
	}



	public void setOffense_id(String offense_id) {
		this.offense_id = offense_id;
	}



	public String getVictim_id() {
		return victim_id;
	}



	public void setVictim_id(String victim_id) {
		this.victim_id = victim_id;
	}



	public String getOffender_id() {
		return offender_id;
	}



	public void setOffender_id(String offender_id) {
		this.offender_id = offender_id;
	}



	public String getIncident_date() {
		return incident_date;
	}



	public void setIncident_date(String incident_date) {
		this.incident_date = incident_date;
	}



	public String getIncident_hour() {
		return incident_hour;
	}



	public void setIncident_hour(String incident_hour) {
		this.incident_hour = incident_hour;
	}



	public String getOri() {
		return ori;
	}



	public void setOri(String ori) {
		this.ori = ori;
	}



	public String getAgency() {
		return agency;
	}



	public void setAgency(String agency) {
		this.agency = agency;
	}



	public String getCounty() {
		return county;
	}



	public void setCounty(String county) {
		this.county = county;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getAgency_type() {
		return agency_type;
	}



	public void setAgency_type(String agency_type) {
		this.agency_type = agency_type;
	}



	public String getOffense() {
		return offense;
	}



	public void setOffense(String offense) {
		this.offense = offense;
	}



	public String getOffense_category() {
		return offense_category;
	}



	public void setOffense_category(String offense_category) {
		this.offense_category = offense_category;
	}



	public String getCleared_except() {
		return cleared_except;
	}



	public void setCleared_except(String cleared_except) {
		this.cleared_except = cleared_except;
	}



	public String getVictim_sex() {
		return victim_sex;
	}



	public void setVictim_sex(String victim_sex) {
		this.victim_sex = victim_sex;
	}



	public String getVictim_age() {
		return victim_age;
	}



	public void setVictim_age(String victim_age) {
		this.victim_age = victim_age;
	}



	public String getVictim_race() {
		return victim_race;
	}



	public void setVictim_race(String victim_race) {
		this.victim_race = victim_race;
	}



	public String getVictim_ethnicity() {
		return victim_ethnicity;
	}



	public void setVictim_ethnicity(String victim_ethnicity) {
		this.victim_ethnicity = victim_ethnicity;
	}



	public String getVictim_type() {
		return victim_type;
	}



	public void setVictim_type(String victim_type) {
		this.victim_type = victim_type;
	}



	public String getOffender_sex() {
		return offender_sex;
	}



	public void setOffender_sex(String offender_sex) {
		this.offender_sex = offender_sex;
	}



	public String getOffender_age() {
		return offender_age;
	}



	public void setOffender_age(String offender_age) {
		this.offender_age = offender_age;
	}



	public String getOffender_race() {
		return offender_race;
	}



	public void setOffender_race(String offender_race) {
		this.offender_race = offender_race;
	}



	public String getOffender_ethnicity() {
		return offender_ethnicity;
	}



	public void setOffender_ethnicity(String offender_ethnicity) {
		this.offender_ethnicity = offender_ethnicity;
	}



	public String getRelationship_status() {
		return relationship_status;
	}



	public void setRelationship_status(String relationship_status) {
		this.relationship_status = relationship_status;
	}



	public String getClearance_status() {
		return clearance_status;
	}



	public void setClearance_status(String clearance_status) {
		this.clearance_status = clearance_status;
	}



	public String getIs_retail_commercial_location() {
		return is_retail_commercial_location;
	}



	public void setIs_retail_commercial_location(String is_retail_commercial_location) {
		this.is_retail_commercial_location = is_retail_commercial_location;
	}



	public String getCrime_type() {
		return crime_type;
	}



	public void setCrime_type(String crime_type) {
		this.crime_type = crime_type;
	}



	public String getInc_date() {
		return inc_date;
	}



	public void setInc_date(String inc_date) {
		this.inc_date = inc_date;
	}



	public String getMonth_year_date() {
		return month_year_date;
	}



	public void setMonth_year_date(String month_year_date) {
		this.month_year_date = month_year_date;
	}



	public String getHour() {
		return hour;
	}



	public void setHour(String hour) {
		this.hour = hour;
	}



	public String getHour_group() {
		return hour_group;
	}



	public void setHour_group(String hour_group) {
		this.hour_group = hour_group;
	}



	public String getLatitude() {
		return latitude;
	}



	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}



	public String getLongitude() {
		return longitude;
	}



	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}



	public String getBeat() {
		return Beat;
	}



	public void setBeat(String beat) {
		Beat = beat;
	}



	public String getMonth_date() {
		return month_date;
	}



	public void setMonth_date(String month_date) {
		this.month_date = month_date;
	}



	public String getWeek_year_date() {
		return week_year_date;
	}



	public void setWeek_year_date(String week_year_date) {
		this.week_year_date = week_year_date;
	}



	public String getDay_of_week() {
		return day_of_week;
	}



	public void setDay_of_week(String day_of_week) {
		this.day_of_week = day_of_week;
	}



	public String getWeek_day() {
		return week_day;
	}



	public void setWeek_day(String week_day) {
		this.week_day = week_day;
	}



	public String getQuarter() {
		return quarter;
	}



	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}



	public String getLocation_Type() {
		return Location_Type;
	}



	public void setLocation_Type(String location_Type) {
		Location_Type = location_Type;
	}



	public String getMethod_of_Entry() {
		return Method_of_Entry;
	}



	public void setMethod_of_Entry(String method_of_Entry) {
		Method_of_Entry = method_of_Entry;
	}



	public String getPoint_of_Entry() {
		return Point_of_Entry;
	}



	public void setPoint_of_Entry(String point_of_Entry) {
		Point_of_Entry = point_of_Entry;
	}



	@Override
	public String toString() {
		return "CsvEntity [incident_id=" + incident_id + ", data_year=" + data_year + ", offense_id="
				+ offense_id + ", victim_id=" + victim_id + ", offender_id=" + offender_id + ", incident_date="
				+ incident_date + ", incident_hour=" + incident_hour + ", ori=" + ori + ", agency=" + agency
				+ ", county=" + county + ", state=" + state + ", agency_type=" + agency_type + ", offense=" + offense
				+ ", offense_category=" + offense_category + ", cleared_except=" + cleared_except + ", victim_sex="
				+ victim_sex + ", victim_age=" + victim_age + ", victim_race=" + victim_race + ", victim_ethnicity="
				+ victim_ethnicity + ", victim_type=" + victim_type + ", offender_sex=" + offender_sex
				+ ", offender_age=" + offender_age + ", offender_race=" + offender_race + ", offender_ethnicity="
				+ offender_ethnicity + ", relationship_status=" + relationship_status + ", clearance_status="
				+ clearance_status + ", is_retail_commercial_location=" + is_retail_commercial_location
				+ ", crime_type=" + crime_type + ", inc_date=" + inc_date + ", month_year_date=" + month_year_date
				+ ", hour=" + hour + ", hour_group=" + hour_group + ", latitude=" + latitude + ", longitude="
				+ longitude + ", Beat=" + Beat + ", month_date=" + month_date + ", week_year_date=" + week_year_date
				+ ", day_of_week=" + day_of_week + ", week_day=" + week_day + ", quarter=" + quarter
				+ ", Location_Type=" + Location_Type + ", Method_of_Entry=" + Method_of_Entry + ", Point_of_Entry="
				+ Point_of_Entry + "]";
	}



	




}
