<?php
namespace class_dir\param_dir\date_time;
class TypeTIME_Input extends \class_dir\BaseInput{
	protected $hour;
	protected $minute;
	protected $second;
	//public function
	function __construct($inputArray) {
		if(\is_array($inputArray)){
			$temp_value = $inputArray[$this->getFieldName()];
			if(\is_null($temp_value)){
				$this->hour = new \class_dir\param_dir\date_time\Hour_Input(null);
				$this->minute = new \class_dir\param_dir\date_time\Minute_Input(null);
				$this->second = new \class_dir\param_dir\date_time\Second_Input(null);
			}
			else {
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
		
	}
	public function setValue($a){
		$this->value = $a;
		$this->init_value();
	}
	private function init_value(){
		$this->hour = new \class_dir\param_dir\date_time\Hour_Input($this->value);
		$this->minute = new \class_dir\param_dir\date_time\Minute_Input($this->value);
		$this->second = new \class_dir\param_dir\date_time\Second_Input($this->value);
	}
	private function init_from_string($string){
		if(\strcmp($string,'')==0){
			$this->hour = new \class_dir\param_dir\date_time\Hour_Input(null);
			$this->minute = new \class_dir\param_dir\date_time\Minute_Input(null);
			$this->second = new \class_dir\param_dir\date_time\Second_Input(null);
		}
		else{
			$date = null;
			if(\strcmp($string,'now')==0){
				$date01 = \date('H:i:s');
				$date = new \DateTime($date01);
			}
			else{ // string date format
				$date = new \DateTime($string);
			}
				
			$array_input = array();
			$array_input['hour'] = \intval($date->format('H')) ;
			$array_input['minute'] = \intval($date->format('i')) ;
			$array_input['second'] = \intval($date->format('s')) ;
			$this->value = $array_input;
			$this->init_value();
		}
	}
	public function getStringValue(){
		return  $this->hour->getValueParam()
		. ':' . $this->minute->getValueParam()
		. ':' . $this->second->getValueParam()
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
		$this->hour->setResult($object_result);
		$this->minute->setResult($object_result);
		$this->second->setResult($object_result);
	}
}