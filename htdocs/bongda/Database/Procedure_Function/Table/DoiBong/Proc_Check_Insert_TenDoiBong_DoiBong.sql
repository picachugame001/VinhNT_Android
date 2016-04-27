DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Check_Insert_TenDoiBong_DoiBong;$$
#
CREATE
	PROCEDURE  Proc_Check_Insert_TenDoiBong_DoiBong(
		in_ten_doi_bong				NVARCHAR(30)	
	)
	BEGIN
		IF
			EXISTS(
				SELECT 1
				FROM DoiBong
				WHERE
					STRCMP(ten_doi_bong,in_ten_doi_bong) = 0
			)
		THEN
			CALL Proc_Add_Error(6,'ten doi bong da dang ky',0);
		END IF;
	END
;
$$
DELIMITER ;