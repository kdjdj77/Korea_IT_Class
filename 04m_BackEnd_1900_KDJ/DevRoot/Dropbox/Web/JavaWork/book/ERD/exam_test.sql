-- 기본데이터 삽입
INSERT INTO exam_book
	(bk_title, bk_summary, bk_price)
VALUES
	('책01', '이 책은 책01입니다', '11000'),
	('책02', '이 책은 책02입니다', '22000'),
	('책03', '이 책은 책03입니다', '10000'),
	('책04', '이 책은 책04입니다', '15000'),
	('책05', '이 책은 책05입니다', '14300')
;


SELECT * FROM exam_book ORDER BY bk_id DESC;
