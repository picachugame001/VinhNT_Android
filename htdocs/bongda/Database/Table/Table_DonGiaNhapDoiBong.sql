DELIMITER $$
DROP  TABLE IF EXISTS DonGiaNhapDoiBong;$$
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
	)
;$$
DROP PROCEDURE IF EXISTS TEST_Insert_DonGiaNhapDoiBong;$$
CREATE
    PROCEDURE TEST_Insert_DonGiaNhapDoiBong (
			in_ma_doi_bong			VARCHAR(9)
		,	in_id					VARCHAR(9)
		,	in_ngay_gio_nop_don		DATETIME
	)
	BEGIN
		INSERT 
			INTO DonGiaNhapDoiBong(
					ma_doi_bong	
				,	id
                ,	ngay_gio_nop_don
			)
			VALUES(
					in_ma_doi_bong
				,	in_id
                ,	in_ngay_gio_nop_don
			)
		;

    END
;$$

CALL TEST_Insert_DonGiaNhapDoiBong(
	'db0000001'
,	'abc3'
,	' 2016-05-12 12:13:14'
);$$
CALL TEST_Insert_DonGiaNhapDoiBong(
	'db0000002'
,	'abc4'
,	'2016-05-12  13:30:02'
);$$
CALL TEST_Insert_DonGiaNhapDoiBong(
	'db0000003'
,	'abc5'
,	'2016-05-12  13:30:02'
);$$
CALL TEST_Insert_DonGiaNhapDoiBong(
	'db0000001'
,	'abc6'
,	'2016-05-12  13:30:02'
);$$
CALL TEST_Insert_DonGiaNhapDoiBong(
	'db0000002'
,	'abc7'
,	'2016-05-12  13:30:02'
);$$
CALL TEST_Insert_DonGiaNhapDoiBong(
	'db0000003'
,	'abc8'
,	'2016-05-12  13:30:02'
);$$
CALL TEST_Insert_DonGiaNhapDoiBong(
	'db0000001'
,	'abc9'
,	'2016-05-12  13:30:02'
);$$
SELECT * FROM DonGiaNhapDoiBong;$$

DELIMITER ;