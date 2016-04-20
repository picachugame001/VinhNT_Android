<?php
namespace class_dir\function_dir\param_xin_gia_nhap;
class Table_Xin_Gia_Nhap extends \class_dir\param_dir\table\Table_Input{
	public function getFieldName(){
		return "list_doi_bong";
	}
	public function init_Row($object_array){
		//return Row
		// new custom Row
		$newRow = new \class_dir\function_dir\param_xin_gia_nhap\Row_Doi_Bong($object_array);
		return $newRow;
	}
}