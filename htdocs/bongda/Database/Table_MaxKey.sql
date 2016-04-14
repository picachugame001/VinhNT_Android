use bongda;
DROP  TABLE IF EXISTS MaxKey;
#
#
CREATE TABLE  MaxKey
(
	table_name			VARCHAR(30)  NOT NULL
,	max_number			INT UNSIGNED NULL DEFAULT 0
,	PRIMARY KEY(
		table_name
	)
);
INSERT 
	INTO MaxKey(
			table_name	
		,	max_number
	)
	VALUES(
			'DoiBong'
		,	0
	);
SELECT * FROM MaxKey;