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