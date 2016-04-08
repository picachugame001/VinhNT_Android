<?php
namespace class_dir;
class BaseInput{
	//
	public function getFieldName(){
		return "User";
	}
	//public function 
	function __construct($inputArray) {
		$this->value = $inputArray[$this->getFieldName()];
	}
	protected $value = "B";
	public function setValue($a){
		$this->value = $a; 
	}
	public function getValue(){
		return  $this->value; 
	}
	public function getValueParam(){
		return  '\'' . $this->value . '\''; 
	}
}