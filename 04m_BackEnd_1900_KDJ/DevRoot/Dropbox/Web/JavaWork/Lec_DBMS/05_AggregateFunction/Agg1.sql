SELECT count(*) FROM t_professor;

-- 그룹함수에서 집계할 때 null 값은 (기본적으로) 배제된다
SELECT count(pay), count(bonus) FROM t_professor;
SELECT 
	sum(pay),
	max(pay),
	min(pay),
	avg(pay)
FROM t_professor
;
SELECT 
	avg(bonus), 
	avg(ifnull(bonus, 0)) 
FROM t_professor
;
-- '학과별', 교수들의 평균급여 출력
SELECT
	deptno, avg(pay) # 작동 X
FROM t_professor;
SELECT deptno, name, pay FROM t_professor;

-- select 절에 그룹함수와 그룹함수가 아닌 것은 함께 올 수 없다
-- 이 경우 그룹함수가 아닌 것들은 GROUP BY절로 묶어야 한다.
SELECT
	deptno,
	avg(pay)
FROM t_professor
GROUP BY deptno
;
-- #5101)연습
-- t_professor 테이블 : 학과별(deptno) 그리고 직급별(position)로
-- 교수들의 평균 급여를 계산하여 출력하세요
SELECT
	deptno,
	POSITION, 
	avg(pay)
FROM t_professor
GROUP BY deptno, POSITION
#GROUP BY deptno ASC, POSITION ASC
;
-- HAVING 절 : 그룹함수의 결과에 조건을 붙이기
-- 학과별 평균급여가 450보다 많은 학과만 출력
SELECT
	deptno,
	avg(pay)
FROM t_professor
# WHERE avg(pay) > 450  #그룹함수는 where절에서 사용 불가
GROUP BY deptno
HAVING avg(pay) > 300
;
-- <SELECT 쿼리문 순서>	처리순서
-- SELECT				  5
-- FROM					  1
-- WHERE 				  2
-- GROUP BY 			  3
-- HAVING 				  4
-- ORDER BY 			  6

-- #5104
SELECT 
	deptno1 학과, 
	max(weight) - min(weight) 최대최소몸무게차
FROM t_student 
GROUP BY deptno1
HAVING max(weight) - min(weight) >= 30
;





