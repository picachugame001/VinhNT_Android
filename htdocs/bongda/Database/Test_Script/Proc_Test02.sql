delimiter $$
DROP PROCEDURE IF EXISTS Proc_Test02;
#
CREATE PROCEDURE Proc_Test02(
)
BEGIN
	
	DECLARE string_test NVARCHAR(100);
	DECLARE inout_position INT;
	DECLARE string_out NVARCHAR(100);
	DECLARE stop_flag BOOLEAN;
	#
	CREATE TEMPORARY TABLE IF NOT EXISTS temp_table_01
	(
		values01 NVARCHAR(100)
	);
	#
	SET string_test = '##sdjklh##239syfhdj21##30sdlf2#h3posdf##';
	SET inout_position = 1;
	SET stop_flag = false;
	#
	WHILE NOT stop_flag DO
		CALL	Proc_Split_Array_String(
					string_test
				,	inout_position
				,	'##'
				,	string_out
				,	stop_flag
				);
		INSERT
			INTO temp_table_01
			(values01)
			VALUES(string_out)
		;
	END WHILE;
	#
	SELECT string_test AS string_input;
	SELECT '##' AS delimiter_test;
	SELECT * FROM temp_table_01;
	#
	
	
	DROP TEMPORARY TABLE IF EXISTS
		temp_table_01
	;
END;
$$
delimiter ;