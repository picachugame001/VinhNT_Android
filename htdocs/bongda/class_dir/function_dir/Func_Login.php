<?php
namespace class_dir\function_dir;
use class_dir\param_dir as param;
use class_dir as base;
class Func_Login extends base\BaseFunction{
	//
	//public function 
	function __construct() {
		$user = new param\In_User();
		$pass = new param\In_Password();
	}
	public function checkLogin(){
		
	}
}