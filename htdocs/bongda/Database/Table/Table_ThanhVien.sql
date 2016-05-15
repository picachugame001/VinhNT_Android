DELIMITER $$
DROP  TABLE IF EXISTS ThanhVien;$$
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
;$$

DROP PROCEDURE IF EXISTS TEST_Insert_ThanhVien;$$
CREATE
    PROCEDURE TEST_Insert_ThanhVien (
		in_ma_doi_bong		VARCHAR(9)
	,	in_id_thanh_vien	VARCHAR(9)
	,	in_ngay_gia_nhap	DATE
	)
	BEGIN
		INSERT
			INTO ThanhVien
			(
				ma_doi_bong
			,	id_thanh_vien
			,	ngay_gia_nhap
			)
			VALUES(
				in_ma_doi_bong	
			,	in_id_thanh_vien
			,	in_ngay_gia_nhap
			)
		;
    END
;$$
CALL TEST_Insert_ThanhVien(
	'db0000001'
,	'id001'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000002'
,	'id002'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000003'
,	'id003'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000001'
,	'id004'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000002'
,	'id005'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000003'
,	'id006'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000002'
,	'id007'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000003'
,	'id008'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000001'
,	'id009'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000002'
,	'id010'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000003'
,	'id011'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000001'
,	'id012'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000002'
,	'id013'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000003'
,	'id014'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000001'
,	'id015'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000002'
,	'id016'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000003'
,	'id017'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000001'
,	'id018'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000002'
,	'id019'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000003'
,	'id020'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000001'
,	'id021'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000002'
,	'id022'
,	'2016-05-12'
);$$
CALL TEST_Insert_ThanhVien(
	'db0000003'
,	'id023'
,	'2016-05-12'
);$$
SELECT * FROM ThanhVien;$$

DELIMITER ;