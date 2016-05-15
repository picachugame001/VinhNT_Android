DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Thach_Dau_Tat_Ca;$$
#
CREATE
	PROCEDURE Proc_Thach_Dau_Tat_Ca(
		in_ma_cong_ty		VARCHAR(9)
	,	in_ma_san_bong		VARCHAR(9)
	,	in_ngay				DATE
	,	in_gio_bat_dau		TIME
	,	in_gio_ket_thuc		TIME
	,	in_id_doi_truong	VARCHAR(9)	
	)
	BEGIN
		DECLARE var_ma_tran_dau VARCHAR(9);
		DECLARE var_ma_doi_bong VARCHAR(9);
		START TRANSACTION;
		CALL Proc_Make_Error_Table();
		#
		CALL	Froc_check_dat_san_bong(
					in_ma_cong_ty
				,	in_ma_san_bong
				,	in_ngay
				,	in_gio_bat_dau
				,	in_gio_ket_thuc
				);
		IF NOT Func_Check_Error() THEN
			SET var_ma_tran_dau = Func_Get_MaxKey('TranDau');
			SET var_ma_doi_bong = Func_get_ma_doi_bong_from_di_doi_truong(in_id_doi_truong);
			INSERT
				INTO TranDau
				(
					ma_tran_dau
				,	doi_de_nghi
				,	doi_chap_nhan
				,	ngay_thach_dau
				,	gio_thach_dau
				,	diem_doi_1
				,	diem_doi_2
				,	han_xac_nhan
				)
				VALUES(
					var_ma_tran_dau
				,	var_ma_doi_bong
				,	''
				,	CURDATE()
				,	CURTIME()
				,	0
				,	0
				,	CURDATE()
				)
			;
			UPDATE	LichMoSanBong
				SET ma_tran_dau = var_ma_tran_dau
				WHERE
						ma_cong_ty = in_ma_cong_ty
					AND	ma_san_bong = in_ma_san_bong
					AND	ngay = in_ngay
					AND	gio_bat_dau = in_gio_bat_dau
					AND gio_ket_thuc = in_gio_ket_thuc
			;
			
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
DELIMITER ;