use bongda;
DROP  TABLE IF EXISTS DoiBong;
#
#
CREATE TABLE  DoiBong
	(
		ma_doi_bong			VARCHAR(9)  NOT NULL 
	,	ten_doi_bong		NVARCHAR(30) NOT NULL
	,	id_doi_truong		VARCHAR(9)  NOT NULL
	,	ngay_tao			DATE NULL
	,	gioi_tinh			BOOLEAN NULL DEFAULT 1
	,	kinh_nghiem			INT UNSIGNED NULL DEFAULT 0
	,	so_tran_thua		INT UNSIGNED NULL DEFAULT 0
	,	so_tran_thang		INT UNSIGNED NULL DEFAULT 0
	,	so_tran_hoa			INT UNSIGNED NULL DEFAULT 0
	,	cap_do				INT UNSIGNED NULL DEFAULT 0
	,	so_thanh_vien		INT UNSIGNED NULL DEFAULT 0
	,	PRIMARY KEY(
			ma_doi_bong
		)
	)
;
INSERT 
	INTO DoiBong(
			ma_doi_bong	
		,	ten_doi_bong
		,	id_doi_truong
	)
	VALUES(
			'bd0000001'
		,	'da nang fc'
		,	'abc'
	);
SELECT * FROM DoiBong;