delimiter $$
DROP FUNCTION IF EXISTS Func_Get_MaxKey;
#
CREATE 
	FUNCTION Func_Get_MaxKey(
		in_table_name		VARCHAR(30)
	)
	RETURNS INT
	BEGIN
		DECLARE return_max INT;
		#
		IF
			EXISTS(
				SELECT 
						1
					FROM MaxKey
					WHERE
						table_name = in_table_name
			)
			THEN
				#
				SET return_max =
					(
						SELECT
								IFNULL(max_number,0) + 1
							FROM MaxKey
							WHERE
								table_name = in_table_name
					)
				;
				UPDATE MaxKey
					SET
						max_number = return_max
					WHERE
						table_name = in_table_name
				;
			ELSE
				SET 
					return_max = 1
				;
				INSERT
					INTO MaxKey(
						table_name
					,	max_number
					)
					VALUES(
						in_table_name
					,	return_max
					)
				;
		END IF;
		RETURN return_max;
	END
$$