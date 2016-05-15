DELIMITER $$

DROP TABLE IF EXISTS
	SanBong
;$$
CREATE  TABLE  SanBong(
	ma_cong_ty		VARCHAR(9)
,	ma_san_bong		VARCHAR(9)
,	chat_luong		INT
,	PRIMARY KEY(ma_cong_ty,ma_san_bong)
);$$
DROP PROCEDURE IF EXISTS TEST_Insert_SanBong;$$
CREATE
    PROCEDURE TEST_Insert_SanBong (
		in_ma_cong_ty		VARCHAR(9)
	,	in_ma_san_bong		VARCHAR(9)
	,	in_chat_luong		INT
	)
    BEGIN
		INSERT
			INTO SanBong
			(
				ma_cong_ty
			,	ma_san_bong
			,	chat_luong
			)
			VALUES(
				in_ma_cong_ty
			,	in_ma_san_bong
			,	in_chat_luong
			)
		;
    END
;$$
CALL TEST_Insert_SanBong(
		'ct0000001'
	,	'sb0000001'
    ,	1
);$$
CALL TEST_Insert_SanBong(
		'ct0000001'
	,	'sb0000002'
	,	1
);$$
CALL TEST_Insert_SanBong(
		'ct0000002'
	,	'sb0000003'
    ,	1
);$$
CALL TEST_Insert_SanBong(
		'ct0000002'
	,	'sb0000004'
    ,	1
);$$
SELECT * FROM SanBong;$$
DELIMITER ;