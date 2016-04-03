<?php
namespace class_dir\param_dir;
class Array_Param {
	//
	private $arrray_Param;
	//
	//public function 
	function __construct() {
		$this->arrray_Param = array();
	}
	//public function 
	public function add_param($input){
		$this->arrray_Param[] = $input;
	}
	//
	//public function 
	public function getStringParam(){
		$length = count($this->arrray_Param); 
		if($length == 0){
			return '';
		}
		else{
			if($length == 1){
				return $this->arrray_Param[0]->getValueParam(); 
			}
			else{
				$return_String='';
				for ($i = 0; $i < ($length-1); $i++) {
					$return_String .= $this->arrray_Param[$i]->getValueParam() . ',';
				}
				$return_String .= $this->arrray_Param[($length-1)]->getValueParam();
				return $return_String;
			}
		}
	}
}