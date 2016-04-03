<?php
namespace class_dir\function_dir;
use class_dir\param_dir as param;
use class_dir as base;
use class_dir\mysql_dir as mysql_dir;

class Func_Insert_CauThu extends base\BaseFunction{
	//
	
	//public function 
	function __construct() {
		$user = new \class_dir\param_dir\In_User();
		$pass = new \class_dir\param_dir\In_Password();
		$this->dang_Ky($user,$pass);
	}
	public function dang_Ky($user,$pass){
		global $ketnoi_SQL;
		//
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($user);
		//
		$result = new \class_dir\mysql_dir\VinhNT_Result();
		
		//
		//$ketnoi_SQL->moKetNoi();
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Login',$param_array);
		//$ketnoi_SQL->dongKetNoi();
		if(count($mangKetQua)==0){
			//co the dang ki
			$this->dang_Ky_Moi($user,$pass);
		}
		else{
			//khong the dang ki
			$result->add_Error(1,'tai khoan da ton tai');
		}
		
		$result->hien_json();
	}
	public function dang_Ky_Moi($user,$pass){
		global $ketnoi_SQL;
		//
		$param_array = new \class_dir\param_dir\Array_Param();
		$param_array->add_param($user);
		$param_array->add_param($pass);
		//
		//$ketnoi_SQL->moKetNoi();
		$mangKetQua = $ketnoi_SQL->query_get_data('Proc_Insert_CauThu',$param_array);
		//$ketnoi_SQL->dongKetNoi();
	}
}