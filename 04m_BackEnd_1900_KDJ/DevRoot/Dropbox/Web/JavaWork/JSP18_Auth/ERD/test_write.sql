SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS t4_user;
DROP TABLE IF EXISTS t4_write;




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
	wr_id int NOT NULL AUTO_INCREMENT,
	wr_subject varchar(200) NOT NULL,
	wr_content text,
	wr_name varchar(20) NOT NULL,
	wr_viewcnt int DEFAULT 0 CHECK(wr_viewcnt >= 0),
	wr_regdate datetime DEFAULT now(),
	PRIMARY KEY (wr_id)
);



