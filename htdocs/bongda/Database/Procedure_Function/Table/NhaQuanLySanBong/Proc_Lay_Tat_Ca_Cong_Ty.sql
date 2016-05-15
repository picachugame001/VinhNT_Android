#get list toan bo cong ty
# RUN ON MySQL Workbench
DELIMITER $$
USE bongda;$$
DROP PROCEDURE if exists Proc_Lay_Tat_Ca_Cong_Ty;$$
#
CREATE
	PROCEDURE	Proc_Lay_Tat_Ca_Cong_Ty(
    )
    BEGIN
		SELECT
				*
			FROM	NhaQuanLySanBong
		;
    END
;
$$
DELIMITER ;