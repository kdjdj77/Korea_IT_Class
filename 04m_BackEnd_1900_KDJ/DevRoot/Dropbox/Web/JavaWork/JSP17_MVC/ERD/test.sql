-- 기본데이터 삽입
INSERT INTO test_write
	(wr_subject, wr_content, wr_name)
VALUES
	('첫째글:방가요', '안녕하세요', '김희철'),
	('둘째글:헤헤헤','1111', '김수길'),
	('세째글:힘내세요', '7394', '최진덕'),
	('네째글: ... ', '9090', '이혜원'),
	('다섯째글: 게시판', '7531', '박수찬')
;


SELECT * FROM test_write ORDER BY wr_id DESC;
