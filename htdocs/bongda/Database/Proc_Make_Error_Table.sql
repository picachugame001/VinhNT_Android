delimiter $$
DROP PROCEDURE IF EXISTS Proc_Make_Error_Table;
#
CREATE
	PROCEDURE Proc_Make_Error_Table(
	)
	BEGIN
		DROP TEMPORARY TABLE IF EXISTS
			ERRORS
		;
		CREATE TEMPORARY TABLE IF NOT EXISTS ERRORS
			(
				error_code		INT	NULL DEFAULT 0
			,	description NVARCHAR(50) NULL DEFAULT ''
			,	sub_code	INT NULL DEFAULT 0
			)
		;
	END
;
$$
delimiter ;