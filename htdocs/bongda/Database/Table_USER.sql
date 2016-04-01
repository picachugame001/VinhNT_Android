DROP  TABLE IF EXISTS Table_USER;
#
#
CREATE TABLE  Table_USER
(
	id				VARCHAR(9)  NOT NULL 
,   password        NVARCHAR(9) NOT NULL 
,	PRIMARY KEY(
		id
	)
);
INSERT INTO Table_USER
VALUES(
	'abc'
	,'123'
);
INSERT INTO Table_USER
VALUES(
	'def'
	,'456'
);
SELECT * FROM Table_USER;