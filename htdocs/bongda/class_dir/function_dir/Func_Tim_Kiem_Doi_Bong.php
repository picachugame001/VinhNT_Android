<?php
namespace class_dir\function_dir;
class Func_Tim_Kiem_Doi_Bong extends \class_dir\BaseFunction{
	//public function
	function __construct($inputArray) {
		$ten_doi_bong = new \class_dir\param_dir\In_Ten_Doi_Bong($inputArray);
		$this->tim_kiem($ten_doi_bong);
	}
	public function tim_kiem($ten_doi_bong){
		$result = new \class_dir\mysql_dir\VinhNT_Result();
		global $ketnoi_SQL;
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($ten_doi_bong);
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Tim_Kiem_Doi_Bong',$param_array);
		$result->add_Result('list_doi_bong', $mangKetQua);
		//$result->add_Result($ket_qua);
		$result->hien_json();
	}
}