<?php
namespace class_dir\function_dir;
class Func_Get_Don_Gia_Nhap extends \class_dir\BaseFunction{
	function __construct($inputArray) {
		$user = new \class_dir\param_dir\In_User($inputArray);
		$this->lay($user);
	}
	public function lay($user){
		global $ketnoi_SQL;
		global $return_JSON;
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($user);
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Get_Don_Gia_Nhap',$param_array);
		if($ketnoi_SQL->checkErrorResult($mangKetQua)){
			$return_JSON->add_Result('list_cau_thu', $mangKetQua);
		}
	}
	
}