<?php
namespace class_dir\param_dir\date_time;
class TypeDATE_Input extends \class_dir\BaseInput{
	protected $year;
	protected $month;
	protected $date;
	//
	//public function 
	function __construct($inputArray) {
		parent::__construct($inputArray);
		$this->init_value($inputArray);
		//$this->value = $inputArray[$this->getFieldName()];
	}
	public function setValue($a){
		$this->value = $a; 
		$this->init_value($inputArray);
	}
	public function init_value($inputArray){
		$this->year = new \class_dir\param_dir\date_time\Year_Input($this->value);
		$this->month = new \class_dir\param_dir\date_time\Month_Input($this->value);
		$this->date = new \class_dir\param_dir\date_time\Date_Input($this->value);
	}
	public function getValueParam(){
		return  '\'' . $this->year->getValueParam()
				. '-' . $this->month->getValueParam()
				. '-' . $this->date->getValueParam()
				. '\''; 
	}
}