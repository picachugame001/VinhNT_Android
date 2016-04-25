delimiter $$
DROP FUNCTION IF EXISTS Func_Get_Row_Delimiter;
#
CREATE
	FUNCTION Func_Get_Row_Delimiter(
	)
	RETURNS NVARCHAR(10) COLLATE utf8_unicode_ci
	BEGIN
		RETURN '*R*';
	END	
;
$$
delimiter ;