<?php
namespace class_dir\function_dir;
class Func_Tim_Kiem_Doi_Bong extends \class_dir\BaseFunction{
	//public function
	function __construct($inputArray) {
		$this->tim_kiem();
	}
	public function tim_kiem(){
		$result = new \class_dir\mysql_dir\VinhNT_Result();
		global $ketnoi_SQL;
		$param_array = new \class_dir\param_dir\Array_Param();
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Tim_Kiem_Doi_Bong',$param_array);
		$ket_qua = array();
		$ket_qua["list_doi_bong"] = $mangKetQua[0];
		$result->add_Result_With_Key('list_doi_bong', $mangKetQua);
		//$result->add_Result($ket_qua);
		$result->hien_json();
	}
}