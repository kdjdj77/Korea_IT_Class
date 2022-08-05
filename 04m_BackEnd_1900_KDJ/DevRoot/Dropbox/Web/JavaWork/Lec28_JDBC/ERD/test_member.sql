
/* Drop Tables */

DROP TABLE test_member;




/* Create Tables */

CREATE TABLE test_member
(
	mb_no integer,
	mb_name varchar(40),
	mb_birthdate datetime
);

SELECT * FROM test_member;
DELETE FROM test_member;

INSERT INTO test_member(mb_birthdate) values('2021-01-03');

CREATE TABLE test_member2
(
	id integer PRIMARY KEY AUTO_INCREMENT,
	name varchar(40),
	regdate datetime DEFAULT now()
);

SELECT * FROM test_member2;

INSERT INTO test_member2(name) VALUE('노진수');

