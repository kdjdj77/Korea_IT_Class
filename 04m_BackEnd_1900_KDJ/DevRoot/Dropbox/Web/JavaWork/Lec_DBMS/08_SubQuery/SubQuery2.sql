CREATE TABLE test_emp_a (
   emp_id    INT,
   emp_name  VARCHAR(100)
);
 
CREATE TABLE test_emp_b (
   emp_id    INT,
   emp_name  VARCHAR(100)
);

INSERT INTO test_emp_a VALUES(101, '아이언맨');
INSERT INTO test_emp_a VALUES(201, '캡틴');

SELECT * FROM test_emp_a;
SELECT * FROM test_emp_b;

-- 여러 개의 row를 한번에 INSERT
INSERT INTO test_emp_a
VALUES 
	(102, '블랙위도우'), 
	(103, '토르'),
	(104, '블랙팬서');

-- sub query로 INSERT 가능
INSERT INTO test_emp_a (SELECT 105, '스파이더맨');

-- 두배로 늘리기
INSERT INTO test_emp_a (SELECT * FROM test_emp_a);

INSERT INTO test_emp_b (emp_id)
SELECT emp_id FROM test_emp_a;

INSERT INTO test_emp_a
SELECT * FROM test_emp_a
UNION all
SELECT * FROM test_emp_b 
;

-- CREATE TABLE + SubQuery
CREATE TABLE test_emp_c
AS
SELECT * FROM test_emp_a;

SELECT * FROM test_emp_c;


