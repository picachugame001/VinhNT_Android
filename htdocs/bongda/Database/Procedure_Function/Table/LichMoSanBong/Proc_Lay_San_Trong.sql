# RUN ON MySQL Workbench
DELIMITER $$
USE bongda;$$
DROP PROCEDURE if exists Proc_Lay_San_Trong;$$
#
CREATE
	PROCEDURE	Proc_Lay_San_Trong(
		in_ma_cong_ty		VARCHAR(9)
	,	in_ngay_thi_dau		DATE
    )
    BEGIN
		SELECT
				IFNULL(ma_cong_ty,'')	AS	ma_cong_ty
			,	IFNULL(ma_san_bong,'')	AS	ma_san_bong
			,	ngay					AS	ngay
			,	gio_bat_dau				AS	gio_bat_dau
			,	gio_ket_thuc			AS	gio_ket_thuc
			,	IFNULL(gia_thue_san,0)	AS	gio_ket_thuc
			FROM	LichMoSanBong
			WHERE
					ma_cong_ty = in_ma_cong_ty
				AND	(
						ma_tran_dau = ''
					OR	ma_tran_dau IS NULL
				)
				AND	ngay = in_ngay_thi_dau
				AND	ngay IS NOT NULL
				AND	gio_bat_dau IS NOT NULL
				AND	gio_ket_thuc IS NOT NULL
		;
		
    END
;
$$
DELIMITER ;