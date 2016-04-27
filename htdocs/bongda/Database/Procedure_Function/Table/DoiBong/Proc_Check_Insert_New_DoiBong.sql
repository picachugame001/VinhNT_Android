DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Check_Insert_New_DoiBong;$$
#
CREATE
	PROCEDURE  Proc_Check_Insert_New_DoiBong(
		in_id				VARCHAR(9)	
	)
	BEGIN
		IF
			EXISTS(
				SELECT 1
				FROM DoiBong
				WHERE
					id_doi_truong = in_id
			)
		THEN
			CALL Proc_Add_Error(14,'user da tao 1 doi bong',0);
		END IF;
	END
;
$$
DELIMITER ;