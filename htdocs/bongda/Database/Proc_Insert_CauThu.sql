DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Insert_CauThu;
#
CREATE
	PROCEDURE Proc_Insert_CauThu(
		in_id				VARCHAR(9) 
	,   in_password        	NVARCHAR(9) COLLATE utf8_unicode_ci
	,	in_ho_ten_dem		NVARCHAR(30) COLLATE utf8_unicode_ci
	,	in_ten				NVARCHAR(20) COLLATE utf8_unicode_ci
	,	in_gioi_tinh		BOOLEAN
	,	in_ngay_sinh		DATE
	,	in_dia_chi			NVARCHAR(50) COLLATE utf8_unicode_ci
	,	in_so_cmnd			NVARCHAR(15) COLLATE utf8_unicode_ci
	,	in_so_dien_thoai	NVARCHAR(15) COLLATE utf8_unicode_ci
	,	in_email			NVARCHAR(50) COLLATE utf8_unicode_ci
	)
	BEGIN
		START TRANSACTION;
		CALL Proc_Make_Error_Table();
		#content
		CALL Proc_Check_Insert_Id_CauThu(in_id);
		CALL Proc_Check_InsertUpdate_SoCMND_CauThu(in_id,in_so_cmnd);
		CALL Proc_Check_InsertUpdate_SoDienThoai_CauThu(in_id,in_so_dien_thoai);
		CALL Proc_Check_InsertUpdate_Email_CauThu(in_id,in_email);
		IF NOT Func_Check_Error() THEN
		BEGIN
			INSERT 
				INTO CauThu
				(
						id
					,   password
					,	ho_ten_dem
					,	ten
					,	gioi_tinh
					,	ngay_sinh
					,	dia_chi
					,	so_cmnd
					,	so_dien_thoai
					,	email
				)
				VALUES(
					in_id
				,	in_password
				,	in_ho_ten_dem
				,	in_ten
				,	in_gioi_tinh
				,	in_ngay_sinh
				,	in_dia_chi
				,	in_so_cmnd
				,	in_so_dien_thoai
				,	in_email
				)
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
$$