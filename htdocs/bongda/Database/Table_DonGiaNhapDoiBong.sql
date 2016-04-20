use bongda;
DROP  TABLE IF EXISTS DonGiaNhapDoiBong;
#
#
CREATE TABLE  DonGiaNhapDoiBong
(
	ma_doi_bong			VARCHAR(9)  NOT NULL 
,	id					VARCHAR(9)  NOT NULL 
,	ngay_gio_nop_don	DATETIME
,	PRIMARY KEY(
		ma_doi_bong
	,	id
	)
);
INSERT 
	INTO DonGiaNhapDoiBong(
			ma_doi_bong	
		,	id
	)
	VALUES(
			'bd0000001'
		,	'abc'
	);
SELECT * FROM DonGiaNhapDoiBong;