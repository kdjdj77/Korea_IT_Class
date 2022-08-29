SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS t4_comment;
DROP TABLE IF EXISTS t4_file;
DROP TABLE IF EXISTS t4_write;
DROP TABLE IF EXISTS t4_user;




/* Create Tables */

CREATE TABLE t4_comment
(
	id int NOT NULL AUTO_INCREMENT,
	user_id int NOT NULL,
	write_id int NOT NULL,
	content text NOT NULL,
	regdate datetime DEFAULT now(),
	PRIMARY KEY (id),
	UNIQUE (id)
);


CREATE TABLE t4_file
(
	id int NOT NULL AUTO_INCREMENT,
	write_id int NOT NULL,
	source varchar(100) NOT NULL,
	file varchar(100) NOT NULL,
	PRIMARY KEY (id)
);


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

ALTER TABLE t4_comment
	ADD FOREIGN KEY (user_id)
	REFERENCES t4_user (id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;


ALTER TABLE t4_write
	ADD FOREIGN KEY (user_id)
	REFERENCES t4_user (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE t4_comment
	ADD FOREIGN KEY (write_id)
	REFERENCES t4_write (id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;


ALTER TABLE t4_file
	ADD FOREIGN KEY (write_id)
	REFERENCES t4_write (id)
	ON UPDATE RESTRICT
	ON DELETE CASCADE
;



