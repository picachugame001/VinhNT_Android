DELIMITER $$
DROP  TABLE IF EXISTS DoiBong;$$
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
;$$
#procedure test
DROP PROCEDURE IF EXISTS TEST_Insert_DoiBong;$$
CREATE
    PROCEDURE TEST_Insert_DoiBong (
		in_ma_doi_bong			VARCHAR(9)
	,	in_ten_doi_bong			NVARCHAR(30)
	,	in_id_doi_truong		VARCHAR(9)
	,	in_ngay_tao				DATE
	,	in_gioi_tinh			BOOLEAN
	,	in_kinh_nghiem			INT
	,	in_so_tran_thua			INT
	,	in_so_tran_thang		INT
	,	in_so_tran_hoa			INT
	,	in_cap_do				INT
	,	in_so_thanh_vien		INT
    )
    BEGIN
		INSERT 
			INTO DoiBong(
					ma_doi_bong
				,	ten_doi_bong
				,	id_doi_truong
				,	ngay_tao
				,	gioi_tinh
				,	kinh_nghiem
				,	so_tran_thua
				,	so_tran_thang
				,	so_tran_hoa
				,	cap_do
				,	so_thanh_vien 
			)
			VALUES(
					in_ma_doi_bong
				,	in_ten_doi_bong
				,	in_id_doi_truong
				,	in_ngay_tao
				,	in_gioi_tinh
				,	in_kinh_nghiem
				,	in_so_tran_thua
				,	in_so_tran_thang
				,	in_so_tran_hoa
				,	in_cap_do
				,	in_so_thanh_vien
			)
		;
    END
;$$
CALL TEST_Insert_DoiBong(
		'db0000001'
    ,	'da nang'
    ,	'abc'
    ,	'2016-05-12'
    ,	true
    ,	0
    ,	0
    ,	0
    ,	0
    ,	0
    ,	1
);$$
CALL TEST_Insert_DoiBong(
		'db0000002'
    ,	'ha noi'
    ,	'abc1'
    ,	'2016-05-12'
    ,	true
    ,	0
    ,	0
    ,	0
    ,	0
    ,	0
    ,	1
);$$
CALL TEST_Insert_DoiBong(
		'db0000003'
    ,	'sai gon'
    ,	'abc2'
    ,	'2016-05-12'
    ,	true
    ,	0
    ,	0
    ,	0
    ,	0
    ,	0
    ,	1
);$$
SELECT * FROM DoiBong;$$
DROP FUNCTION IF EXISTS Func_get_ma_doi_bong_from_di_doi_truong;$$
CREATE
    FUNCTION Func_get_ma_doi_bong_from_di_doi_truong (
		in_id_doi_truong	VARCHAR(9)
	)
    RETURNS VARCHAR(9)
    BEGIN
		RETURN(
		SELECT
				IFNULL(ma_doi_bong,'')	AS	ma_doi_bong
			FROM	DoiBong
			WHERE	id_doi_truong = in_id_doi_truong
		);		
	END
;$$


DELIMITER ;