delimiter $$
DROP PROCEDURE IF EXISTS Proc_Test02;
#
CREATE PROCEDURE Proc_Test02(
)
BEGIN
	UPDATE CauThu
		SET
			ten = "thay doi ten"
		WHERE
			id = '123'
	;
END;
$$
delimiter ;