<?php
namespace class_dir\mysql_dir;
class VinhNT_Result{
	//
	private $array_Result;
	private $array_Error;
	//public function 
	function __construct() {
		$this->array_Result = array();
		$this->array_Error = array();
	}
	public function add_Result($result){
		$this->array_Result[] = $result;
	}
	public function add_Error($code,$description){
		$error = array();
		$error['code'] = $code;
		$error['description'] = $description;
		$this->array_Error[] = $error;
	}
	public function hien_json(){
		$json = array();
		$json['results'] = $this->array_Result;
		$json['errors'] = $this->array_Error;
		echo json_encode($json);
	}
}