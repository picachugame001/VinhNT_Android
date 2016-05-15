DELIMITER $$
use bongda;$$
#set @abc01 = Func_Get_MaxKey('DoiBong3');
#select @abc01 as show1;
#SELECT 1 AS A;
#CALL Proc_Check_Ten_DoiBong_Exists(
#	'abc_123'
#);
#CALL Proc_Test02();
/*CALL Proc_Update_CauThu('abc','123','a','b'
,false
,'2014-06-06'
,'d'
,'234'
,'456'
,'a@b.c'

);*/
#CALL Proc_Update_CauThu('abc','123','','vadf','sere',true,'2001-11-12','vai ca dia chi','234','2387420','a@b.c');
#CALL Proc_Insert_DoiBong('dadfwe','abc');
#SELECT LOCATE('foo', 'foobarbar	foo',12);
#SET @a = '';
#SET @b = false;
#set @c = 1;
#CALL Proc_Split_Array_String('LAKJD##FLJWLEJPDS##JFWPERJ##WFLKSJDF##LSJDF##',@c,'##',@a,@b);
#SELECT Func_Get_Column_Delimiter();
#CALL Proc_Gia_Nhap_Doi_Bong('abc','bd0000001#C#*R*bd0000003#C#*R*bd0000004#C#*R*');
#CALL Proc_Duyet_Don_Gia_Nhap('bd0000001','abc1#C#*R*abc2#C#*R*');
#CALL Proc_Insert_DoiBong('gcc','abc');
#CALL Proc_Get_Don_Gia_Nhap('abc');
#SET @ma_doi_bong = Func_get_ma_doi_bong_from_di_doi_truong('abc1');$$
#SELECT @ma_doi_bong;$$

CALL Proc_Thach_Dau_Tat_Ca(
		'ct0000001'
	,	'sb0000001'
	,	'2016-05-30'
	,	'16:00:00'
	,	'17:00:00'
	,	'abc'

);$$
#SELECT * FROM View01;
$$
DELIMITER ;