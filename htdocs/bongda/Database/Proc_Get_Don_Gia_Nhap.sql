DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Get_Don_Gia_Nhap;$$
#
CREATE
	PROCEDURE Proc_Get_Don_Gia_Nhap(
		in_id_doi_truong	VARCHAR(9) 
    )
	BEGIN
		DECLARE	var_ma_doi_bong	VARCHAR(9);
        DECLARE cur_year		INT;
        SET var_ma_doi_bong = (
			SELECT
					ma_doi_bong
				FROM	DoiBong
				WHERE
					id_doi_truong = in_id_doi_truong
				LIMIT 1
        );
        SET	cur_year = YEAR(CURDATE());
        #0
        SELECT
				DonGiaNhapDoiBong.id						AS	user
			,	DATE(DonGiaNhapDoiBong.ngay_gio_nop_don)	AS	ngay_nop_don
            ,	TIME(DonGiaNhapDoiBong.ngay_gio_nop_don)	AS	gio_nop_don
            ,	IFNULL(CauThu.ho_ten_dem,'')				AS	ho_ten_dem
            ,	IFNULL(CauThu.ten,'')						AS	ten
            ,	IFNULL(cur_year - YEAR(CauThu.ngay_sinh),0)	AS  tuoi
			FROM	DonGiaNhapDoiBong
			LEFT OUTER JOIN CauThu ON
					DonGiaNhapDoiBong.id = CauThu.id
			WHERE
				ma_doi_bong = var_ma_doi_bong
			ORDER BY
				DonGiaNhapDoiBong.ngay_gio_nop_don
		;
        #2
        SELECT
			var_ma_doi_bong	AS ma_doi_bong
		;
    END
;
$$
DELIMITER ;