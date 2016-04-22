delimiter $$
DROP PROCEDURE IF EXISTS Proc_Init_Data_CauThu;
#
CREATE PROCEDURE Proc_Init_Data_CauThu(
	in_id				VARCHAR(9)
)
BEGIN
	SELECT 
			IFNULL(	password		,''	)	AS	password
		,	IFNULL(	ho_ten_dem		,''	)	AS	ho_ten_dem
		,	IFNULL(	ten				,''	)	AS	ten
		,	IFNULL(	gioi_tinh		,1	)	AS	gioi_tinh
		,	IFNULL(	ngay_sinh		,''	)	AS	ngay_sinh
		,	IFNULL(	dia_chi			,''	)	AS	dia_chi
		,	IFNULL(	so_cmnd			,''	)	AS	so_cmnd
		,	IFNULL(	so_dien_thoai	,''	)	AS	so_dien_thoai
		,	IFNULL(	email			,''	)	AS	email
	FROM	CauThu
	WHERE
		id = in_id;
END
$$