 // A $( document ).ready() block.
$( document ).ready(function() {
    console.log( "ready!" );
	setEvent();
	
});
function setEvent(){
	$('#btn_A').click(
		function(){
			sendAjax();
		}
	)
}
function sendAjax(){
	/*var data = {
		'function':'test'
	,	ten_doi_bong:'a'
	,	'user':'abc'
	,	'old_password':'255555'
	,	'new_password':'123456789'
	,	password:'123'
	,	'ho_ten_dem':'a'
	,	'ten':'b'
	,	'gioi_tinh':1
	,	'ngay_sinh':{
						year:2001
					,	month:11
					,	date:12
					}
	,	'dia_chi':'vai ca dia chi'
	,	'so_cmnd':'234'
	,	'so_dien_thoai':587
	,	'email':'a@b.cj'
	};*/
	var data = {
		function:'duyet_don_gia_nhap'
	,	user:'abc'
	,	password:123
	,	ten_doi_bong:'gcc'
	,	"ma_doi_bong":"bd0000001"
	,	list_cau_thu: [{"ngay_nop_don":{"date":25,"month":4,"year":2016},"tuoi":"14","ten":"dfg34","gio_nop_don":{"second":0,"minute":27,"hour":4},"user":"abc","ho_ten_dem":"wer"},{"ngay_nop_don":{"date":25,"month":4,"year":2016},"tuoi":"0","ten":"wer","gio_nop_don":{"second":0,"minute":27,"hour":4},"user":"abc2","ho_ten_dem":"qwr"}]
	,	user:'abc'
	,	list_doi_bong:[
			{
				ma_doi_bong:'bd0000001'
			,	ten:'vinh'
			}
		,	{
				ma_doi_bong:'bd0000003'
			,	ten:'quang'
			}
		,	{
				ma_doi_bong:'bd0000004'
			,	ten:'muon nam'
			}
		]
	};
	jQuery.ajax(
		{
			url:'http://localhost/bongda/'
		,	dataType: 'json'
		,	type:'post'
		,	data:JSON.stringify(data)
		,	success:function(data){
				console.log(data);
			}
		,   contentType: "application/json"
		
		}
	);
}
