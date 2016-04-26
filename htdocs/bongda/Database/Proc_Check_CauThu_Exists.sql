DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Check_Cau_Thu_Exists;
#
CREATE PROCEDURE Proc_Check_Cau_Thu_Exists(
	in_id				VARCHAR(9)
,   in_password      	NVARCHAR(9)
)
BEGIN
	SELECT 
		EXISTS(
			SELECT 1
			FROM	CauThu
			WHERE
					id = in_id
				AND password = in_password
		)
		AS ket_qua;
END
$$