# RUN ON MySQL Workbench
DELIMITER $$
USE bongda;$$
DROP PROCEDURE if exists Proc_Duyet_Don_Gia_Nhap;$$
#
CREATE
	PROCEDURE	Proc_Duyet_Don_Gia_Nhap(
		in_ma_doi_bong		VARCHAR(9)
	,	in_mang_id			NVARCHAR(21845)
    )
    BEGIN
		DECLARE var_to_date DATE ;
		DECLARE so_thanh_vien INT;
		START TRANSACTION;
        CALL Proc_Make_Error_Table();
        #
        CALL Proc_Create_Insert_Table_DanhSachDuyet(in_mang_id);
        CALL Proc_Check_Gia_Nhap(in_ma_doi_bong);
        #Func_Get_Max_Doi_Bong_Gia_Nhap
        IF NOT Func_Check_Error() THEN
			
			SET var_to_date = CURDATE();
			INSERT
				INTO ThanhVien(
					ma_doi_bong
				,	id_thanh_vien
                ,	ngay_gia_nhap
                )
                SELECT
						in_ma_doi_bong
					,	Table_DanhSachDuyet.id_thanh_vien
                    ,	var_to_date
                    FROM Table_DanhSachDuyet
			;
            DELETE		DonGiaNhapDoiBong
				FROM Table_DanhSachDuyet
				LEFT OUTER JOIN DonGiaNhapDoiBong 	ON
						DonGiaNhapDoiBong.ma_doi_bong = in_ma_doi_bong
					AND Table_DanhSachDuyet.id_thanh_vien = DonGiaNhapDoiBong.id
			;	
			UPDATE Table_DanhSachDuyet
				LEFT OUTER JOIN	CauThu	ON
					Table_DanhSachDuyet.id_thanh_vien = CauThu.id
				SET
					CauThu.so_doi_bong = CauThu.so_doi_bong + 1
				WHERE
					TRUE
			;
            SET so_thanh_vien = (
				SELECT COUNT(id_thanh_vien)
					FROM
						Table_DanhSachDuyet
            )
            ;
			UPDATE	DoiBong
				SET
					DoiBong.so_thanh_vien = DoiBong.so_thanh_vien + so_thanh_vien
				WHERE
					ma_doi_bong = in_ma_doi_bong
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