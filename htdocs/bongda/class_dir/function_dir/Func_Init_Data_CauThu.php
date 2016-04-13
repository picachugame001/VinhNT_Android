<?php
namespace class_dir\function_dir;
class Func_Init_Data_CauThu extends \class_dir\BaseFunction{
	//public function
	function __construct($inputArray) {
		$user = new \class_dir\param_dir\In_User($inputArray);
		$this->get_data_user($user);
	}
	function get_data_user($user){
		global $ketnoi_SQL;
		//
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($user);
		//
		//
		$result = new \class_dir\mysql_dir\VinhNT_Result();
		//
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Init_Data_CauThu',$param_array);
		$ngay = new \class_dir\param_dir\In_Ngay_Sinh($mangKetQua[0]);
		$ngay->setResult($mangKetQua[0]);
		$result->add_Result($mangKetQua[0]);
		$result->hien_json();
	}
}