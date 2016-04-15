use bongda;
DROP  TABLE IF EXISTS CauThu;
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
);
INSERT INTO CauThu
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
)
VALUES(
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
);
INSERT INTO CauThu
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
)
VALUES(
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
);
INSERT INTO CauThu
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
)
VALUES(
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
);
SELECT * FROM CauThu;