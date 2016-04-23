delimiter $$
DROP PROCEDURE IF EXISTS Proc_Check_InsertUpdate_SoDienThoai_CauThu;
#
CREATE
	PROCEDURE  Proc_Check_InsertUpdate_SoDienThoai_CauThu(
		in_id				VARCHAR(9)
	,	in_so_dien_thoai	NVARCHAR(15) COLLATE utf8_unicode_ci
	)
	BEGIN
		IF
			EXISTS(
				SELECT 1
				FROM CauThu
				WHERE
						STRCMP(id,in_id) != 0
					AND	STRCMP(so_dien_thoai,in_so_dien_thoai) = 0
			)
		THEN
			CALL Proc_Add_Error(3,'so dt da co nguoi dang ky',0);
		END IF;
	END
;
$$
delimiter ;