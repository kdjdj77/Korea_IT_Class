-- 주석입니다
# 주석

SELECT 'abcde';
SELECT '안녕하세요', '2022', 4 + 3;

#-- SELECT - 데이터 조회/질의
#-- SELECT [컬럼명 또는 표현식] FROM [테이블명, 뷰명]

SELECT * FROM t_professor;	
SELECT * FROM t_emp;
SELECT empno, ename FROM t_emp;

-- 컬럼 별칭(alias)
SELECT studno 학번, name 이름
FROM t_student;

SELECT
	studno "학생 학번",
	name AS 이름
FROM t_student;

-- DISTINCT - 중복값 제거하고 출력
-- SELECT  DISTINCT [컬럼명 또는 표현식] FROM [테이블명, 뷰명] ;
SELECT deptno FROM t_emp;
SELECT DISTINCT deptno FROM t_emp;

# mysql에서 문자열 연결
SELECT name, POSITION FROM t_professor;
SELECT concat(name, position) "교수님" FROM t_professor;

-- 산술연산자 사용 가능
-- t_emp 테이블
-- 직원이름(ename), 급여(sal), 급여10%인상분
SELECT ename, sal, sal * 1.1 FROM t_emp;

-- WHERE : 원하는 조건만 검색
 
-- SELECT [컬럼명 또는 표현식]
-- FROM [테이블명, 뷰명]  
-- WHERE [조건절] ;
 
SELECT * FROM t_emp;
SELECT * FROM t_emp WHERE job='salesman';
SELECT * FROM t_emp WHERE job='SALESman';
-- mysql은 대소문자 구분 없이 문자열 비교(디폴트)
-- binary => 대소문자 구분
SELECT * FROM t_emp WHERE BINARY(job)='SALESman';

#--직원 테이블(t_emp) 에서 급여(sal) 가 2000보다 큰 사람의
#--이름(ename)과 급여(sal)를 출력하세요
SELECT ename, sal FROM t_emp WHERE sal > 2000;

-- 학생 테이블(t_student) 에서
-- 2,3 학년(grade) 학생의  이름(name), 학년(grade) 출력
SELECT name, grade FROM t_student 
WHERE grade = 2 or grade = 3;

SELECT name, grade FROM t_student 
WHERE grade IN (2, 3);

SELECT name, grade FROM t_student 
WHERE grade NOT IN (1, 4);

SELECT name, grade FROM t_student 
WHERE grade BETWEEN 2 AND 3;

-- 교수님 (t_professor) 중에서
-- 급여 (pay) 가 300 보다 크고,
-- 직급 (position) 이 '정교수' 인 분들의
-- 이름(name), 급여(pay), 직급(position) 을 출력하세요
#TODO

-- 보너스(bonus)를 못받고 있는
-- 교수님의 이름(name)과 직급(position)를 출력하세요
SELECT name, POSITION FROM t_professor 
WHERE bonus IS NULL;

-- null값과 다른 값과의 연산결과는 null이다
SELECT name, pay, bonus, pay + bonus
FROM t_professor;

-- LIKE 와 같이 쓰는 와일드 카드  % ,  _
-- % : 글자수 제한 없고 어떤 글자가 와도 됨
-- _ : 글자수는 한글자가 반드시 와야 되고 어떤 글자 와도 좋음
 
--  교수님 중에서 김씨 성을 가진 교수님의 이름만 출력 (LIKE 사용)
SELECT name FROM t_professor
WHERE name LIKE '김%'
;
-- 직원 테이블(t_emp)에서 직원이름 (ename) 중에
-- 두번째 글자가 'A' 인 사람의 이름(ename)만 출력
SELECT ename FROM t_emp
WHERE ename LIKE '_A%'
;
-- ORDER BY
-- 직원중 이름에 L 이 들어간 사람의 이름을 사전오름차순으로 출력하기
SELECT ename FROM t_emp
WHERE ename LIKE '%L%'
ORDER BY ename DESC # ASC:오름차순, DESC:내림차순
;
-- 직원의 이름,직책, 급여를 출력하되
-- 우선은 직책(job) 사전 내림차순으로,
-- 그리고 급여(sal) 오름차순으로 출력
SELECT ename, job, sal FROM t_emp
ORDER BY job DESC, sal ASC
;
-- t_emp2 직원 테이블에서
-- 생일(birthday) 가 1980년대생인 사람들의 이름과 생일만 출력하세요
-- 즉 1980/01/01 ~ 1989/12/31
SELECT name, birthday FROM t_emp2
WHERE '1980-01-01' <= birthday 
AND birthday < '1990-01-01'
;






