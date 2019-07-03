function addRegister() {
	var type=GetQueryString("type");
	var name=GetQueryString("name");
	var sex=GetQueryString("sex");
	var birth=GetQueryString("birth");
	var mobile=GetQueryString("mobile");
	var disease_time=GetQueryString("disease_time");
	var first_further=GetQueryString("first_further");
	var symptom=GetQueryString("symptom");
	var see_date="2019-07-"+day+" "+seedate+":00";
	
	var json="type="+type+"&&name="+name+"&&sex="+sex+"&&birth="+birth+"&&mobile="+
	mobile+"&&disease_time="+disease_time+"&&first_further="+first_further+"&&symptom="+symptom+"&&see_date="+see_date;
	
	if(type=="学生"){
		json=json+"&&patient_no="+GetQueryString("patient_no")+"&&grade="+GetQueryString("grade")+
			"&&dept="+GetQueryString("dept")+"&&major="+GetQueryString("major")+"&&glass="+GetQueryString("glass")+
			"&&dorm="+GetQueryString("dorm");
	}else if(type=="教工"){
		json=json+"&&patient_no="+GetQueryString("patient_no");
	}else{
		json=json+"&&id_no="+GetQueryString("id_no")+"&&job="+GetQueryString("job");
	}
	
	var xmlhttp = null;
	if (window.XMLHttpRequest) {
		xmlhttp = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange =function (){
		if (xmlhttp.readyState == 4) {
			if (xmlhttp.status == 200) {
				var msg=xmlhttp.responseText;
				alert(msg);
				window.location.href = "Order.html";
			}else{
				alert("Problem retrieving XML data");
			}
		}
	};
	xmlhttp.open("POST", "/HealthRoom/addRegister", true);
	xmlhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	xmlhttp.send(json);
}
var seedate=null;
function gettime(obj){
	var data=obj.innerHTML;
	var listdata=data.split("午");
	seedate=listdata[1];
}

function GetQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if (r != null) return unescape(r[2]); 
	return null; 
}

function returnup(){
	var type=GetQueryString("type");
	var search = window.location.search;
	if(type=="学生"){
		window.location.href = "Orderstudent.html"+search;
	}else if(type=="教工"){
		window.location.href = "Orderteacher.html"+search;
	}else if(type=="其他人员"){
		window.location.href = "Orderother.html"+search;
	}else{
		window.location.href = "Order.html";
	}
}