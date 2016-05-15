DELIMITER $$
DROP  TABLE IF EXISTS CauThu;$$
#
#
CREATE TABLE  CauThu
	(
		id				VARCHAR(9)  NOT NULL 
	,   password        NVARCHAR(9) NOT NULL 
	,	ho_ten_dem		NVARCHAR(30) NOT NULL DEFAULT ''
	,	ten				NVARCHAR(20) NOT NULL DEFAULT ''
	,	gioi_tinh		BOOLEAN NOT NULL DEFAULT true
	,	ngay_sinh		DATE 
	,	dia_chi			NVARCHAR(50)
	,	so_cmnd			VARCHAR(15)
	,	so_dien_thoai	VARCHAR(15)
	,	email			VARCHAR(50)
	,	so_doi_bong		TINYINT	NULL DEFAULT 0
	,	PRIMARY KEY(
			id
		)
	)
;$$

#procedure test
DROP PROCEDURE IF EXISTS TEST_Insert_CauThu;$$
#
CREATE
    PROCEDURE TEST_Insert_CauThu (
		in_id				VARCHAR(9) 
	,   in_password       	NVARCHAR(9) 
	,	in_ho_ten_dem		NVARCHAR(30)
	,	in_ten				NVARCHAR(20)
	,	in_gioi_tinh		BOOLEAN
	,	in_ngay_sinh		DATE 
	,	in_dia_chi			NVARCHAR(50)
	,	in_so_cmnd			VARCHAR(15)
	,	in_so_dien_thoai	VARCHAR(15)
	,	in_email			VARCHAR(50)
	,	in_so_doi_bong		TINYINT
    )
    BEGIN
		INSERT
			INTO CauThu
			(
					id				
				,   password        
				,	ho_ten_dem		
				,	ten				
				,	gioi_tinh
				,	ngay_sinh
				,	dia_chi			
				,	so_cmnd			
				,	so_dien_thoai	
				,	email
                ,	so_doi_bong
			)
			VALUES(
					in_id               #  id			
				,	in_password         #  password     
				,	in_ho_ten_dem       #  ho_ten_dem	
				,	in_ten              #  ten			
				,	in_gioi_tinh        #  gioi_tinh
				,	in_ngay_sinh		#  ngay_sinh
				,	in_dia_chi    		#  dia_chi		
				,	in_so_cmnd          #  so_cmnd		
				,	in_so_dien_thoai    #  so_dien_thoai
				,	in_email    		#  email
                ,	in_so_doi_bong		#  so_doi_bong
			);
    END
;$$
#
CALL TEST_Insert_CauThu(
			'abc012345'                                             #  id			
		,	'123456789'                                             #  password     
		,	'aefwefwerwrwerwerwerwhyjgytuty'                        #  ho_ten_dem	
		,	'lvkjekjwelkmoiwjewle'                                  #  ten			
		,	true                                                    #  gioi_tinh
		,	'1989-10-22'										    #  ngay_sinh
		,	'lsdkjvwejwfoijsldjfl;wqekjflksjdflkjsfwefwlefsdwer'    #  dia_chi		
		,	'230948203920395'                                       #  so_cmnd		
		,	'237502986763923'                                       #  so_dien_thoai
		,	'cjadgfasjdgflkjdgsjd84523okjslkdj0234tpj46dflgp340'    #  email
        ,	0														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'aHvbIsHW7'                                             #  id			
		,	'363423455'                                             #  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	0														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'abc'                                             		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	1														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'abc1'                                             		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	1														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'abc2'                                             		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	1														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'abc3'                                             		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	0														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'abc4'                                             		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	0														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'abc5'                                             		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	0														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'abc6'                                             		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	0														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'abc7'                                             		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	0														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'abc8'                                             		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	0														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'abc9'                                             		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	0														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'id001'                                            		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	1														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'id002'                                            		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	1														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'id003'                                            		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	1														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'id004'                                            		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	1														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'id005'                                            		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	1														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
			'id006'                                            		#  id			
		,	'123'                                             		#  password     
		,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'                        #  ho_ten_dem	
		,	'ZpjoWFKiqjiO6OlFfhS8'                                  #  ten			
		,	false                                                   #  gioi_tinh
		,	'1989-10-23'										    #  ngay_sinh	
		,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'    #  dia_chi		
		,	'223523554674547'                                       #  so_cmnd		
		,	'235346346345234'                                       #  so_dien_thoai
		,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'    #  email
        ,	1														#  so_doi_bong
);$$
CALL TEST_Insert_CauThu(
	'id007'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id008'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id009'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id010'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id011'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id012'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id013'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id014'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id015'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id016'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id017'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id018'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id019'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id020'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id021'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id022'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$

CALL TEST_Insert_CauThu(
	'id023'
,	'123'
,	'U6R4XcwAMNURThDbJHGMZpPmvGcJhZ'
,	'ZpjoWFKiqjiO6OlFfhS8'
,	'0'
,	'1989-10-23'
,	'A8H6JCNbJUwueKidLBkDbHlRkPoukDMV6wVIkfPTHWRFukj3T3'
,	'223523554674547'
,	'235346346345234'
,	'eUae1KxfW14z0WYPNWXEE3j4qQxfVSropSlz4k5clgo03L9IFo'
,	'1'
);$$



SELECT * FROM CauThu;$$
DELIMITER ;