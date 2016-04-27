DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Check_Don_Gia_Nhap;$$
#
CREATE
	PROCEDURE Proc_Check_Don_Gia_Nhap(
		in_id	VARCHAR(9)		#COLLATE utf8_unicode_ci
		#TABLE Table_DoiBongArray
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
				,	Table_DoiBongArray.id-1	AS	sub_code
				FROM	Table_DoiBongArray
				LEFT OUTER JOIN	ThanhVien	ON
						Table_DoiBongArray.ma_doi_bong = ThanhVien.ma_doi_bong
					AND ThanhVien.id_thanh_vien = in_id
				LEFT OUTER JOIN	DoiBong	ON
						Table_DoiBongArray.ma_doi_bong = DoiBong.ma_doi_bong
					AND DoiBong.id_doi_truong = in_id
				WHERE
						ThanhVien.ma_doi_bong	IS NOT NULL
					OR	DoiBong.ma_doi_bong		IS NOT NULL
		;
		#
		INSERT
			INTO ERRORS(
				error_code
			,	description
			,	sub_code
			)	
			SELECT
					10						AS	error_code
				,	'da dang ky'			AS	description
				,	Table_DoiBongArray.id-1	AS	sub_code
				FROM	Table_DoiBongArray
				LEFT OUTER JOIN	DonGiaNhapDoiBong	ON
						Table_DoiBongArray.ma_doi_bong = DonGiaNhapDoiBong.ma_doi_bong
					AND	DonGiaNhapDoiBong.id = in_id
				LEFT OUTER JOIN	ThanhVien	ON
						Table_DoiBongArray.ma_doi_bong = ThanhVien.ma_doi_bong
					AND ThanhVien.id_thanh_vien = in_id
				LEFT OUTER JOIN	DoiBong	ON
						Table_DoiBongArray.ma_doi_bong = DoiBong.ma_doi_bong
					AND DoiBong.id_doi_truong = in_id
				WHERE
						DonGiaNhapDoiBong.ma_doi_bong	IS NOT NULL
					AND	ThanhVien.ma_doi_bong			IS NULL
					AND	DoiBong.ma_doi_bong				IS NULL
		;
		
	END
;
$$
DELIMITER ;