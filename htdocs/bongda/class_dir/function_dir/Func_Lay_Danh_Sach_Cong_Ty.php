<?php
namespace class_dir\function_dir;
class Func_Lay_Danh_Sach_Cong_Ty extends \class_dir\BaseFunction{
	//public function
	function __construct($inputArray) {
		$this->lay();
	}
	private function lay(){
		$mangKetQua = array();
		global $ketnoi_SQL;
		global $return_JSON;
		$param_array = new \class_dir\param_dir\Array_Param();
		$ket_qua = $ketnoi_SQL->query_get_multi_data('Proc_Lay_Tat_Ca_Cong_Ty',$param_array,$mangKetQua);
		if($ket_qua){
			$return_JSON->add_Result('bang_cong_ty', $mangKetQua[0]);
		}
	}
}