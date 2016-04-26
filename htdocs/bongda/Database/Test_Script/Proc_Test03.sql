DELIMITER $$
DROP PROCEDURE IF EXISTS `Proc_Test03`;
#
CREATE
	PROCEDURE `Proc_Test03`(
		in_code			INT
	,	in_description	NVARCHAR(50)
	,	in_sub_code		INT
	)
	BEGIN
		INSERT
			INTO	ERRORS
			(
				code
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
DELIMITER ;