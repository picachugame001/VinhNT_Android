DELIMITER $$

DROP TABLE IF EXISTS
	ThamGiaTranDau
;$$
CREATE  TABLE  ThamGiaTranDau(
	ma_tran_dau			VARCHAR(9)
,	ma_doi_bong			VARCHAR(9)
,	ma_thanh_vien		VARCHAR(9)
,	xac_nhan_tham_gia	BOOLEAN
,	PRIMARY KEY(ma_tran_dau,ma_doi_bong,ma_thanh_vien)
);$$
DROP PROCEDURE IF EXISTS TEST_Insert_ThamGiaTranDau;$$
CREATE
    PROCEDURE TEST_Insert_ThamGiaTranDau (
		in_ma_tran_dau			VARCHAR(9)
	,	in_ma_doi_bong			VARCHAR(9)
	,	in_ma_thanh_vien		VARCHAR(9)
	,	in_xac_nhan_tham_gia	BOOLEAN
    )
    BEGIN
		INSERT
			INTO ThamGiaTranDau
			(
				ma_tran_dau
			,	ma_doi_bong
			,	ma_thanh_vien
			,	xac_nhan_tham_gia
			)
			VALUES(
				in_ma_tran_dau
			,	in_ma_doi_bong
			,	in_ma_thanh_vien
			,	in_xac_nhan_tham_gia
			)
		;
    END
;$$

CALL TEST_Insert_ThamGiaTranDau(
	'td0000001'
,	'db0000001'
,	'id001'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000001'
,	'db0000001'
,	'id004'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000001'
,	'db0000001'
,	'id009'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000001'
,	'db0000001'
,	'id012'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000001'
,	'db0000001'
,	'id015'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000001'
,	'db0000002'
,	'id002'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000001'
,	'db0000002'
,	'id005'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000001'
,	'db0000002'
,	'id007'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000001'
,	'db0000002'
,	'id010'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000001'
,	'db0000002'
,	'id013'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000002'
,	'db0000002'
,	'id007'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000002'
,	'db0000002'
,	'id010'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000002'
,	'db0000002'
,	'id013'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000002'
,	'db0000002'
,	'id016'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000002'
,	'db0000002'
,	'id019'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000002'
,	'db0000003'
,	'id003'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000002'
,	'db0000003'
,	'id006'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000002'
,	'db0000003'
,	'id008'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000002'
,	'db0000003'
,	'id011'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000002'
,	'db0000003'
,	'id014'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000003'
,	'db0000003'
,	'id011'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000003'
,	'db0000003'
,	'id014'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000003'
,	'db0000003'
,	'id017'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000003'
,	'db0000003'
,	'id020'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000003'
,	'db0000003'
,	'id023'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000003'
,	'db0000001'
,	'id009'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000003'
,	'db0000001'
,	'id012'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000003'
,	'db0000001'
,	'id015'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000003'
,	'db0000001'
,	'id018'
,	'1'
);$$


CALL TEST_Insert_ThamGiaTranDau(
	'td0000003'
,	'db0000001'
,	'id021'
,	'1'
);$$
SELECT * FROM ThamGiaTranDau;$$


DELIMITER ;