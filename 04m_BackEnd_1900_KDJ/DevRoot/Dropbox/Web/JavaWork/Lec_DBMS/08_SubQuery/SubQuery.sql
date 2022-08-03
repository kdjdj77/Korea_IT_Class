#----------------------------------------
-- Sub Query
 
-- #7101
-- t_emp 테이블에서
-- scott 보다 급여를 많이 받는 사람의 이름과 급여 출력
 
SELECT * FROM t_emp;
SELECT sal FROM t_emp WHERE ename = 'SCOTT';

SELECT ename, sal
FROM t_emp 
WHERE sal > (SELECT sal FROM t_emp WHERE ename = 'SCOTT')
;

-- 1. 단일행 서브쿼리
-- SubQuery 결과가 한개 1행만 나오는 것.
-- 단일행 Sub Query 의  WHERE 에서 사용되는 연산자
-- = , <> , !=, >, >= , <, <=
 
-- #7103)연습
-- t_student, t_department 테이블 사용하여
-- 이윤나 학생과 1전공(deptno1)이 동일한 학생들의
-- 이름(name)과 1전공이름(dname)을 출력하세요
SELECT s.name 이름, d.dname "1전공"
FROM t_student s 
JOIN t_department d ON s.deptno1 = d.deptno
AND s.deptno1 = 
	(SELECT deptno1 
	FROM t_student
	WHERE name = '이윤나')
;
-- #7107) 예제
-- t_emp2, t_dept2 테이블 :
-- 근무지역 (t_dept2.area) 이 서울 지사인 모든 사원들의
-- 사번(empno)과 이름(name), 부서번호(deptno)를 출력하세요
SELECT * FROM t_emp2;
SELECT * FROM t_dept2;

-- 근무지역이 서울지사인 부서들은?
SELECT dcode FROM t_dept2 WHERE area = '서울지사';

SELECT empno, name, deptno
FROM t_emp2 WHERE deptno = (
	SELECT dcode 
	FROM t_dept2 
	WHERE area = '서울지사'
) -- error (서브쿼리가 여러 값을 가짐)
;
-- 2. 다중행 쿼리
-- Sub Query 결과가 2건 이상 출력되는 것을 말합니다.
-- 다중행 Sub Query 와 함께 사용하는 연산자
--       IN 같은 값을 찾음
--      >ANY 최소값을 반환함 (서브쿼리 결과중 가장작은것보다 큰)
--      <ANY 최대값을 반환함 (서브쿼리 결과중 가장큰것보다 작은)
--      <ALL 최소값을 반환함 (서브쿼리 결과중 가장작은것보다 작은)
--      >ALL 최대값을 반환함 (서브쿼리 결과중 가장큰것보다 큰)
--      EXIST Sub Query 값이 있을 경우 반환
SELECT empno, name, deptno
FROM t_emp2 
WHERE deptno IN (
	SELECT dcode 
	FROM t_dept2 
	WHERE area = '서울지사'
) -- error (서브쿼리가 여러 값을 가짐)
;
 
-- #7108) 연습
-- t_emp2 테이블 :
-- 전체직원중 과장 직급의 최소연봉자보다
-- 연봉이 높은 사람의
-- 이름(name)과 직급(post), 연봉(pay)을 출력하세요.  
-- 단, 연봉 출력 형식은 천 단위 구분 기호와 원 표시를 하세요

-- 과장 직급의 연봉
SELECT * FROM t_emp2 WHERE POST = '과장';

SELECT name 이름, post 직급,
	concat(format(pay, 0), '원') 연봉
FROM t_emp2
WHERE pay > ANY (
	SELECT pay FROM t_emp2 WHERE POST = '과장'
)
;

-- 스칼라 서브쿼리
SELECT 
	(SELECT 10),
	(SELECT 20);

-- #7206) 예제
-- t_emp2, t_dept2 테이블:
-- 조회하여 사원들의 이름과 부서 이름을 출력
 
SELECT e.name 사원이름,
	(SELECT d.dname FROM t_dept2 d
	WHERE d.dcode = e.deptno) 부서이름
FROM t_emp2 e

-- JOIN 과 같은 결과 나옴.  
-- 그러나 데이터 양이 적은 경우는 스칼라서브쿼리 방식이 Join 보다 낳은 성능을 보여줌






