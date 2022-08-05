-- 제약조건 (Constraint)

-- MySQL 에서 Table 제약조건 확인
SELECT *
FROM information_schema.TABLE_CONSTRAINTS
WHERE TABLE_schema = 'mydb609' AND TABLE_NAME = "t_emp4";

SELECT * FROM t_dept2;

DROP TABLE IF EXISTS t_emp4 CASCADE;
CREATE TABLE t_emp4 (
	NO int(4) PRIMARY KEY,
	name varchar(10) NOT NULL,
	jumin VARCHAR(13) NOT NULL UNIQUE,
	area int(1) CHECK(area < 5),  -- area 컬럼은 5보다 작아야 하는 제약조건
	deptno varchar(6) REFERENCES t_dept2(dcode) -- 외래키(FK:Foreign Key) 제약조건
);
	
CREATE TABLE t_emp4(
	NO int(4),
	name varchar(10) NOT NULL,
	jumin varchar(13) NOT NULL,
	area int(1),
	deptno varchar(6),
	PRIMARY key(no),
	unique(jumin),
	CHECK(area < 5),
	FOREIGN KEY (deptno) REFERENCES t_dept2(dcode)
);
	
-- 제약조건에 이름을 달아 정의	
DROP TABLE IF EXISTS t_emp3 CAS\CADE;	
CREATE TABLE t_emp3(
	NO int(4),
	name varchar(10) NOT NULL,
	jumin varchar(13) NOT NULL,
	area int(1),
	deptno varchar(6),
	CONSTRAINT emp3_no_pk PRIMARY key(no), -- PK
	CONSTRAINT emp3_jumin_uk unique(jumin), -- UK
	CONSTRAINT emp3_area_ck CHECK(area < 5), -- CK
	CONSTRAINT emp3_deptno_fk FOREIGN KEY (deptno) REFERENCES t_dept2(dcode) -- FK
);

SELECT *
FROM information_schema.TABLE_CONSTRAINTS
WHERE TABLE_schema = 'mydb609' AND TABLE_NAME = "t_emp3";

-- t_emp3 에 제약조건에 맞는 / 위배되는 DML 시도



















	