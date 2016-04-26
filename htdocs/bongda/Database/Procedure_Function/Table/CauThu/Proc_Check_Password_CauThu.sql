DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Check_Password_CauThu;
#
CREATE
	PROCEDURE  Proc_Check_Password_CauThu(
		in_id				VARCHAR(9)
	,	in_password			NVARCHAR(9)
	)
	BEGIN
		IF
			NOT EXISTS(
				SELECT 1
				FROM CauThu
				WHERE
						STRCMP(id,in_id) = 0
					AND	STRCMP(password,in_password) = 0
			)
		THEN
			CALL Proc_Add_Error(5,'mat khau cu khong chinh xac',0);
		END IF;
	END
;
$$
DELIMITER ;