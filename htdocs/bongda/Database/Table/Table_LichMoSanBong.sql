DELIMITER $$

DROP TABLE IF EXISTS
	LichMoSanBong
;$$
CREATE  TABLE  LichMoSanBong(
	ma_cong_ty		VARCHAR(9)
,	ma_san_bong		VARCHAR(9)
,	ngay			DATE
,	gio_bat_dau		TIME
,	gio_ket_thuc	TIME
,	gia_thue_san	INT
,	id_nguoi_thue	VARCHAR(9)
,	tien_dat_coc	INT
,	ma_tran_dau		VARCHAR(9)
,	PRIMARY KEY(ma_cong_ty,ma_san_bong,ngay,gio_bat_dau,gio_ket_thuc)
);$$

DROP PROCEDURE IF EXISTS TEST_Insert_LichMoSanBong;$$

CREATE
    PROCEDURE TEST_Insert_LichMoSanBong (
		in_ma_cong_ty		VARCHAR(9)
	,	in_ma_san_bong		VARCHAR(9)
	,	in_ngay				DATE
	,	in_gio_bat_dau		TIME
	,	in_gio_ket_thuc		TIME
	,	in_gia_thue_san		INT
	,	in_id_nguoi_thue	VARCHAR(9)
	,	in_tien_dat_coc		INT
	,	in_ma_tran_dau		VARCHAR(9)
	)
    BEGIN
		INSERT
			INTO	LichMoSanBong
			(
				ma_cong_ty
			,	ma_san_bong
			,	ngay
			,	gio_bat_dau
			,	gio_ket_thuc
			,	gia_thue_san
			,	id_nguoi_thue
			,	tien_dat_coc
			,	ma_tran_dau
			)
			VALUES(
				in_ma_cong_ty
			,	in_ma_san_bong
			,	in_ngay
			,	in_gio_bat_dau
			,	in_gio_ket_thuc
			,	in_gia_thue_san
			,	in_id_nguoi_thue
			,	in_tien_dat_coc
			,	in_ma_tran_dau
			)
		;    
    END
;$$

SET @date_test = '2016-05-28';$$
CALL TEST_Insert_LichMoSanBong(
	'ct0000001'
,	'sb0000001'
,	@date_test
,	'13:00:00'
,	'14:00:00'
,	'200000'
,	'abc'
,	'0'
,	'td0000001'
);$$
CALL TEST_Insert_LichMoSanBong(
	'ct0000001'
,	'sb0000002'
,	@date_test
,	'14:00:00'
,	'15:00:00'
,	'200000'
,	'abc1'
,	'0'
,	'td0000002'
);$$
CALL TEST_Insert_LichMoSanBong(
	'ct0000002'
,	'sb0000003'
,	@date_test
,	'15:00:00'
,	'16:00:00'
,	'200000'
,	'abc2'
,	'0'
,	'td0000003'
);$$

CALL TEST_Insert_LichMoSanBong(
	'ct0000002'
,	'sb0000003'
,	@date_test
,	'16:00:00'
,	'17:00:00'
,	'200000'
,	'abc2'
,	'0'
,	''
);$$
SET @date_test = '2016-05-30';$$
CALL TEST_Insert_LichMoSanBong(
	'ct0000001'
,	'sb0000001'
,	@date_test
,	'16:00:00'
,	'17:00:00'
,	'200000'
,	'abc2'
,	'0'
,	''
);$$

SELECT * FROM LichMoSanBong;$$
DROP PROCEDURE IF EXISTS Froc_check_dat_san_bong;$$
CREATE
    PROCEDURE Froc_check_dat_san_bong (
		in_ma_cong_ty		VARCHAR(9)
	,	in_ma_san_bong		VARCHAR(9)
	,	in_ngay				DATE
	,	in_gio_bat_dau		TIME
	,	in_gio_ket_thuc		TIME
	)
    BEGIN
		IF EXISTS(
				SELECT
						1
					FROM	LichMoSanBong
					WHERE
							ma_cong_ty = in_ma_cong_ty
						AND	ma_san_bong = in_ma_san_bong
						AND	ngay = in_ngay
						AND	gio_bat_dau = in_gio_bat_dau
						AND	gio_ket_thuc = in_gio_ket_thuc
						AND	(
								ma_tran_dau != ''
							AND	ma_tran_dau IS NOT NULL
						)
			)
			THEN
				CALL Proc_Add_Error(15,'da co nguoi dat sân',0);
			END IF
		;
	END
;$$

DELIMITER ;