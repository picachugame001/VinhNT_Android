<?php
use class_dir\mysql_dir\VinhNT_Result;
use class_dir\param_dir\Array_Param;

class Test{
	function __construct(){
		$this->test02();
	}
	public function test01(){
		$a = array('User' => '2016-04-19 13:52:19');
		$b = new \class_dir\param_dir\date_time\TypeDATETIME_Input('now');
		$c = array();
		$b->setResult($c);
		var_dump($c);
		$e = $b->getValueParam();
		var_dump($e);
	}
	public function test02(){
		global $ketnoi_SQL;
		$result = new VinhNT_Result();
		$param = new Array_Param();
		$trave = $ketnoi_SQL->query_get_data('Proc_Test', $param);
		if(is_bool($trave) && $trave == false){
			echo 'exception';
		}
		var_dump($trave);
	}
}