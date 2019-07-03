function flush() {
	if (window.location.search != "") {
		if (GetQueryString("patient_no") != null) {
			document.getElementById("patient_no").value = GetQueryString("patient_no");
		}
		if (GetQueryString("name") != null) {
			document.getElementById("name").value = GetQueryString("name");
		}
		if (GetQueryString("sex") != null) {
			document.getElementById("choosecolor").value = GetQueryString("sex");
		}
		if (GetQueryString("birth") != null) {
			document.getElementById("birth").value = GetQueryString("birth");
		}
		if (GetQueryString("mobile") != null) {
			document.getElementById("mobile").value = GetQueryString("mobile");
		}
		if (GetQueryString("disease_time") != null) {
			document.getElementById("disease_time").value = GetQueryString("disease_time");
		}
		if (GetQueryString("first_further") != null) {
			document.getElementById("choosecolor4").value = GetQueryString("first_further");
		}
		if (GetQueryString("symptom") != null) {
			document.getElementById("choosecolor5").value = GetQueryString("symptom");
		}
	}
}

function toOrderlocal() {
	var type = "教工";
	var patient_no = document.getElementById("patient_no").value;
	var name = document.getElementById("name").value;
	var sex = document.getElementById("choosecolor").innerHTML;
	var birth = document.getElementById("birth").value;
	var mobile = document.getElementById("mobile").value;
	var disease_time = document.getElementById("disease_time").value;
	var first_further = document.getElementById("choosecolor4").innerHTML;
	var symptom = document.getElementById("choosecolor5").innerHTML;

	var json = "type=" + escape(type) + "&&patient_no=" + escape(patient_no)
			+ "&&name=" + escape(name) + "&&sex=" + escape(sex) + "&&birth="
			+ escape(birth) + "&&mobile=" + escape(mobile) + "&&disease_time="
			+ escape(disease_time) + "&&first_further=" + escape(first_further)
			+ "&&symptom=" + escape(symptom);
	window.location.href = "Orderlocal.html?" + json;
}

function GetQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}