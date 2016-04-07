<?php
	function __autoload($class_name) {
		if(PHP_OS == 'Linux'){
			$fix_name = str_replace('\\','/',$class_name);
			include $fix_name . '.php';
		}
		else{
			include $class_name . '.php';
		}
		
	}
	$request_body = file_get_contents('php://input');//lay body request
	$ketnoi_SQL = new \class_dir\mysql_dir\VinhNT_Mysql();
	//$request_body = $_POST['json'];
	$inputArray = json_decode($request_body,true);
	//
	//get function name
	$function = $inputArray['function'];
	//$function = $_POST["function"];
	
	//chose function
	switch ($function){
		case "VinhNT":
			echo "{'status':'OK'}";
			break;
		case "login":
			$ga = new \class_dir\function_dir\Func_Login($inputArray);
			break;
		case "dang_ky_cau_thu":
			$ga = new \class_dir\function_dir\Func_Insert_CauThu($inputArray);
			break;
		default:
			echo "{'status2':'" . count($inputArray) ."'}";
			break;
	}
	
	//if($function == 'login')
	#dau gi day
	//$ga = new class_dir\BaseInput();
?>