<?php
namespace class_dir\mysql_dir;
class VinhNT_Mysql{
	//
	private $host ="localhost";
	private $user ="picachusays";
	private $password ="qqqqqqqq";
	private $database ="bongda";
	private $mysqli;
	private $errorFlag = 0;
	//public function 
	function __construct() {
		
	}
	public function moKetNoi(){
		$this->mysqli = new \mysqli(
										$this->host
									,	$this->user
									,	$this->password
									,	$this->database
								);
		if ($this->mysqli->connect_errno) {
			$this->errorFlag = -1; //error 
		}
		return $this->errorFlag;
	}
	public function dongKetNoi(){
		$this->mysqli->close();
	}
	public function get_String_Param($array_param){
		$string_return = '';
		if(is_null($array_param)){
		}
		else{
			$string_return = $array_param->getStringParam();
		}
		return $string_return;
	}
	public function query($function_name,$array_param){
		$param_string = $this->get_String_Param($array_param);
		$query = 'CALL ' . $function_name . '(' . $param_string . ')';
		//var_dump($query);
		$this->moKetNoi();
		$res = $this->mysqli->query($query);
		$this->dongKetNoi();
		return $res;
	}
	public function query_get_data($function_name,$array_param){
		$res = $this->query($function_name,$array_param);
		$mangKetQua = $res->fetch_all(MYSQLI_ASSOC);
		return $mangKetQua;
	}
	public function query_update_data($function_name,$array_param){
		$res = $this->query($function_name,$array_param);
		return $res;
	}
}