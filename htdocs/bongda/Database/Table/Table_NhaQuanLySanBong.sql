DELIMITER $$

DROP TABLE IF EXISTS
	NhaQuanLySanBong;
$$
CREATE  TABLE  NhaQuanLySanBong(
	ma_cong_ty		VARCHAR(9)
,   ten_cong_ty		NVARCHAR(30)
,   dia_chi			NVARCHAR(50)
,   so_dien_thoai	NVARCHAR(15)
,	PRIMARY KEY(ma_cong_ty)
);
$$
DROP PROCEDURE IF EXISTS TEST_Insert_NhaQuanLySanBong;$$

CREATE
    PROCEDURE TEST_Insert_NhaQuanLySanBong (
		in_ma_cong_ty		VARCHAR(9)
	,   in_ten_cong_ty		NVARCHAR(30)
	,   in_dia_chi			NVARCHAR(50)
	,   in_so_dien_thoai	NVARCHAR(15)
	)
	BEGIN
		INSERT
			INTO NhaQuanLySanBong
			(
				ma_cong_ty
			,	ten_cong_ty
			,	dia_chi
			,	so_dien_thoai
			)
			VALUES(
				in_ma_cong_ty
			,   in_ten_cong_ty
			,   in_dia_chi
			,   in_so_dien_thoai
			)
		;
    END
;$$
CALL TEST_Insert_NhaQuanLySanBong(
	'ct0000001'
	,	'Cung The Thao Tuyen Son'
    ,	'gan cau Tuyen Son'
    ,	'09839123456'
);$$
CALL TEST_Insert_NhaQuanLySanBong(
	'ct0000002'
	,	'Trung Tam The Thao Quan Khu 5'
    ,	'gan cau Tran Thi Ly'
    ,	'098397891011'
);$$
SELECT * FROM NhaQuanLySanBong;$$
DELIMITER ;
