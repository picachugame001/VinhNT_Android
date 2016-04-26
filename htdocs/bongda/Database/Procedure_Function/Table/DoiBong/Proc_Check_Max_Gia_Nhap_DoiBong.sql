#update doi bong cho dau thu
DELIMITER $$
USE bongda;$$
DROP PROCEDURE if exists Proc_Check_Max_Gia_Nhap_DoiBong;$$
CREATE
	PROCEDURE	Proc_Check_Max_Gia_Nhap_DoiBong(
		in_id				VARCHAR(9)
    )
    BEGIN
		DECLARE so_doi_bong INT;
        SET so_doi_bong = (
			SELECT 
					so_doi_bong
				FROM CauThu
                WHERE
					id = in_id
        )
        ;
        IF so_doi_bong + 1 > Func_Get_Max_Doi_Bong_Gia_Nhap() THEN
			CALL Proc_Add_Error(12,'so doi bong vuot qua so doi gia nhap',0);
        END IF;
	END
;
$$
DELIMITER ;