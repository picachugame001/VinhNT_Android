DELIMITER $$

DROP TABLE IF EXISTS
	TranDau
;$$
CREATE  TABLE  TranDau(
	ma_tran_dau		VARCHAR(9)
,	doi_de_nghi		VARCHAR(9)
,	doi_chap_nhan	VARCHAR(9)
,	ngay_thach_dau	DATE
,	gio_thach_dau	TIME
,	diem_doi_1		INT
,	diem_doi_2		INT
,	han_xac_nhan	DATE
,	PRIMARY KEY(ma_tran_dau)
);$$

DROP PROCEDURE IF EXISTS TEST_Insert_TranDau;$$
CREATE
    PROCEDURE TEST_Insert_TranDau (
			in_ma_tran_dau		VARCHAR(9)
		,	in_doi_de_nghi		VARCHAR(9)
		,	in_doi_chap_nhan	VARCHAR(9)
		,	in_ngay_thach_dau	DATE
		,	in_gio_thach_dau	TIME
		,	in_diem_doi_1		INT
		,	in_diem_doi_2		INT
		,	in_han_xac_nhan		DATE
	)
    BEGIN
		INSERT
			INTO TranDau
			(
				ma_tran_dau
			,	doi_de_nghi
			,	doi_chap_nhan
			,	ngay_thach_dau
			,	gio_thach_dau
			,	diem_doi_1
			,	diem_doi_2
			,	han_xac_nhan
			)
			VALUES(
				in_ma_tran_dau
			,	in_doi_de_nghi
			,	in_doi_chap_nhan
			,	in_ngay_thach_dau
			,	in_gio_thach_dau
			,	in_diem_doi_1
			,	in_diem_doi_2
			,	in_han_xac_nhan
			)
		;
	END
;$$
CALL TEST_Insert_TranDau(
	'td0000001'
,	'db0000001'
,	'db0000002'
,	'2016-05-13'
,	'12:30:30'
,	0
,	0
,	'2016-05-13'
);$$
CALL TEST_Insert_TranDau(
	'td0000002'
,	'db0000002'
,	'db0000003'
,	'2016-05-13'
,	'14:30:30'
,	'0'
,	'0'
,	'2016-05-13'
);$$
CALL TEST_Insert_TranDau(
	'td0000003'
,	'db0000003'
,	'db0000001'
,	'2016-05-13'
,	'16:30:30'
,	'0'
,	'0'
,	'2016-05-13'
);$$
SELECT * FROM TranDau;$$
DELIMITER ;