<?php
class Test{
	function __construct(){
		$this->test01();
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
}