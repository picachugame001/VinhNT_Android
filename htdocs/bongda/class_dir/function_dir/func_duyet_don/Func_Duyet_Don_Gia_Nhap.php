<?php
namespace class_dir\function_dir\func_duyet_don;
class Func_Duyet_Don_Gia_Nhap extends \class_dir\BaseFunction{
	//public function
	function __construct($inputArray) {
		$ma_doi_bong = new \class_dir\param_dir\In_Ma_Doi_Bong($inputArray);
		$table_cau_thu = new \class_dir\function_dir\func_duyet_don\Table_Cau_Thu($inputArray);
		$this->duyet_cau_thu($ma_doi_bong, $table_cau_thu);
	}
	function duyet_cau_thu($ma_doi_bong,$table_cau_thu){
		global $ketnoi_SQL;
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($ma_doi_bong);
		$param_array->add_param($table_cau_thu);
		$mangketqua = $ketnoi_SQL->query_get_data("Proc_Duyet_Don_Gia_Nhap", $param_array);
		$ketnoi_SQL->checkErrorResult($mangketqua);
	}
}