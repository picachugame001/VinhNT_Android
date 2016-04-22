delimiter $$
#set @abc01 = Func_Get_MaxKey('DoiBong3');
#select @abc01 as show1;
#SELECT 1 AS A;
#CALL Proc_Check_Ten_DoiBong_Exists(#	'abc_123'#);
#CALL Proc_Test();
CALL Proc_Update_CauThu('abc','123','a','b'
,false
,'2014-06-06'
,'d'
,'234'
,'456'
,'a@b.c'

);



$$
delimiter ;