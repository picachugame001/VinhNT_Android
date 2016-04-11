<?php
namespace class_dir\function_dir;

class Func_Insert_CauThu extends \class_dir\BaseFunction{
	//
	
	//public function 
	function __construct($inputArray) {
		$user = new \class_dir\param_dir\In_User($inputArray);
		$pass = new \class_dir\param_dir\In_Password($inputArray);
		$ho_ten_dem = new \class_dir\param_dir\In_Ho_Va_Ten_Dem($inputArray);
		$ten = new \class_dir\param_dir\In_Ten($inputArray);
		$gioi_tinh = new \class_dir\param_dir\In_Gioi_Tinh($inputArray);
		$ngay_sinh = new \class_dir\param_dir\In_Ngay_Sinh($inputArray);
		$dia_chi = new \class_dir\param_dir\In_Dia_Chi($inputArray);
		$so_cmnd = new \class_dir\param_dir\In_So_CMND($inputArray);
		$so_dien_thoai = new \class_dir\param_dir\In_So_Dien_Thoai($inputArray);
		$email = new \class_dir\param_dir\In_Email($inputArray);
		
		$this->dang_Ky($user,$pass,$ho_ten_dem,$ten,$gioi_tinh,$ngay_sinh,$dia_chi,$so_cmnd,$so_dien_thoai,$email);
	}
	public function dang_Ky($user,$pass,$ho_ten_dem,$ten,$gioi_tinh,$ngay_sinh,$dia_chi,$so_cmnd,$so_dien_thoai,$email){
		global $ketnoi_SQL;
		//
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($user);
		//
		$result = new \class_dir\mysql_dir\VinhNT_Result();
		
		//
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Login',$param_array);
		if(count($mangKetQua)==0){
			//co the dang ki
			$this->dang_Ky_Moi($user,$pass,$ho_ten_dem,$ten,$gioi_tinh,$ngay_sinh,$dia_chi,$so_cmnd,$so_dien_thoai,$email);
		}
		else{
			//khong the dang ki
			$result->add_Error(1,'tai khoan da ton tai');
		}
		
		$result->hien_json();
	}
	public function dang_Ky_Moi($user,$pass,$ho_ten_dem,$ten,$gioi_tinh,$ngay_sinh,$dia_chi,$so_cmnd,$so_dien_thoai,$email){
		global $ketnoi_SQL;
		//
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($user);
		$param_array->add_param($pass);
		$param_array->add_param($ho_ten_dem);
		$param_array->add_param($ten);
		$param_array->add_param($gioi_tinh);
		$param_array->add_param($ngay_sinh);
		$param_array->add_param($dia_chi);
		$param_array->add_param($so_cmnd);
		$param_array->add_param($so_dien_thoai);
		$param_array->add_param($email);
		//
		$mangKetQua = $ketnoi_SQL->query_update_data('Proc_Insert_CauThu',$param_array);
	}
}