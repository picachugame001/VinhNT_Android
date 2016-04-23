delimiter $$
DROP FUNCTION IF EXISTS Func_Get_GioiTinh_CauThu;
#
CREATE
	FUNCTION  Func_Get_GioiTinh_CauThu(
		in_id				VARCHAR(9)
	)
	RETURNS BOOLEAN
	BEGIN
		DECLARE var_gioi_tinh BOOLEAN;
		SET var_gioi_tinh = (
			SELECT
					gioi_tinh
				FROM CauThu
				WHERE
					id = in_id
		);
		RETURN var_gioi_tinh;
	END
;
$$
delimiter ;