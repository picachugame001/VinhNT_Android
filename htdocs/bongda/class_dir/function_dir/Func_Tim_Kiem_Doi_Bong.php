<?php
namespace class_dir\function_dir;
class Func_Tim_Kiem_Doi_Bong extends \class_dir\BaseFunction{
	//public function
	function __construct($inputArray) {
		$ten_doi_bong = new \class_dir\param_dir\In_Ten_Doi_Bong($inputArray);
		$user = new \class_dir\param_dir\In_User($inputArray);
		$this->tim_kiem($ten_doi_bong,$user);
	}
	public function tim_kiem($ten_doi_bong,$user){
		$result = new \class_dir\mysql_dir\VinhNT_Result();
		global $ketnoi_SQL;
		global $return_JSON;
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($ten_doi_bong);
		$param_array->add_param($user);
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Tim_Kiem_Doi_Bong',$param_array);
		if($ketnoi_SQL->checkErrorResult($mangKetQua)){
			$return_JSON->add_Result('list_doi_bong', $mangKetQua);
		}
	}
}