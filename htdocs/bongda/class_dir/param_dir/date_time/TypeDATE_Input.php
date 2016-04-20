<?php
namespace class_dir\param_dir\date_time;
class TypeDATE_Input extends \class_dir\BaseInput{
	protected $year;
	protected $month;
	protected $date;
	//
	//public function 
	function __construct($inputArray) {
		if(\is_array($inputArray)){
			$temp_value = $inputArray[$this->getFieldName()];
			if(\is_null($temp_value)){
				$this->year = new \class_dir\param_dir\date_time\Year_Input(null);
				$this->month = new \class_dir\param_dir\date_time\Month_Input(null);
				$this->date = new \class_dir\param_dir\date_time\Date_Input(null);
			}
			else{
				if(
						\strcmp(
								\gettype($temp_value)
								,	"string"
								)
						==0
						){
			
							$this->init_from_string($temp_value);
				}
				else{
					//type array
					parent::__construct($inputArray);
					$this->init_value();
				}
			}
		}
		else{ // is string
			$this->init_from_string($inputArray);
		}
		
		
		//$this->value = $inputArray[$this->getFieldName()];
	}
	public function setValue($a){
		$this->value = $a; 
		$this->init_value();
	}
	private function init_value(){
		$this->year = new \class_dir\param_dir\date_time\Year_Input($this->value);
		$this->month = new \class_dir\param_dir\date_time\Month_Input($this->value);
		$this->date = new \class_dir\param_dir\date_time\Date_Input($this->value);
	}
	private function init_from_string($string){
		if(\strcmp($string,'')==0){
			$this->year = new \class_dir\param_dir\date_time\Year_Input(null);
			$this->month = new \class_dir\param_dir\date_time\Month_Input(null);
			$this->date = new \class_dir\param_dir\date_time\Date_Input(null);
		}
		else{
			$date = null;
			if(\strcmp($string,'now')==0){
				$date01 = \date('Y-m-d');
				$date = new \DateTime($date01);
				
			}
			else{
				$date = new \DateTime($string);
			}
			$array_input = array();
			$array_input['year'] = \intval($date->format('Y')) ;
			$array_input['month'] = \intval($date->format('m')) ;
			$array_input['date'] = \intval($date->format('d')) ;
			$this->value = $array_input;
			$this->init_value();
		}
	}
	public function getStringValue(){
		return  $this->year->getValueParam()
		. '-' . $this->month->getValueParam()
		. '-' . $this->date->getValueParam()
		;
	}
	
	public function getValueParam(){
		return  '\'' . $this->getStringValue()
				. '\''; 
	}
	public function setResult(&$array_result){
		$object_temp = array();
		$this->setObjectResult($object_temp);
		$array_result[$this->getFieldName()] = $object_temp;
	}
	public function setObjectResult(&$object_result){
		$this->year->setResult($object_result);
		$this->month->setResult($object_result);
		$this->date->setResult($object_result);
	}
}