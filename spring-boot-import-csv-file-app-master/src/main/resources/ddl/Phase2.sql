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
	MAXVALUE 2147483647
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
	MAXVALUE 2147483647
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
	MAXVALUE 2147483647
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

	CONSTRAINT pk_upload_request_info_id PRIMARY KEY (RequestID),
	CONSTRAINT unique_email UNIQUE (Email)

);
-- ddl-end --

-- object: nibrs.VisualRequest | type: TABLE --
-- DROP TABLE nibrs.VisualRequest;
CREATE TABLE nibrs.VisualRequest(
	ID bigint NOT NULL DEFAULT nextval('nibrs.visual_request_pk_seq;'::regclass),
	Vr_Description text,
    timestamp timestamp default current_timestamp

);

-- ddl-end --

-- object: nibrs.SubmissionStatus | type: TABLE --
-- DROP TABLE nibrs.SubmissionStatus;
CREATE TABLE nibrs.SubmissionStatus(
	ID bigint NOT NULL DEFAULT nextval('nibrs.submission_status_pk_seq;'::regclass),
	Stat_Description text,
    timestamp timestamp default current_timestamp

);


-- ddl-end --



