DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Create_Insert_Table_DoiBongArray;
#
CREATE
	PROCEDURE Proc_Create_Insert_Table_DoiBongArray(
		mangdoibong			NVARCHAR(21845)	COLLATE utf8_unicode_ci
	)
	BEGIN
		#
		DECLARE inout_position,inout_position_col INT;
		DECLARE string_out,string_out_col NVARCHAR(100);
		DECLARE stop_flag,stop_flag_col BOOLEAN;
		#
		DROP TEMPORARY TABLE IF EXISTS
			Table_DoiBongArray
		;
		CREATE TEMPORARY TABLE IF NOT EXISTS Table_DoiBongArray
			(
				id INT NOT NULL AUTO_INCREMENT
			,	ma_doi_bong	NVARCHAR(9) COLLATE utf8_unicode_ci
			,	PRIMARY KEY(id,ma_doi_bong)
			)
		;
		
		SET inout_position = 1;
		SET stop_flag = FALSE;
		SET string_out = '';
		#
		WHILE NOT stop_flag DO
			CALL	Proc_Split_Array_String(
				mangdoibong
			,	inout_position
			,	Func_Get_Row_Delimiter()
			,	string_out
			,	stop_flag
			);
			#
			SET string_out_col = '';
			SET inout_position_col = 1;
			SET stop_flag_col = FALSE;
			CALL	Proc_Split_Array_String(
				string_out
			,	inout_position_col
			,	Func_Get_Column_Delimiter()
			,	string_out_col
			,	stop_flag_col
			);
			INSERT
				INTO Table_DoiBongArray(
					ma_doi_bong
				)
				VALUES(
						string_out_col
				)
			;
		END WHILE;
	END	
;
$$
DELIMITER ;