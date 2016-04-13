<?php
namespace class_dir\param_dir\date_time;
class TypeDATE_Input extends \class_dir\BaseInput{
	protected $year;
	protected $month;
	protected $date;
	//
	//public function 
	function __construct($inputArray) {
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
				
				if(\strcmp($temp_value,'')==0){
					$this->year = new \class_dir\param_dir\date_time\Year_Input(null);
					$this->month = new \class_dir\param_dir\date_time\Month_Input(null);
					$this->date = new \class_dir\param_dir\date_time\Date_Input(null);
				}
				else{
					$date = new \DateTime($temp_value);
					$array_input = array();
					$array_input['year'] = \intval($date->format('Y')) ;
					$array_input['month'] = \intval($date->format('m')) ;
					$array_input['date'] = \intval($date->format('d')) ;
					$this->value = $array_input;
					$this->init_value();
				}
				
			}
			else{
				//type array
				parent::__construct($inputArray);
				$this->init_value();
			}
		}
		
		
		//$this->value = $inputArray[$this->getFieldName()];
	}
	public function setValue($a){
		$this->value = $a; 
		$this->init_value();
	}
	public function init_value(){
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
	public function setResult(&$array_result){
		$object_temp = array();
		$this->year->setResult($object_temp);
		$this->month->setResult($object_temp);
		$this->date->setResult($object_temp);
		$array_result[$this->getFieldName()] = $object_temp;
	}
}