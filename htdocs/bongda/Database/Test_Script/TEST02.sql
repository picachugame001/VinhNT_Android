# RUN ON MySQL Workbench
DELIMITER ;
# DELIMITER $$
DROP procedure if exists Proc_Duyet_Don_Gia_Nhap;
#
CREATE
	PROCEDURE	Proc_Duyet_Don_Gia_Nhap(
		in_id_doi_truong	NVARCHAR()
	,	in_mang_id
    )
    BEGIN
    END
;
; # $$
DELIMITER ;