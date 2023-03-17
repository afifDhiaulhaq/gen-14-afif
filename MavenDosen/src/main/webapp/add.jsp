<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<script type="text/javascript">
	function validateForm() {
	  var kode_dosen = document.forms["formInsert"]["kode_dosen"].value;
	  var nama = document.forms["formInsert"]["nama"].value;
	  
	  var regex_kode = /^[0-9]+$/;
	  var regex_nama = /^[a-zA-Z]+$/;
	  if (kode_dosen == "" || nama == "") {
	    alert("semua field harus diisi");
	    return false;
	  }
	   if(!nama.match(regex_nama)){
		   alert(" nama tidak boleh mengandung angka");
		   return false;
	   }
	   if(!kode_dosen.match(regex_kode)){
		   alert(" kode tidak boleh mengandung huruf");
		   return false;
	   }
	   
	   alert(" data berhasil ditambahkan")
	   return true;
	}
</script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Tambah Data</h1>
<form action="insert" name="formInsert" onsubmit="return validateForm()" id="formInsert">
kode dosen : <input type="text" name="kode_dosen" value="<c:out value='${dosen.kode_dosen}' />"><br>
nama       : <input type="text" name="nama" value="<c:out value='${dosen.nama}' />"><br>
<input type="submit" vale="submit">
</form>

</body>
</html>