# RUN ON MySQL Workbench
DELIMITER $$
USE bongda;$$
DROP FUNCTION IF EXISTS Func_Get_Max_Doi_Bong_Gia_Nhap;$$
CREATE
	FUNCTION	Func_Get_Max_Doi_Bong_Gia_Nhap(
    )
    RETURNS INT
    BEGIN
		# so luong doi bong gia nhap lon nhat la 3
		RETURN 3;
     END
;
$$
DELIMITER ;