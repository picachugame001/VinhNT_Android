DELIMITER $$
DROP PROCEDURE IF EXISTS Proc_Test;
#
CREATE PROCEDURE Proc_Test(
)
BEGIN
	
	/*START TRANSACTION;*/

	/*INSERT
		INTO CauThu(
			id
		,	password
		)
		VALUES(
			'A007'
		,	'123'
		)
	;*/
			
	
	/*SELECT @@error_count;
	COMMIT;*/
	/*CALL Proc_Update_CauThu('abc','123','a','b'
		,false
		,'2014-06-06'
		,'d'
		,'234'
		,'456'
		,'a@b.c'

		);
	*/
	DECLARE a NVARCHAR(10);
	DECLARE b BOOLEAN;
	DECLARE c INT;
	SET c = 1 ;
	CALL Proc_Split_Array_String('LAKJD##FLJWLEJPDS##JFWPERJ##WFLKSJDF##LSJDF##',c,'##',a,b);
	select c,a,b;
END;
$$
DELIMITER ;