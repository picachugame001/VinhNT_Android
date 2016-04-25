<?php
namespace class_dir\function_dir;

class Func_Gia_Nhap_Doi_Bong extends \class_dir\BaseFunction{
	function __construct($inputArray) {
		$table = new \class_dir\function_dir\param_xin_gia_nhap\Table_Xin_Gia_Nhap($inputArray);
		$user = new \class_dir\param_dir\In_User($inputArray);
		//var_dump($user->getValueParam());
		$this->gia_nhap($user, $table);
	}
	function gia_nhap($user,$mangDoiBong){
		global $ketnoi_SQL;
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($user);
		$param_array->add_param($mangDoiBong);
		$mangketqua = $ketnoi_SQL->query_get_data("Proc_Gia_Nhap_Doi_Bong", $param_array);
		$ketnoi_SQL->checkErrorResult($mangketqua);
		
	}
}