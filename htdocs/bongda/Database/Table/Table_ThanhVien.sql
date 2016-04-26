use bongda;
DROP  TABLE IF EXISTS ThanhVien;
#
#
CREATE TABLE  ThanhVien
	(
		ma_doi_bong		VARCHAR(9)	NOT NULL 
	,	id_thanh_vien	VARCHAR(9)  NOT NULL 
	,	ngay_gia_nhap	DATE
	,	PRIMARY KEY(
			ma_doi_bong
		,	id_thanh_vien
		)
	)
;
SELECT * FROM ThanhVien;