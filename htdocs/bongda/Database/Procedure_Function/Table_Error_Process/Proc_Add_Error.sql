delimiter $$
DROP PROCEDURE IF EXISTS `Proc_Add_Error`;
#
CREATE
	PROCEDURE `Proc_Add_Error`(
		in_code			INT
	,	in_description	NVARCHAR(50)
	,	in_sub_code		INT
	)
	BEGIN
		INSERT
			INTO	ERRORS
			(
				error_code
			,	description
			,	sub_code
			)
			VALUES(
				in_code
			,	in_description
			,	in_sub_code
			)
		;
	END
;
$$
delimiter ;