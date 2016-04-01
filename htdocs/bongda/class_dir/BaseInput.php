<?php
namespace class_dir;
class BaseInput{
	//
	public function getFieldName(){
		return "User";
	}
	//public function 
	function __construct() {
		global $inputArray;
		$this->value = $inputArray[$this->getFieldName()];
	}
	private $value = "B";
	public function setValue($a){
		$this->value = $a; 
		echo "\n" . $this->value; 
	}
	public function getValue(){
		return $this->value; 
	}
}