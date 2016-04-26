<?php
namespace class_dir\param_dir\date_time;
class TypeDATETIME_Input extends \class_dir\BaseInput{
	private $date;
	private $time;
	//public function
	function __construct($inputArray) {
		$this->date = new \class_dir\param_dir\date_time\TypeDATE_Input($inputArray);
		$this->time = new \class_dir\param_dir\date_time\TypeTIME_Input($inputArray);
	}
	//
	public function setValue($a){
		$this->date->setValue($a);
		$this->time->setValue($a);
	}
	public function getValueParam(){
		return  '\'' 
		. $this->date->getStringValue()
		. '\'';
	}
	public function getStringValue(){
		return  $this->date->getStringValue()
			.' '
			. $this->time->getStringValue()
		;
	}
	public function setResult(&$array_result){
		$object_temp = array();
		$this->date->setObjectResult($object_temp);
		$this->time->setObjectResult($object_temp);
		$array_result[$this->getFieldName()] = $object_temp;
	}
}