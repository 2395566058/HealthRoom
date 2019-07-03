function tologin() {
	var username=GetQueryString("username");
	var password=document.getElementById("password").value;
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
				if(msg=="true"){
					window.location.href = "Info.html";
				}else{
					alert(msg);
				}
			}else{
				alert("Problem retrieving XML data");
			}
		}
	};
	xmlhttp.open("POST", "/HealthRoom/tologin", true);
	xmlhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	xmlhttp.send("username="+username+"&&password="+password);
}

function GetQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if (r != null) {
		return unescape(r[2]);
	} else {
		return null;
	}
}