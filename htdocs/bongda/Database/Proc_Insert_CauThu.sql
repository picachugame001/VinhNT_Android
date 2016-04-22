delimiter $$
DROP PROCEDURE IF EXISTS Proc_Insert_CauThu;
#
CREATE
	PROCEDURE Proc_Insert_CauThu(
		in_id				VARCHAR(9)
	,   in_password        	NVARCHAR(9)
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
		#content
		IF(
			EXISTS(
				SELECT 1
					FROM CauThu
					WHERE
						id = in_id
			)
		)
		THEN
			CALL Proc_Add_Error(1,'id da ton tai',0);
		END IF;
		IF NOT Func_Check_Error() THEN
		BEGIN
						INSERT INTO CauThu
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
			);
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