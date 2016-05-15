DELIMITER $$
DROP  TABLE IF EXISTS MaxKey;$$
#
#
CREATE TABLE  MaxKey
	(
		table_name			VARCHAR(30)  NOT NULL
	,	max_number			INT UNSIGNED NULL DEFAULT 0
	,	PRIMARY KEY(
			table_name
		)
	)
;$$
DROP PROCEDURE IF EXISTS TEST_Insert_MaxKey;$$
CREATE
    PROCEDURE TEST_Insert_MaxKey (
			in_table_name			VARCHAR(30)
		,	in_max_number			INT
	)
	BEGIN
		INSERT 
			INTO MaxKey
			(
					table_name
				,	max_number
			)
			VALUES(
					in_table_name
				,	in_max_number
			)
		;
    END
;$$
CALL TEST_Insert_MaxKey(
	'DoiBong'
,	4
);$$
CALL TEST_Insert_MaxKey(
	'TranDau'
,	4
);$$
SELECT * FROM MaxKey;$$