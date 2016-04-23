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
		$res = $this->mysqli->query($query);
		return $res;
	}
	public function query_get_data($function_name,$array_param){
		$res = $this->query($function_name,$array_param);
		//var_dump($res);
		if(\is_bool($res)){
			return $res;
		}
		else{
			$mangKetQua = $res->fetch_all(MYSQLI_ASSOC);
			//var_dump($mangKetQua);
			return $mangKetQua;
		}
		
	}
	public function query_update_data($function_name,$array_param){
		$res = $this->query($function_name,$array_param);
		return $res;
	}
	// this function reuturn boolean value
	public function checkErrorResult($result){
		global $return_JSON;
		if(\is_bool($result)){
			if($result == false){
				$return_JSON->add_Error(-1, "exception SQL", 0);
				return false;
			}
			return true;
		}
		else{
			if(\is_array($result)){
				if(\count($result)>0){
					if(array_key_exists('error_code', $result[0])){
						$return_JSON->add_Array_Error($result);
						return false;
					}
				}
			}
			return true;
		}
	}
}