<?php
namespace class_dir\param_dir\table;
class Table_Input  extends \class_dir\BaseInput {
	//value is array Row
	//
	public function getFieldName(){
		return "Table";
	}
	function __construct($inputArray) {
		if(!is_null($inputArray)){
			$array_temp = null;
			if(array_key_exists($this->getFieldName(),$inputArray)){
				$array_temp = $inputArray[$this->getFieldName()];
			}
			else{
				$array_temp = $inputArray;
			}
			if(is_array($array_temp)){
				$this->value = array();
				$length = count($array_temp);
				for($i=0;$i<$length;$i++){
					$this->value[] = $this->init_Row($array_temp[$i]);
				}
			}
			
		}
		
		//$this->value = array(); // arrayRow
	}
	//Override
	//////////////////////////////////
	//this function is overwrite
	//////////////////////////////////
	public function init_Row($object_array){
		//return Row 
		// new custom Row
		return null;//return new row
	}
	
	//reuturn Array Object
	public function getValue(){
		$array_return = array();
		$length = count($this->value);
		for($i=0;$i<$length;$i++){
			$array_return[] = $this->value[$i]->getValue();
		}
		return  $array_return;
	}
	public function setValue($a_row){
		$this->value[] = $this->init_Row($a_row);
	}
}