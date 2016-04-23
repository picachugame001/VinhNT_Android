<?php
namespace class_dir\function_dir;
class Func_Insert_DoiBong extends \class_dir\BaseFunction{
	//public function
	function __construct($inputArray) {
		 $ten_doi_bong = new \class_dir\param_dir\In_Ten_Doi_Bong($inputArray);
		 $id_doi_truong = new \class_dir\param_dir\In_User($inputArray);
		 //$gioi_tinh = new \class_dir\param_dir\In_Gioi_Tinh($inputArray);
		 //
		 $this->insert_doi_bong($ten_doi_bong,$id_doi_truong);
	}
	public function insert_doi_bong($ten_doi_bong,$id_doi_truong){
		global $ketnoi_SQL;
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($ten_doi_bong);
		$param_array->add_param($id_doi_truong);
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Insert_DoiBong', $param_array);
		$ketnoi_SQL->checkErrorResult($mangKetQua);
	}
}              