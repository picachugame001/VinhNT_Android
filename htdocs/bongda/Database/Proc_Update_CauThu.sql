DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Update_CauThu;$$
#
CREATE
	PROCEDURE Proc_Update_CauThu(
		in_id				VARCHAR(9)
	,	in_old_password		NVARCHAR(9)		COLLATE utf8_unicode_ci
	,	in_password			NVARCHAR(9)		COLLATE utf8_unicode_ci
	,	in_ho_ten_dem		NVARCHAR(30)	COLLATE utf8_unicode_ci
	,	in_ten				NVARCHAR(20)	COLLATE utf8_unicode_ci
	,	in_gioi_tinh		BOOLEAN
	,	in_ngay_sinh		DATE
	,	in_dia_chi			NVARCHAR(50)	COLLATE utf8_unicode_ci
	,	in_so_cmnd			NVARCHAR(15)	COLLATE utf8_unicode_ci
	,	in_so_dien_thoai	NVARCHAR(15)	COLLATE utf8_unicode_ci
	,	in_email			NVARCHAR(50)	COLLATE utf8_unicode_ci
	)
	BEGIN
		START TRANSACTION;
		CALL Proc_Make_Error_Table();
		#begin content
		CALL Proc_Check_InsertUpdate_SoCMND_CauThu(in_id,in_so_cmnd);
		CALL Proc_Check_InsertUpdate_SoDienThoai_CauThu(in_id,in_so_dien_thoai);
		CALL Proc_Check_InsertUpdate_Email_CauThu(in_id,in_email);
		CALL Proc_Check_Password_CauThu(in_id,in_old_password);
		IF NOT Func_Check_Error() THEN
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

		END IF;
		#end content
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