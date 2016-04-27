<?php
use class_dir\mysql_dir\VinhNT_Result;
use class_dir\param_dir\Array_Param;

class Test{
	function __construct($inputArray){
		$this->test03($inputArray);
	}
	public function test01(){
		$a = array('User' => '2016-04-19 13:52:19');
		$b = new \class_dir\param_dir\date_time\TypeDATETIME_Input('now');
		$c = array();
		$b->setResult($c);
		var_dump($c);
		$e = $b->getValueParam();
		var_dump($e);
	}
	public function test02(){
		global $ketnoi_SQL;
		$result = new VinhNT_Result();
		$param = new Array_Param();
		$trave = $ketnoi_SQL->query_get_data('Proc_Test', $param);
		if(is_bool($trave) && $trave == false){
			echo 'exception';
		}
		var_dump($trave);
	}
	public function test03($inputArray){
		global $ketnoi_SQL;
		$user = new \class_dir\param_dir\In_User($inputArray);
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($user);
		//$mangketqua = null;
		$ga = new \class_dir\function_dir\Func_Get_Don_Gia_Nhap($inputArray);
	}
}