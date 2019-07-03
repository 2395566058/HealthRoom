function GetQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}

function flush() {
	if (window.location.search != "") {
		if (GetQueryString("name") != null) {
			document.getElementById("name").value = GetQueryString("name");
		}
		if (GetQueryString("id_no") != null) {
			document.getElementById("id_no").value = GetQueryString("id_no");
		}
		if (GetQueryString("sex") != null) {
			document.getElementById("choosecolor").innerHTML = GetQueryString("sex");
		}
		if (GetQueryString("birth") != null) {
			document.getElementById("birth").value = GetQueryString("birth");
		}
		if (GetQueryString("mobile") != null) {
			document.getElementById("mobile").value = GetQueryString("mobile");
		}
		if (GetQueryString("job") != null) {
			document.getElementById("job").value = GetQueryString("job");
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
	var type = "其他人员";
	var name = document.getElementById("name").value;
	var id_no = document.getElementById("id_no").value;
	var sex = document.getElementById("choosecolor").innerHTML;
	var birth = document.getElementById("birth").value;
	var mobile = document.getElementById("mobile").value;
	var job = document.getElementById("job").value;
	var disease_time = document.getElementById("disease_time").value;
	var first_further = document.getElementById("choosecolor4").innerHTML;
	var symptom = document.getElementById("choosecolor5").innerHTML;

	var json = "type=" + escape(type) + "&&id_no=" + escape(id_no) + "&&name="
			+ escape(name) + "&&sex=" + escape(sex) + "&&birth="
			+ escape(birth) + "&&mobile=" + escape(mobile) + "&&job="
			+ escape(job) + "&&disease_time=" + escape(disease_time)
			+ "&&first_further=" + escape(first_further) + "&&symptom="
			+ escape(symptom);
	window.location.href = "Orderlocal.html?" + json;
}