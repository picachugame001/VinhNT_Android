<?php
namespace class_dir\function_dir;
class Func_Update_CauThu extends \class_dir\BaseFunction{
	//public function
	function __construct($inputArray) {
		$user = new \class_dir\param_dir\In_User($inputArray);
		$old_pass = new \class_dir\function_dir\param_update_cau_thu\In_Old_Password($inputArray);
		$new_pass = new \class_dir\function_dir\param_update_cau_thu\In_New_Password($inputArray);
		$ho_ten_dem = new \class_dir\param_dir\In_Ho_Va_Ten_Dem($inputArray);
		$ten = new \class_dir\param_dir\In_Ten($inputArray);
		$gioi_tinh = new \class_dir\param_dir\In_Gioi_Tinh($inputArray);
		$ngay_sinh = new \class_dir\param_dir\In_Ngay_Sinh($inputArray);
		$dia_chi = new \class_dir\param_dir\In_Dia_Chi($inputArray);
		$so_cmnd = new \class_dir\param_dir\In_So_CMND($inputArray);
		$so_dien_thoai = new \class_dir\param_dir\In_So_Dien_Thoai($inputArray);
		$email = new \class_dir\param_dir\In_Email($inputArray);
	
		$this->cap_Nhat($user,$old_pass,$new_pass,$ho_ten_dem,$ten,$gioi_tinh,$ngay_sinh,$dia_chi,$so_cmnd,$so_dien_thoai,$email);
	}
	public function cap_Nhat($user,$old_pass,$new_pass,$ho_ten_dem,$ten,$gioi_tinh,$ngay_sinh,$dia_chi,$so_cmnd,$so_dien_thoai,$email){
		global $ketnoi_SQL;
		//
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($user);
		$param_array->add_param($old_pass);
		//
		$result = new \class_dir\mysql_dir\VinhNT_Result();
		//check data
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Check_Cau_Thu_Exists',$param_array);
		if($mangKetQua[0]['ket_qua'] == 1){
			$this->update_cau_thu(		$user
							,	$new_pass
							,	$ho_ten_dem
							,	$ten
							,	$gioi_tinh
							,	$ngay_sinh
							,	$dia_chi
							,	$so_cmnd
							,	$so_dien_thoai
							,	$email
						 );
		}
		if($mangKetQua[0]['ket_qua'] == 0){
			$result->add_Error(1, "mat khau cu chua chinh xac");
		}
		$result->hien_json();
	}
	public function update_cau_thu(	$user
								,	$new_pass
								,	$ho_ten_dem
								,	$ten
								,	$gioi_tinh
								,	$ngay_sinh
								,	$dia_chi
								,	$so_cmnd
								,	$so_dien_thoai
								,	$email
								)
	{
		global $ketnoi_SQL;
		//
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($user);
		$param_array->add_param($new_pass);
		$param_array->add_param($ho_ten_dem);
		$param_array->add_param($ten);
		$param_array->add_param($gioi_tinh);
		$param_array->add_param($ngay_sinh);
		$param_array->add_param($dia_chi);
		$param_array->add_param($so_cmnd);
		$param_array->add_param($so_dien_thoai);
		$param_array->add_param($email);
		//
		$mangKetQua = $ketnoi_SQL->query_update_data('Proc_Update_CauThu',$param_array);
	}
}