delimiter //
DROP PROCEDURE IF EXISTS Proc_Tim_Kiem_Doi_Bong;
#
CREATE PROCEDURE Proc_Tim_Kiem_Doi_Bong(
)
BEGIN
	SELECT
			IFNULL(ma_doi_bong,'')  AS ma_doi_bong
		,	IFNULL(ten_doi_bong,'') AS ten_doi_bong
		,	IFNULL(gioi_tinh,0)     AS gioi_tinh
		,	IFNULL(cap_do,0)        AS cap_do
		,	IFNULL(so_thanh_vien,0) AS so_thanh_vien
		FROM DoiBong
	;
END
//


