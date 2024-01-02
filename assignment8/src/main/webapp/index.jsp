<%@ page import="com.example.assignment8.beans.Employee" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>

<!DOCTYPE html>
<html>
<head>
  <title>Employee data</title>
</head>
<body>
<h1>Employee Details</h1>
<hr>

<h2>Insert Employee Details</h2><br>
<form action="hello-servlet" method="post">
  <label>Employee Name:</label>
  <input type="text" name="name"><br>
  <label>Employee ID  :</label>
  <input type="text" name="id"><br>
  <label>Employee Contact:</label>
  <input type="text" name="ph"><br>
  <label>Employee Department  :</label>
  <input type="text" name="dept"><br>
  <button type="submit" value="insert" name="button">SUBMIT</button>
</form>
<hr>
<h2>Search Employee Details</h2>
<form action="hello-servlet" method="post">
  <label>Employee ID   :</label>
  <input type="text" name="id"><br>
  <button type="submit" value="search" name="button">SUBMIT</button>
</form>
<c:if test="${not empty employee}">
  <h3>Employee Details:</h3>
  Employee ID: ${employee.id}<br>
  Employee Name: ${employee.name}<br>
  Department: ${employee.department}<br>
  Phone: ${employee.contact}<br>
</c:if>
</body>
</html>