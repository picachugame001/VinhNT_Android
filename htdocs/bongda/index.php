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
	$inputArray = json_decode($request_body,true);
	//
	//get function name
	$function = $inputArray['function'];
	
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
		case "cap_nhat_cau_thu":
			$ga = new \class_dir\function_dir\Func_Update_CauThu($inputArray);
			break;
		case "lay_data_cau_thu":
			$ga = new \class_dir\function_dir\Func_Init_Data_CauThu($inputArray);
			break;
		case "dang_ky_doi_bong":
			$ga = new \class_dir\function_dir\Func_Insert_DoiBong($inputArray);
			break;
		case "tim_kiem_doi_bong":
			$ga = new \class_dir\function_dir\Func_Tim_Kiem_Doi_Bong($inputArray);
			break;
		default:
			echo "{'status':'" . count($inputArray) ."'}";
			break;
	}
?>