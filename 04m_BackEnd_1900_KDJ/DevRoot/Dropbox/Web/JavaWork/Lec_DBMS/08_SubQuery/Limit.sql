-- SELECT 결과물중 맨 위의 5개만 출력해보고 싶으면 어케 해야 하나?
-- SELECT 결과물중 n 번째 부터 m 개를 출력하고 싶다면?
--   ex) 게시판.. 페이징
 
-- DBMS 마다 구현 방법 다름
-- MYSQL : LIMIT
-- MS SQL server : TOP
-- ORACLE : ROWNUM
 
SELECT empno, name FROM t_emp2;

-- 샘플용 테이블 만들기
DROP TABLE IF EXISTS t_emp3;
CREATE TABLE t_emp3 (
    uid INT PRIMARY KEY AUTO_INCREMENT,
    empno INT NOT NULL,
    name VARCHAR(10) NOT NULL
);
 
INSERT INTO t_emp3(empno, name)
    SELECT empno, name FROM t_emp2;
 
SELECT * FROM t_emp3;

INSERT INTO t_emp3 (empno, name)
SELECT empno, name FROM t_emp3;

SELECT count(*) FROM t_emp3;

-- LIMIT n : 첫 n개
SELECT * FROM t_emp3 LIMIT 5;
SELECT * FROM t_emp3 ORDER BY uid DESC LIMIT 5;

-- LIMIT from, n : from 부터 n개   (from 은 index 0 부터 시작)
-- ↓만약 한 페이지당 5개씩 보여준다면..
SELECT * FROM t_emp3 LIMIT 0, 5; -- 첫 페이지
SELECT * FROM t_emp3 LIMIT 5, 5; -- 두 번째 페이지
SELECT * FROM t_emp3 LIMIT 10, 5; -- 세 번째 페이지





