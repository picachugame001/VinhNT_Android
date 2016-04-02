<?php
namespace class_dir\function_dir;
use class_dir\param_dir as param;
use class_dir as base;
use class_dir\mysql_dir as mysql_dir;

class Func_Login extends base\BaseFunction{
	//
	
	//public function 
	function __construct() {
		$user = new param\In_User();
		$pass = new param\In_Password();
		$this->checkLogin($user,$pass);
	}
	public function checkLogin($user,$pass){
		global $ketnoi_SQL;
		$ketnoi_SQL->moKetNoi();
		$a = $ketnoi_SQL->thucThi_SQL('CALL Proc_Login(\''.$user->getValue().'\')');
		$ketnoi_SQL->dongKetNoi();
		$mangKetQua = $a->fetch_all(MYSQLI_ASSOC);
		if(count($mangKetQua)==0){
			$trave["result"] = false;
		}
		else{
			if($mangKetQua[0]["password"] == $pass->getValue()){
				$trave["result"] = true;
			}
			else{
				$trave["result"] = false;
			}
		}
		echo json_encode($trave);
	}
}