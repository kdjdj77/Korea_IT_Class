SHOW tables;

SELECT TABLE_NAME FROM information_schema.TABLES
WHERE TABLE_SCHEMA = 'mydb609'
AND TABLE_NAME LIKE 't6_%'
;

SELECT * FROM t6_authority;
SELECT * FROM t6_user;
SELECT * FROM t6_user_authorities;
SELECT * FROM t6_write ORDER BY id DESC;
SELECT * FROM t6_comment ORDER BY id DESC;
SELECT * FROM t6_file ORDER BY id DESC;

# 페이징 테스트용 다량의 데이터
INSERT INTO t6_write(user_id, subject, content, reg_date)
SELECT user_id, subject, content, now() FROM t6_write;

DELETE FROM t6_write WHERE id > 4;

