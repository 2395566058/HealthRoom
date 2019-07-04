function flush() {
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
				var array = JSON.parse(msg);
				var app = document.getElementById('app');
				for (var i = 0; i < array.length; i++) {
					var div = document.createElement('div');
					div.setAttribute("class","card");
					var dataa="";
					for(var key in array[i]){
						dataa=dataa+"<p class='card-font'>"+key+":"+array[i][key]+"</p>";
					}
					dataa=dataa+"<br/>";
					div.innerHTML = dataa;
					app.appendChild(div);
				}
			}else{
				alert("Problem retrieving XML data");
			}
		}
	};
	xmlhttp.open("POST", "/HealthRoom/getRegister", true);
	xmlhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	xmlhttp.send();
}



function GetQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}