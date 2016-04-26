<?php
namespace class_dir\function_dir\func_duyet_don;
class Table_Cau_Thu extends \class_dir\param_dir\table\Table_Input{
	public function getFieldName(){
		return "list_cau_thu";
	}
	public function init_Row($object_array){
		//return Row
		// new custom Row
		$newRow = new \class_dir\function_dir\func_duyet_don\Row_Cau_Thu($object_array);
		return $newRow;
	}
}