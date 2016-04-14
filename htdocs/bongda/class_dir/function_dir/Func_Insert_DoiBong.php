<?php
namespace class_dir\function_dir;
class Func_Insert_DoiBong extends \class_dir\BaseFunction{
	//public function
	function __construct($inputArray) {
		 $ten_doi_bong = new \class_dir\param_dir\In_Ten_Doi_Bong($inputArray);
		 $id_doi_truong = new \class_dir\param_dir\In_User($inputArray);
		 $gioi_tinh = new \class_dir\param_dir\In_Gioi_Tinh($inputArray);
		 //
		 $result = new \class_dir\mysql_dir\VinhNT_Result();
		 if($this->check_ten_doi_bong($ten_doi_bong)==1){
		 	$result->add_Error(1, "Ten doi bong da ton tai");
		 }
		 else{
		 	//insert doi bong
		 	$this->insert_doi_bong($ten_doi_bong,$id_doi_truong,$gioi_tinh);
		 }
		 $result->hien_json();
	}
	//return
	//	value: 0 chua ton tai ten doi bong
	//	value: 1 da ton tai ten doi bong
	public function check_ten_doi_bong($ten_doi_bong){
		//Proc_Check_Ten_DoiBong_Exists
		global $ketnoi_SQL;
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($ten_doi_bong);
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Check_Ten_DoiBong_Exists',$param_array);
		return $mangKetQua[0]['ket_qua'];
	}
	public function insert_doi_bong($ten_doi_bong,$id_doi_truong,$gioi_tinh){
		global $ketnoi_SQL;
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($ten_doi_bong);
		$param_array->add_param($id_doi_truong);
		$param_array->add_param($gioi_tinh);
		$mangKetQua = $ketnoi_SQL->query_update_data('Proc_Insert_DoiBong', $param_array);
	}
}              