SELECT name, id, lower(id), upper(id) 
FROM t_student
;
#---------------------------------------------
#-- SUBSTR 함수
#-- 구문: SUBSTR( ‘문자열’ 또는 컬럼명,   시작위치,  추출할 글자수 )
#-- 문자열에서 특정 길이의 문자를 추출할 때 사용하는 함수
#-- 시작위치, 음수 가능.
#-- ★ 시작 인덱스가 1부터 시작한다 (인덱스는 1부터 시작)
SELECT substr('ABCDE', 2, 3);

-- #4107
SELECT name, substr(jumin, 1, 6) "생년월일"
FROM t_student 
;
-- #4108
-- t_student 테이블 :
-- jumin 칼럼을 사용해서
-- 태어난 달이 8월인 사람의 이름과 생년월일을 출력하세요 / substr() 사용
SELECT name, substr(jumin, 1, 6) "생년월일"
FROM t_student 
#WHERE substr(jumin, 3, 2) = '08'
WHERE jumin LIKE '__08%'
;
#-------------------------------------------------
# INSTR()
# 주어진 문자열이나 컬럼에서 특정 글자의 위치를 찾아주는 함수 (인덱스 리턴)
SELECT instr('ABCDEFG', 'D');

-- #4110, #4111
SELECT name, tel, instr(tel, ')') "위치"
FROM t_student WHERE deptno1 = 101
;
SELECT name, tel, substr(tel, 1, instr(tel, ')') - 1) "지역번호"
FROM t_student WHERE deptno1 = 101
;
