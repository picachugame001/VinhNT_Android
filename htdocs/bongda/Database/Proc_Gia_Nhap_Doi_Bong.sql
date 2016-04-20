delimiter //
DROP PROCEDURE IF EXISTS Proc_Gia_Nhap_Doi_Bong;
#
CREATE PROCEDURE Proc_Gia_Nhap_Doi_Bong(
	in_ma_doi_bong		NVARCHAR(9)
,	in_id				NVARCHAR(9)
,	in_current_datetime	DATETIME
)
BEGIN
	INSERT
		INTO	DonGiaNhapDoiBong
		(
				ma_doi_bong
			,	id
			,	ngay_gio_nop_don
		)
		VALUES(
			in_ma_doi_bong
		,	in_id
		,	in_current_datetime
		)
	;
END
//


