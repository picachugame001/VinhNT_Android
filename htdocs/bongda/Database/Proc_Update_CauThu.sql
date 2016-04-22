delimiter $$
DROP PROCEDURE IF EXISTS Proc_Update_CauThu;
#
CREATE
	PROCEDURE Proc_Update_CauThu(
		in_id				VARCHAR(9)
	,	in_password			NVARCHAR(9)
	,	in_ho_ten_dem		NVARCHAR(30)
	,	in_ten				NVARCHAR(20)
	,	in_gioi_tinh		BOOLEAN
	,	in_ngay_sinh		DATE
	,	in_dia_chi			NVARCHAR(50)
	,	in_so_cmnd			NVARCHAR(15)
	,	in_so_dien_thoai	NVARCHAR(15)
	,	in_email			NVARCHAR(50)
	)
	BEGIN
		START TRANSACTION;
		CALL Proc_Make_Error_Table();
		UPDATE CauThu
			SET
				ho_ten_dem		= in_ho_ten_dem
			,	ten				= in_ten
			,	gioi_tinh		= in_gioi_tinh
			,	ngay_sinh		= in_ngay_sinh
			,	dia_chi			= in_dia_chi
			,	so_cmnd			= in_so_cmnd
			,	so_dien_thoai	= in_so_dien_thoai
			,	email			= in_email
			WHERE
				id = in_id
		;
		IF(in_password != '' AND in_password IS NOT NULL) THEN
		BEGIN
			UPDATE CauThu
				SET
					password	= in_password
				WHERE
					id = in_id
			;
		END;
		END IF; 
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
COMMIT;
$$
delimiter ;