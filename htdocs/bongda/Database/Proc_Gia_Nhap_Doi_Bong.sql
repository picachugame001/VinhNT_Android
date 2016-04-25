delimiter $$
DROP PROCEDURE IF EXISTS Proc_Gia_Nhap_Doi_Bong;
#
CREATE
	PROCEDURE Proc_Gia_Nhap_Doi_Bong(
		in_id				NVARCHAR(9)		COLLATE utf8_unicode_ci
	,	mangdoibong			NVARCHAR(21845)	COLLATE utf8_unicode_ci
	)
	BEGIN
		DECLARE var_to_date DATETIME;
		START TRANSACTION;
		#
		CALL Proc_Make_Error_Table();
		CALL Proc_Create_Insert_Table_DoiBongArray(mangdoibong);
		
		SET var_to_date = NOW();
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
				,	Table_DoiBongArray.id	AS	sub_code
				FROM	Table_DoiBongArray
				LEFT OUTER JOIN	DonGiaNhapDoiBong	ON
					Table_DoiBongArray.ma_doi_bong = DonGiaNhapDoiBong.ma_doi_bong
				WHERE
						DonGiaNhapDoiBong.id = in_id
					AND	DonGiaNhapDoiBong.ma_doi_bong	IS NOT NULL
		;
		#
		IF NOT Func_Check_Error() THEN
			INSERT
				INTO DonGiaNhapDoiBong(
						ma_doi_bong
					,	id
					,	ngay_gio_nop_don
				)
				SELECT
						Table_DoiBongArray.ma_doi_bong
					,	in_id
					,	var_to_date
					FROM Table_DoiBongArray
					
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


