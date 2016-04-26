DELIMITER $$
DROP FUNCTION IF EXISTS Func_Get_Column_Delimiter;$$
#
CREATE
	FUNCTION Func_Get_Column_Delimiter(
	)
	RETURNS NVARCHAR(10) COLLATE utf8_unicode_ci
	BEGIN
		RETURN '#C#';
	END	
;
$$
DELIMITER ;