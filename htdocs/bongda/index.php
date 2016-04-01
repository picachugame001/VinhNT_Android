<?php
	function __autoload($class_name) {
		include $class_name . '.php';
	}
	$request_body = file_get_contents('php://input');//lay body request
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
			$ga = new class_dir\function_dir\Func_Login();
			break;
		default:
			echo "{'status2':'" . count($inputArray) ."'}";
			break;
	}
	
	//if($function == 'login')
	#dau gi day
	//$ga = new class_dir\BaseInput();
?>