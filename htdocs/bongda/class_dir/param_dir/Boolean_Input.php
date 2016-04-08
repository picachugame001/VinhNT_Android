<?php
namespace class_dir\param_dir;
class Boolean_Input extends \class_dir\BaseInput{
	//constructor
	function __construct($inputArray) {
		parent::__construct($inputArray);
		switch($this->value){
			case 0:
				$this->value = false;
				break;
			case 1:
				$this->value = true;
				break;
		}
	}
	//public function 
	public function getValueParam(){
		return   $this->value?'true':'false'; 
	}
}