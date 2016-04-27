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
		$mangKetQua=array();
		if($ketnoi_SQL->query_get_multi_data('Proc_Get_Don_Gia_Nhap',$param_array,$mangKetQua)){
			if(\count($mangKetQua) < 2){
				$return_JSON->add_Error(13, "procedure lay thieu data", 0);
			}
			else{
				$return_JSON->add_Result('list_cau_thu', $mangKetQua[0]);
				$return_JSON->add_Result('ma_doi_bong', $mangKetQua[1][0]['ma_doi_bong']);
			}
		}
	}
	
}