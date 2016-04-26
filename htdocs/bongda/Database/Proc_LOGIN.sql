DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Login;
#
CREATE 
	PROCEDURE Proc_Login(
		in_user VARCHAR(9)
	,	in_password NVARCHAR(9)
	)
	BEGIN
		START TRANSACTION;
		CALL Proc_Make_Error_Table();
		# this is comment
		IF
			NOT EXISTS(
				SELECT 1
					FROM CauThu
					WHERE
						STRCMP(id,in_user) = 0
			)
		THEN
			CALL Proc_Add_Error(1,'user khong ton tai',0);
		ELSE
			IF
				NOT EXISTS(
					SELECT 1
						FROM CauThu
						WHERE
								STRCMP(id,in_user) = 0
							AND	STRCMP(password,in_password) = 0
				)
			THEN
				CALL Proc_Add_Error(2,'mat khau khong ton tai',0);
			END IF;
		END IF;
		#
		IF Func_Check_Error() THEN
			SELECT
					*
				FROM ERRORS
			;
			ROLLBACK;
		ELSE
			COMMIT;
		END IF;
	END
;
$$


