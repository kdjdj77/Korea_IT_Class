SELECT 
	id "id", 
	username "username", 
	password "password",
	name "name", 
	authorities "authorities", 
	regdate "regdate" 
from t4_user 
order by id desc;

ALTER TABLE t4_user AUTO_INCREMENT = 1;

-- 샘플사용자
INSERT INTO t4_user (username, password, name, authorities) VALUES
('USER1', '1234', '회원1', 'ROLE_MEMBER'),
('USER2', '1234', '회원2', null),
('ADMIN1', '1234', '관리자1', 'ROLE_MEMBER,ROLE_ADMIN')
;

-- 샘플 글
INSERT INTO t4_write (user_id, subject, content) VALUES
(1, '제목입니다1', '내용입니다1'),
(1, '제목입니다2', '내용입니다2'),
(3, '제목입니다3', '내용입니다3'),
(3, '제목입니다4', '내용입니다4')
;

SELECT * FROM t4_user ORDER BY id DESC;
SELECT * FROM t4_write ORDER BY id DESC;

-- 글 조회 (작성자 포함 JOIN)
SELECT w.id, w.subject, w.content, w.viewcnt, w.regdate,
	u.id , u.username, u.password , u.name , u.authorities , u.regdate 
FROM t4_write w, t4_user u
WHERE w.user_id  = u.id
ORDER BY w.id DESC
;




