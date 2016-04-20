delimiter //
DROP PROCEDURE IF EXISTS Proc_Test;
#
CREATE PROCEDURE Proc_Test(
)
BEGIN
	DECLARE lo_time  TIME;
	SET lo_time = NOW();
	select lo_time as this_is_now;
END
//