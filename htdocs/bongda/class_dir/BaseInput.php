<?php
namespace class_dir;
class BaseInput{
	//
	public function getFieldName(){
		return "User";
	}
	//public function 
	function __construct($inputArray) {
		if(!is_null($inputArray)){
			$this->value = $inputArray[$this->getFieldName()];
		}
		
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
	public function setResult(&$array_result){
		$array_result[$this->getFieldName()] = $this->getValue();
	}
	public function getStringValue(){
		return $this->value; 
	}
}