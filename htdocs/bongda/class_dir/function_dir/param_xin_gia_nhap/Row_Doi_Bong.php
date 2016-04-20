<?php
namespace class_dir\function_dir\param_xin_gia_nhap;
class Row_Doi_Bong extends \class_dir\param_dir\table\Row_input{
	function __construct($inputArray) {
		$this->value = array();
		$ma_doi_bong = new \class_dir\param_dir\In_Ma_Doi_Bong($inputArray);
		$this->setValue($ma_doi_bong);
	}
	
}