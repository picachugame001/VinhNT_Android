<?php
namespace class_dir\param_dir\table;
class Row_input  extends \class_dir\BaseInput{
	function __construct($inputArray) {
		//$this->value = array();
		//$param = new \Param($inputArray);
		//Param is not a Row or Table
		//...
		//$this->setValue($param); 
	}
	public function setValue($a){
		if(!isset($this->value)){
			$this->value = array();
		}
		$this->value[] = $a;
	}
	public function getValue(){
		$temp_array = array();
		$length = \count($this->value);
		for($i=0;$i<$length;$i++){
			$this->value[$i]->setResult($temp_array);
		}
		return $temp_array;
	}
	public function setResult(&$array_result){
		$array_result[] = $this->getValue();
	}
	private function get_column_delimiter(){
		return '#C#';//ⓇⒸ
	}
	public function getValueParam(){
		$string_row = '';
		$length = \count($this->value);
		for($i=0;$i<$length;$i++){
			$string_row = $string_row . $this->value[$i]->getValue() . $this-> get_column_delimiter();
		}
		return $string_row;
	}
}