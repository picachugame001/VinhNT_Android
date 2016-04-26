#update doi bong cho dau thu
DELIMITER $$
USE bongda;$$
DROP PROCEDURE if exists Proc_Update_DoiBong_CauThu;$$
CREATE
	PROCEDURE	Proc_Update_DoiBong_CauThu(
		in_id				VARCHAR(9)
	,	in_flag				BOOLEAN  # flag = TRUE so_doi_bong + 1 ; flag = FALSE so_doi_bong - 1
    )
    BEGIN
		DECLARE so_doi_bong_temp INT;
        IF in_flag THEN
			SET so_doi_bong_temp = 1;
		ELSE
			SET so_doi_bong_temp = -1;
        END IF;
		UPDATE	CauThu
			SET
				so_doi_bong = so_doi_bong + so_doi_bong_temp
			WHERE
				id = in_id
		;
    END
;
$$
DELIMITER ;