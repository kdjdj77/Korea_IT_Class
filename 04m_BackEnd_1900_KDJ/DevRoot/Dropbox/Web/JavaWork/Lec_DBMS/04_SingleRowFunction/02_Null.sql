-- Null값과의 산술 연산 결과는 null이다
SELECT name, pay, bonus, pay + bonus
FROM t_professor
;
# IFNULL : NULL값을 만나면 다른 값으로 치환해서 출력하는 함수
# ISNULL : NULL 인지 체크하는 함수  (null 이면 1, 아니면 0 리턴)
# IF : 첫번째 인자가 true 이면  두번째 값을, false 이면 세번째 값!
SELECT bonus, isnull(bonus), ifnull(bonus, 0), if(bonus, bonus, 0)
FROM t_professor 
;
SELECT name, pay, bonus, pay + ifnull(bonus, 0)
FROM t_professor
;
