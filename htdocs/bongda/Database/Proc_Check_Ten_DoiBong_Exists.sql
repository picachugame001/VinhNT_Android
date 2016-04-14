delimiter //
DROP PROCEDURE IF EXISTS Proc_Check_Ten_DoiBong_Exists;
#
CREATE
	PROCEDURE Proc_Check_Ten_DoiBong_Exists(
		int_ten_doi_bong NVARCHAR(30)
	)
	BEGIN
		#
		SELECT 
			EXISTS(
				SELECT 1
				FROM	DoiBong
				WHERE
					ten_doi_bong = int_ten_doi_bong
			)
			AS ket_qua
		;
	END
//