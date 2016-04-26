DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Get_Don_Gia_Nhap;$$
#
CREATE
	PROCEDURE Proc_Get_Don_Gia_Nhap(
		in_id_doi_truong	VARCHAR(9) 
    )
	BEGIN
		DECLARE	var_ma_doi_bong	VARCHAR(9);
        SET var_ma_doi_bong = (
			SELECT
					ma_doi_bong
				FROM	DoiBong
				WHERE
					id_doi_truong = in_id_doi_truong
        );
        #1
        SELECT
				id
			,	ngay_gio_nop_don
			FROM	DonGiaNhapDoiBong
			WHERE
				ma_doi_bong = var_ma_doi_bong
			ORDER BY
				DonGiaNhapDoiBong.ngay_gio_nop_don
		;
        SELECT
			var_ma_doi_bong	AS ma_doi_bong
		;
    END
;
$$
DELIMITER ;