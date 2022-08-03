-- FROM 절의 테이블에도 별명(alias)을 줄 수 있다

-- 학생 20명
SELECT s.studno, s.name, s.deptno1
FROM t_student s;

-- 학과
SELECT d.deptno, d.dname
FROM t_department d;

-- 카티션곱 (Cartesian Product)
-- 두개의 테이블을 JOIN 하게 되면,
-- 각 테이블의 레코드들의 모든 조합이 출력된다.
-- WHERE 나 ON 등으로 JOIN 조건이 주어지지 않으면
-- 모든 카티션곱이 출력된다.
SELECT s.studno, s.name, s.deptno1,
	d.deptno, d.dname
FROM t_student s, t_department d;

-- 위의 카티션 곱에서 조건을 주면 원한는 레코드만 추출 가능.
 
-- ---------------------------------------------------------------------------------
-- Equi Join (등가 Join)
-- 일반적으로 많이 쓰이는 Join 이며, 양쪽 테이블 Join 한 카티션곱에서 ‘같은조건’이 존재할 경우만 값을 가져오는 것
 
-- 예) #6101
-- t_student 테이블과 t_department 테이블을 사용하여 학생이름, 1전공 학과번호, 1전공 학과 이름을 출력하세요

-- MySQL 구문
SELECT s.name, s.deptno1, d.dname
FROM t_student s, t_department d
WHERE s.deptno1 = d.deptno	-- JOIN 조건
;
-- ANSI SQL 구문
SELECT s.name, s.deptno1, d.dname
FROM t_student s JOIN t_department d
ON s.deptno1 = d.deptno	-- JOIN 조건
;
-- 연습 #6102)
-- t_student 테이블, t_professor 테이블 을 join하여
-- ‘학생이름’, ‘지도교수번호’, ‘지도교수이름’ 을 출력하세요
-- MySQL 구문
SELECT 
	s.name 학생이름,
	s.profno 지도교수번호, 
	p.name 지도교수이름
FROM t_student s, t_professor p
WHERE s.profno = p.PROFNO
;
-- ANSI 구문
SELECT 
	s.name 학생이름,
	s.profno 지도교수번호, 
	p.name 지도교수이름
FROM t_student s 
JOIN t_professor p ON s.profno = p.PROFNO
;
-- 위 결과 보면 모든 학생이 SELECT  되지 않는다 지도교수가 없는 null 인 학생이 있는 것이다
--  null 값은 join 조건에 참여 안한다
 
-- 3테이블 JOIN
-- #6103
-- t_student, t_department, t_professor 테이블 을 join 하여
--  학생의 이름, 학과이름, 지도교수 이름  을 출력하세요
-- MySQL 구문
SELECT 
	s.name 학생이름, 
	d.dname 학과이름, 
	p.NAME 교수이름,
	s.PROFNO 교수번호
FROM t_student s, t_department d, t_professor p
WHERE s.deptno1 = d.deptno AND s.profno = p.PROFNO
;
-- ANSI 구문
SELECT 
	s.name 학생이름, 
	d.dname 학과이름, 
	p.NAME 교수이름
FROM t_student s
JOIN t_department d ON s.deptno1 = d.deptno
JOIN t_professor p ON s.profno = p.PROFNO
;
-- 연습 #6105
-- t_student - t_professor 테이블 join 하여
-- 제1전공(deptno1) 이 101번인 학생들의
-- 학생이름과 지도교수 이름을 출력하세요
-- MySQL 구문
SELECT 
	s.name 학생이름,
	p.NAME 교수이름
FROM t_student s, t_professor p
WHERE s.profno = p.PROFNO AND s.deptno1 = 101
;
-- ANSI 구문
SELECT 
	s.name 학생이름,
	p.NAME 교수이름
FROM t_student s 
JOIN t_professor p ON s.profno = p.PROFNO 
WHERE s.deptno1 = 101
;
-- 비등가 조인 (Non-Equi Join)
 
-- #6201)
-- t_customer 테이블, t_gift 테이블을 join 하여  
-- 고객의 마일리지 포인트별로 받을수 있는 상품을 조회하여
-- 고객의 '이름(c_name)'과 포인트(c_point) 상품명(g_name)을 출력하세요
-- BETWEEN ~ AND ~ 사용
SELECT * FROM t_customer;
SELECT * FROM t_gift;

SELECT 
	c.c_name 고객명, 
	c.c_point "POINT",
	g.g_name 상품명
FROM t_customer c, t_gift g
WHERE c.c_point BETWEEN g.g_start AND g.g_end
;
--  #6202) 연습
-- 앞 예제에서 조회한 상품의 이름(gname)과 필요수량이 몇개인지 조회하세요
-- (그룹함수 동원되어야 한다)
SELECT 
	g.g_name 상품명,
	count(*) 필요수량
FROM t_customer c, t_gift g
WHERE c.c_point BETWEEN g.g_start AND g.g_end
GROUP BY g.g_name
;

-- ----------------------------------------------
-- OUTER JOIN (외부 JOIN)
SELECT s.name, p.name
FROM t_student s
INNER JOIN t_professor p ON s.profno = p.PROFNO
;
-- 
SELECT s.name, p.name
FROM t_student s
LEFT OUTER JOIN t_professor p ON s.profno = p.PROFNO
;
SELECT s.name, p.name
FROM t_student s
RIGHT OUTER JOIN t_professor p ON s.profno = p.PROFNO
;
-- MySQL은 FULL OUTER JOIN을 지원하지 않는다
-- 대신 UNION을 사용하면 된다
SELECT s.name, p.name
FROM t_student s
LEFT OUTER JOIN t_professor p ON s.profno = p.PROFNO
UNION
SELECT s.name, p.name
FROM t_student s
RIGHT OUTER JOIN t_professor p ON s.profno = p.PROFNO
;

-- SELF JOIN
SELECT * FROM t_dept2;

-- #6209)
-- t_dept2 테이블에서
-- 부서명 과 그 부서의 상위부서명을 출력하세요
SELECT d1.dname 부서명, d2.dname 상위부서명
FROM t_dept2 d1, t_dept2 d2
WHERE d1.pdept = d2.decode
;
 



