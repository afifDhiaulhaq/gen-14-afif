<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page isELIgnored = "false" %>
<!DOCTYPE html>

<html>
<script type="text/javascript">
	function validateForm() {
	  var nama = document.forms["formEdit"]["nama"].value;
	  
	  var regex_nama = /^[a-zA-Z]+$/;
	  if (nama == "") {
	    alert("semua field harus diisi");
	    return false;
	  }
	   if(!nama.match(regex_nama)){
		   alert(" nama tidak boleh mengandung angka");
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
<h1>Ubah Data</h1>
<form action="update" name="formEdit" id="formEdit" onsubmit="return validateForm()">
kode  dosen : <input type="text" name="kode_dosen" readonly value='<c:out value="${dosen.kode_dosen}"/>'><br>
nama dosen : <input type="text" name="nama" value='<c:out value="${dosen.nama}"/>'><br>
<input type="submit" value="submit">
</form>

</body>
</html>