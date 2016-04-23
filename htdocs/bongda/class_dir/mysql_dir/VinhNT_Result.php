<?php
namespace class_dir\mysql_dir;
class VinhNT_Result{
	//
	private $array_Result;
	private $array_Error;
	//public function 
	function __construct() {
		$this->array_Result = array();
		$this->array_Result['z']='z';
		$this->array_Error = array();
	}
	public function add_Result($key,$value){
		$this->array_Result[$key] = $value;
	}
	public function add_Error($code,$description,$sub_code){
		$error = array();
		$error['code'] = $code;
		$error['description'] = $description;
		$error['sub_code'] = $sub_code;
		$this->array_Error[] = $error;
	}
	public function add_Array_Error($array_error){
		$length = \count($array_error);
		for($i=0;$i<$length;$i++){
			$code = $array_error[$i]['error_code'];
			$description = $array_error[$i]['description'];
			$sub_code = $array_error[$i]['sub_code'];
			$this->add_Error($code,$description,$sub_code);
		}
	}
	public function hien_json(){
		$json = array();
		$json['results'] = $this->array_Result;
		$json['errors'] = $this->array_Error;
		echo json_encode($json);
	}
}