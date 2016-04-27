# RUN ON MySQL Workbench
DELIMITER $$
USE bongda;$$
DROP PROCEDURE if exists Proc_Check_Gia_Nhap;$$
#
CREATE
	PROCEDURE	Proc_Check_Gia_Nhap(
		in_ma_doi_bong		VARCHAR(9)
    )
    BEGIN
		INSERT
			INTO ERRORS(
				error_code
			,	description
			,	sub_code
			)
			SELECT
					11						AS	error_code
				,	'da la thanh vien'		AS	description
				,	Table_DanhSachDuyet.id-1	AS	sub_code
				FROM	Table_DanhSachDuyet
				LEFT OUTER JOIN	ThanhVien	ON
						in_ma_doi_bong = ThanhVien.ma_doi_bong
					AND Table_DanhSachDuyet.id_thanh_vien = ThanhVien.id_thanh_vien
				LEFT OUTER JOIN	DoiBong	ON
						in_ma_doi_bong = DoiBong.ma_doi_bong
					AND Table_DanhSachDuyet.id_thanh_vien = DoiBong.id_doi_truong
				WHERE
						ThanhVien.ma_doi_bong	IS NOT NULL
					OR	DoiBong.ma_doi_bong		IS NOT NULL
		;
        INSERT
			INTO ERRORS(
				error_code
			,	description
			,	sub_code
			)
			SELECT
					12								AS	error_code
				,	'vuot qua so doi gia nhap'		AS	description
				,	Table_DanhSachDuyet.id-1			AS	sub_code
				FROM	Table_DanhSachDuyet
				LEFT OUTER JOIN	CauThu	ON
								Table_DanhSachDuyet.id_thanh_vien = CauThu.id
				LEFT OUTER JOIN	ThanhVien	ON
								in_ma_doi_bong = ThanhVien.ma_doi_bong
							AND Table_DanhSachDuyet.id_thanh_vien = ThanhVien.id_thanh_vien
				LEFT OUTER JOIN	DoiBong	ON
								in_ma_doi_bong = DoiBong.ma_doi_bong
							AND Table_DanhSachDuyet.id_thanh_vien = DoiBong.id_doi_truong
				WHERE
								ThanhVien.ma_doi_bong	IS NULL
							AND DoiBong.ma_doi_bong		IS NULL
                            AND CauThu.id 				IS NOT NULL
							AND	CauThu.so_doi_bong + 1 > Func_Get_Max_Doi_Bong_Gia_Nhap()
						
			;
	END
;
$$
DELIMITER ;