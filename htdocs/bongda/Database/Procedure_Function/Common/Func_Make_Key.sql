DELIMITER $$
DROP FUNCTION IF EXISTS Func_Make_Key;$$
#
CREATE
	FUNCTION Func_Make_Key(
		prefix	NVARCHAR(10)
	,	number	INT
    ,	length00	INT
    )
    RETURNS NVARCHAR(100)
	BEGIN
		DECLARE	length01 INT;
        DECLARE	delta_length INT;
        DECLARE return_value	NVARCHAR(100);
        #
        SET length01 = CHAR_LENGTH(prefix);
        SET	delta_length = length00 - length01;
        SET return_value = CONCAT(prefix,LPAD(number,delta_length,'0'));
        RETURN return_value;
        
		#CHAR_LENGTH(str)
	END
;
$$