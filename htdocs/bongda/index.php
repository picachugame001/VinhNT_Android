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
	date_default_timezone_set('Asia/Ho_Chi_Minh');
	//
	$request_body = file_get_contents('php://input');//lay body request
	$ketnoi_SQL = new \class_dir\mysql_dir\VinhNT_Mysql();
	$return_JSON = new \class_dir\mysql_dir\VinhNT_Result();
	$ketnoi_SQL->moKetNoi();
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
		case "gia_nhap_doi_bong":
			$ga = new \class_dir\function_dir\Func_Gia_Nhap_Doi_Bong($inputArray);
			break;
		case "duyet_don_gia_nhap":
			$ga = new \class_dir\function_dir\func_duyet_don\Func_Duyet_Don_Gia_Nhap($inputArray);
			break;
		case "lay_danh_sach_don_gia_nhap":
			$ga = new \class_dir\function_dir\Func_Get_Don_Gia_Nhap($inputArray);
			break;
		case "thach_dau_tat_ca":
			$ga = new \class_dir\function_dir\Func_Thach_Dau_Tat_Ca($inputArray);
			break;
		case "test":
			$ga = new \Test($inputArray);
			break;
		default:
			echo "{'status':'" . count($inputArray) ."'}";
			break;
	}
	header("Content-type: application/json; charset=utf-8");
	$ketnoi_SQL->dongKetNoi();
	$return_JSON->hien_json();
?>