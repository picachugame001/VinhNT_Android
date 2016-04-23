delimiter $$
DROP PROCEDURE IF EXISTS Proc_Insert_DoiBong;
#
CREATE
	PROCEDURE Proc_Insert_DoiBong(
		in_ten_doi_bong		NVARCHAR(30)	COLLATE utf8_unicode_ci
	,	in_id_doi_truong	NVARCHAR(9)		COLLATE utf8_unicode_ci
	)
	BEGIN
		DECLARE var_today DATE;
		DECLARE var_new_key INT;
		DECLARE var_gioi_tinh BOOLEAN;
		START TRANSACTION;
		CALL Proc_Make_Error_Table();
		#check error
		#chec ten doi bong
		CALL Proc_Check_Insert_TenDoiBong_DoiBong(in_ten_doi_bong);
		#
		IF NOT Func_Check_Error() THEN
			SET
				var_today = CURDATE()
			,	var_new_key = Func_Get_MaxKey('DoiBong')
			,	var_gioi_tinh = Func_Get_GioiTinh_CauThu(in_id_doi_truong)
			;
			#	
			INSERT
				INTO DoiBong
				(
					ma_doi_bong
				,	ten_doi_bong
				,	id_doi_truong
				,	ngay_tao
				,	gioi_tinh
				,	kinh_nghiem
				,	so_tran_thua
				,	so_tran_thang
				,	so_tran_hoa
				,	cap_do
				)
				VALUES(
					CONCAT('db',LPAD(var_new_key,7,'0'))
				,	in_ten_doi_bong
				,	in_id_doi_truong
				,	var_today
				,	var_gioi_tinh
				,	0
				,	0
				,	0
				,	0
				,	0
				)
			;
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
delimiter ;