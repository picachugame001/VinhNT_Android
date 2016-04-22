<?php
namespace class_dir\function_dir;

class Func_Login extends \class_dir\BaseFunction{
	//
	
	//public function 
	function __construct($inputArray) {
		$user = new \class_dir\param_dir\In_User($inputArray);
		$pass = new \class_dir\param_dir\In_Password($inputArray);
		$this->checkLogin($user,$pass);
	}
	public function checkLogin($user,$pass){
		global $ketnoi_SQL;
		global $return_JSON;
		
		//
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($user);
		//
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Login',$param_array);
		if($ketnoi_SQL->checkErrorResult($mangKetQua)){
			if($mangKetQua[0]["password"] == $pass->getValue()){
				$return_JSON->add_Result('result', true);
			}
			else{
				$return_JSON->add_Result('result', true);
			}
		}
	}
}