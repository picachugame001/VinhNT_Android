<?php
namespace class_dir\function_dir;
class Func_Thach_Dau_Tat_Ca extends \class_dir\BaseFunction{
	function __construct($inputArray) {
		$user = new \class_dir\param_dir\In_User($inputArray);
		$ma_cong_ty = new \class_dir\param_dir\In_Ma_Cong_Ty($inputArray);
		$ma_san_bong = new \class_dir\param_dir\In_Ma_San_Bong($inputArray);
		$ngay = new \class_dir\param_dir\In_Ngay($inputArray);
		$gio_bat_dau = new \class_dir\param_dir\In_Gio_Bat_Dau($inputArray);
		$gio_ket_thuc = new \class_dir\param_dir\In_Gio_Ket_Thuc($inputArray);
		//
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($ma_cong_ty);
		$param_array->add_param($ma_san_bong);
		$param_array->add_param($ngay);
		$param_array->add_param($gio_bat_dau);
		$param_array->add_param($gio_ket_thuc);
		$param_array->add_param($user);
		//
		$this->thach_Dau_Tat_Ca($param_array);
	}
	public function thach_Dau_Tat_Ca($param_array){
		$mangKetQua = array();
		global $ketnoi_SQL;
		$ket_qua = $ketnoi_SQL->query_get_multi_data('Proc_Thach_Dau_Tat_Ca',$param_array,$mangKetQua);
	} 
}