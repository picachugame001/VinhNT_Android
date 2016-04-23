delimiter $$
DROP PROCEDURE IF EXISTS Proc_Check_InsertUpdate_Email_CauThu;
#
CREATE
	PROCEDURE  Proc_Check_InsertUpdate_Email_CauThu(
		in_id				VARCHAR(9)
	,	in_email			NVARCHAR(50) COLLATE utf8_unicode_ci
	)
	BEGIN
		IF
			EXISTS(
				SELECT 1
				FROM CauThu
				WHERE
						STRCMP(id,in_id) != 0
					AND	STRCMP(email,in_email) = 0
			)
		THEN
			CALL Proc_Add_Error(4,'email da co nguoi dang ky',0);
		END IF;
	END
;
$$
delimiter ;