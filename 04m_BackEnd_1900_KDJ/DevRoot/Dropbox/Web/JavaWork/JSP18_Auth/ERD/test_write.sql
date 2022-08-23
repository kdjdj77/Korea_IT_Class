SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS t4_write;
DROP TABLE IF EXISTS t4_user;




/* Create Tables */

CREATE TABLE t4_user
(
	id int NOT NULL AUTO_INCREMENT,
	username varchar(80) NOT NULL,
	password varchar(100) NOT NULL,
	name varchar(80) NOT NULL,
	authorities varchar(200) DEFAULT 'ROLE_MEMBER',
	regdate datetime DEFAULT now(),
	PRIMARY KEY (id),
	UNIQUE (username)
);


CREATE TABLE t4_write
(
	id int NOT NULL AUTO_INCREMENT,
	user_id int NOT NULL,
	subject varchar(200) NOT NULL,
	content longtext,
	viewcnt int DEFAULT 0 CHECK(viewcnt >= 0),
	regdate datetime DEFAULT now(),
	PRIMARY KEY (id)
);



/* Create Foreign Keys */

ALTER TABLE t4_write
	ADD FOREIGN KEY (user_id)
	REFERENCES t4_user (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



