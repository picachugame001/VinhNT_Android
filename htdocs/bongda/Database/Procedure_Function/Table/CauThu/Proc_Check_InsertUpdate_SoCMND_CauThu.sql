DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Check_InsertUpdate_SoCMND_CauThu;
#
CREATE
	PROCEDURE  Proc_Check_InsertUpdate_SoCMND_CauThu(
		in_id		VARCHAR(9)
	,	in_so_cmnd	NVARCHAR(15) COLLATE utf8_unicode_ci
	)
	BEGIN
		IF
			EXISTS(
				SELECT 1
				FROM CauThu
				WHERE
						STRCMP(so_cmnd,in_so_cmnd) = 0
					AND STRCMP(id,in_id) != 0
			)
		THEN
			CALL Proc_Add_Error(2,'cmnd da co nguoi dang ky',0);	
		END IF;
	END
;
$$
DELIMITER ;