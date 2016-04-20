<?php
namespace class_dir\function_dir;

class Func_Gia_Nhap_Doi_Bong extends \class_dir\BaseFunction{
	function __construct($inputArray) {
		$table = new \class_dir\function_dir\param_xin_gia_nhap\Table_Xin_Gia_Nhap($inputArray);
		$user = new \class_dir\param_dir\In_User($inputArray);
		$result = new \class_dir\mysql_dir\VinhNT_Result();
		$result->add_Result("table", $table->getValue());
		$this->gia_nhap($user, $table->getValue());
		$result->hien_json();
	}
	function gia_nhap($user,$mangDoiBong){
		global $ketnoi_SQL;
		$length = count($mangDoiBong);
		$time_dang_ky = new \class_dir\param_dir\date_time\TypeDATETIME_Input('now');
		//var_dump($time_dang_ky->)
		for($i=0;$i<$length;$i++){
			$madoi = new \class_dir\param_dir\In_Ma_Doi_Bong($mangDoiBong[$i]);
			$param_array = new \class_dir\param_dir\Array_Param();
			$param_array->add_param($madoi);
			$param_array->add_param($user);
			$param_array->add_param($time_dang_ky);
			
			$ketnoi_SQL->query_update_data("Proc_Gia_Nhap_Doi_Bong", $param_array);
		}
		
	}
}