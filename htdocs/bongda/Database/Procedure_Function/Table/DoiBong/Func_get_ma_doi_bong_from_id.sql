DELIMITER $$
#Lấy mã đội bóng từ id đội trưởng
DROP FUNCTION IF EXISTS Func_get_ma_doi_bong_from_id;$$
CREATE
	FUNCTION Func_get_ma_doi_bong_from_id(
		in_id_doi_truong	VARCHAR(9)
	)
	RETURNS VARCHAR(9)
    BEGIN
		RETURN(
			SELECT
					ma_doi_bong
				FROM	DoiBong
				WHERE
					id_doi_truong = in_id_doi_truong
		);
	END
;$$
DELIMITER ;