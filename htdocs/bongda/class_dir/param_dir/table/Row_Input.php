<?php
namespace class_dir\param_dir\table;
class Row_input  extends \class_dir\BaseInput{
	function __construct($inputArray) {
		//$this->value = array();
		//$param = new \Param($inputArray);
		//$this->setValue($param); 
	}
	public function setValue($a){
		$this->value[$a->getFieldName()] = $a->getValue();
	}
	public function setResult(&$array_result){
		$array_result[] = $this->getValue();
	}
}