delimiter $$
DROP FUNCTION IF EXISTS Func_Check_Error;
#
CREATE
	FUNCTION  Func_Check_Error(
	)
	RETURNS BOOLEAN
	BEGIN
		RETURN
			EXISTS(
				SELECT 1
				FROM	ERRORS
			)
		;	
	END
;
$$
delimiter ;