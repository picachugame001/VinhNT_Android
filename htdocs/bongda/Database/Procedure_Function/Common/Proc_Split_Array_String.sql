delimiter $$
DROP PROCEDURE IF EXISTS Proc_Split_Array_String;
#
CREATE
	PROCEDURE Proc_Split_Array_String(
		IN		in_string_array NVARCHAR(21845) COLLATE utf8_unicode_ci
	,	INOUT	inout_position	INT
	,	IN		in_delimiter	NVARCHAR(10)   COLLATE utf8_unicode_ci
	,	OUT		out_substring	NVARCHAR(21845) COLLATE utf8_unicode_ci
	,	OUT		out_stop_flag	BOOLEAN
	)
	BEGIN
		DECLARE	position_temp		INT;
		DECLARE	length_temp			INT;
		DECLARE	length_delimiter	INT;
		#
		IF inout_position < 1 OR inout_position IS NULL THEN
			SET inout_position = 1;
		END IF;
		#
		SET length_delimiter = CHAR_LENGTH(in_delimiter);
		SET position_temp = LOCATE(in_delimiter,in_string_array,inout_position);
		SET length_temp = position_temp - inout_position;
		SET out_substring = SUBSTRING(in_string_array,inout_position,length_temp);
		SET inout_position = position_temp + length_delimiter;
		SET position_temp = LOCATE(in_delimiter,in_string_array,inout_position);
		IF position_temp > 0 THEN
			SET	out_stop_flag = FALSE;
		ELSE
			SET	out_stop_flag = TRUE;
		END IF;
	END
;
$$
delimiter ;