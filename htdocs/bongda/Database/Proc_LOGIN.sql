delimiter //
DROP PROCEDURE IF EXISTS Proc_Login;
#
CREATE PROCEDURE Proc_Login(
	in_user VARCHAR(9)
)
BEGIN
	SELECT * FROM Table_USER
	WHERE id = in_user;
END
//


