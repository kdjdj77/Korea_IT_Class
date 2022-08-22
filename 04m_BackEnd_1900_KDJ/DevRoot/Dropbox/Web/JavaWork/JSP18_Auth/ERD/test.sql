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

INSERT INTO t4_user (username, password, name, authorities) VALUES
('USER1', '1234', '회원1', 'ROLE_MEMBER'),
('USER2', '1234', '회원2', null),
('ADMIN1', '1234', '관리자1', 'ROLE_MEMBER,ROLE_ADMIN')
;



