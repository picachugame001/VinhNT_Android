<?php
namespace class_dir\function_dir\func_duyet_don;
class Row_Cau_Thu extends \class_dir\param_dir\table\Row_input{
	function __construct($inputArray) {
		$this->value = array();
		$cau_thu = new \class_dir\param_dir\In_User($inputArray);
		$this->setValue($cau_thu);
	}
}