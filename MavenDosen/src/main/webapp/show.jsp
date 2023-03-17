<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page isELIgnored = "false" %>



<!DOCTYPE html>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Data</h1>

<button><a href="<%= request.getContextPath() %>/new">Tamabah data</a></button>

<table>
  <tr>
    <th>Kode dosen</th>
    <th>Nama Matkul</th>
    <th>Action</th>
  </tr>
  
<c:forEach var="d" items="${listDosen}">
  <tr>
    <td><c:out value="${d.kode_dosen}"/></td>
    <td><c:out value="${d.nama}"/></td>
    <td>
     	<a href="edit?kode_dosen=<c:out value="${d.kode_dosen}"/>">Edit</a>
     	<a href="delete?kode_dosen=<c:out value="${d.kode_dosen}"/>" onclick="return confirm('anda sudah yakin untuk dihapus?')">Delete</a>
    </td>
  </tr>
</c:forEach>
</table>


</body>
</html>