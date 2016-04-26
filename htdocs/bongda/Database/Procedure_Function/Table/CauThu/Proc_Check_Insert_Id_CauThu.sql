DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Check_Insert_Id_CauThu;
#
CREATE
	PROCEDURE  Proc_Check_Insert_Id_CauThu(
		in_id	VARCHAR(9) 
	)
	BEGIN
		IF(
			EXISTS(
				SELECT 1
					FROM CauThu
					WHERE
						STRCMP(id,in_id) = 0
			)
		)
		THEN
			CALL Proc_Add_Error(1,'id da ton tai',0);	
		END IF;	
	END
;
$$
DELIMITER ;