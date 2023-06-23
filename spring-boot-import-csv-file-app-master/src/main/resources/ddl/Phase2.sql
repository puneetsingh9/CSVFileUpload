SET check_function_bodies = false;
-- ddl-end --

-- object: nibrs | type: SCHEMA --
-- DROP SCHEMA nibrs CASCADE;
CREATE SCHEMA nibrs;
-- ddl-end --

SET search_path TO pg_catalog,public,nibrs;
-- ddl-end --

-- object: nibrs.upload_request_info_pk_seq | type: SEQUENCE --
-- DROP SEQUENCE nibrs.upload_request_info_pk_seq ;
CREATE SEQUENCE nibrs.upload_request_info_pk_seq 
	INCREMENT BY 1
	MINVALUE 0
	MAXVALUE 9223372036854775807
	START WITH 1
	CACHE 1
	NO CYCLE
	OWNED BY NONE;
-- ddl-end --

-- object: nibrs.visual_request_pk_seq | type: SEQUENCE --
-- DROP SEQUENCE nibrs.visual_request_pk_seq;
CREATE SEQUENCE nibrs.visual_request_pk_seq
	INCREMENT BY 1
	MINVALUE 0
	MAXVALUE 9223372036854775807
	START WITH 1
	CACHE 1
	NO CYCLE
	OWNED BY NONE;
-- ddl-end --

-- ddl-end --
-- object: nibrs.submission_status_pk_seq | type: SEQUENCE --
-- DROP SEQUENCE nibrs.submission_status_pk_seq;
CREATE SEQUENCE nibrs.submission_status_pk_seq
	INCREMENT BY 1
	MINVALUE 0
	MAXVALUE 9223372036854775807
	START WITH 1
	CACHE 1
	NO CYCLE
	OWNED BY NONE;
-- ddl-end --


-- object: nibrs.UploadRequestInfo | type: TABLE --
-- DROP TABLE nibrs.UploadRequestInfo;
CREATE TABLE nibrs.UploadRequestInfo(
	RequestID bigint NOT NULL DEFAULT nextval('nibrs.upload_request_info_pk_seq'::regclass),
	FileName text,
	Email text,
	VisualRequest bigint,
	SubmissionStatus bigint,
	FileAudit bigint,
    timestamp timestamp default current_timestamp
);
-- ddl-end --

-- object: nibrs.VisualRequest | type: TABLE --
-- DROP TABLE nibrs.VisualRequest;
CREATE TABLE nibrs.VisualRequest(
	ID bigint NOT NULL DEFAULT nextval('nibrs.visual_request_pk_seq'::regclass),
	Vr_Description text,
    timestamp timestamp default current_timestamp

);

-- ddl-end --

-- object: nibrs.SubmissionStatus | type: TABLE --
-- DROP TABLE nibrs.SubmissionStatus;
CREATE TABLE nibrs.SubmissionStatus(
	ID bigint NOT NULL DEFAULT nextval('nibrs.submission_status_pk_seq'::regclass),
	Stat_Description text,
    timestamp timestamp default current_timestamp

);

CREATE TABLE bjs_data (
	    id int NOT NULL AUTO_INCREMENT,
	  incident_id VARCHAR(255),
	  data_year VARCHAR(255),
	  offense_id VARCHAR(255),
	  victim_id VARCHAR(255),
	  offender_id VARCHAR(255),
	  incident_date VARCHAR(255),
	  incident_hour VARCHAR(255),
	  ori VARCHAR(255),
	  agency VARCHAR(255),
	  county VARCHAR(255),
	  state VARCHAR(255),
	  agency_type VARCHAR(255),
	  offense VARCHAR(255),
	  offense_category VARCHAR(255),
	  cleared_except VARCHAR(255),
	  victim_sex VARCHAR(255),
	  victim_age VARCHAR(255),
	  victim_race VARCHAR(255),
	  victim_ethnicity VARCHAR(255),
	  victim_type VARCHAR(255),
	  offender_sex VARCHAR(255),
	  offender_age VARCHAR(255),
	  offender_race VARCHAR(255),
	  offender_ethnicity VARCHAR(255),
	  relationship_status VARCHAR(255),
	  clearance_status VARCHAR(255),
	  is_retail_commercial_location VARCHAR(255),
	  crime_type VARCHAR(255),
	  inc_date VARCHAR(255),
	  month_year_date VARCHAR(255),
	  hour VARCHAR(255),
	  hour_group VARCHAR(255),
	  latitude VARCHAR(255),
	  longitude VARCHAR(255),
	  Beat VARCHAR(255),
	  month_date VARCHAR(255),
	  week_year_date VARCHAR(255),
	  day_of_week VARCHAR(255),
	  week_day VARCHAR(255),
	  quarter VARCHAR(255),
	  Location_Type VARCHAR(255),
	  Method_of_Entry VARCHAR(255),
	  Forced_NonForced VARCHAR(255),
	  Point_of_Entry VARCHAR(255),
PRIMARY KEY (id)
	  
	);
