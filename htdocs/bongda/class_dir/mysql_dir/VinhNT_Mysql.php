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
	public function thucThi_SQL($query){
		$res = $this->mysqli->query($query);
		return $res;
	}
}