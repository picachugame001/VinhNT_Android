# RUN ON MySQL Workbench
DELIMITER $$
USE bongda;$$
DROP PROCEDURE IF EXISTS Proc_Create_Insert_Table_DanhSachDuyet;$$
CREATE
	PROCEDURE	Proc_Create_Insert_Table_DanhSachDuyet(
		in_mang_id			NVARCHAR(21845) 
    )
    BEGIN
		DECLARE var_to_date DATE ;
		DECLARE inout_position_row,inout_position_col INT;
		DECLARE string_out_row,string_out_col NVARCHAR(100);
		DECLARE stop_flag_row,stop_flag_col BOOLEAN;
		START TRANSACTION;
        CALL Proc_Make_Error_Table();
        #
		DROP TEMPORARY TABLE IF EXISTS
			Table_DanhSachDuyet
		;
        #
		CREATE TEMPORARY TABLE IF NOT EXISTS Table_DanhSachDuyet
			(
				id INT NOT NULL AUTO_INCREMENT
			,	id_thanh_vien	NVARCHAR(9) COLLATE utf8_unicode_ci
			,	PRIMARY KEY(id,id_thanh_vien)
			)
		;
        #
        SET inout_position_row = 1;
		SET stop_flag_row = FALSE;
		SET string_out_row = '';
        #
        WHILE NOT stop_flag_row DO
			CALL	Proc_Split_Array_String(
				in_mang_id
			,	inout_position_row
			,	Func_Get_Row_Delimiter()
			,	string_out_row
			,	stop_flag_row
			);
            #process column
            SET string_out_col = '';
			SET inout_position_col = 1;
			SET stop_flag_col = FALSE;
            CALL	Proc_Split_Array_String(
				string_out_row
			,	inout_position_col
			,	Func_Get_Column_Delimiter()
			,	string_out_col
			,	stop_flag_col
			);
            INSERT
				INTO Table_DanhSachDuyet(
					id_thanh_vien
				)
				VALUES(
						string_out_col
				)
			;
			#
        END WHILE;
        #
        IF Func_Check_Error() THEN
			SELECT
					*
				FROM ERRORS
			;
			ROLLBACK;
		ELSE
			COMMIT;
		END IF;
    END
;
$$
DELIMITER ;