<%@ page import="com.example.assignment7.beans.Student" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
  <title>Assignment7</title>
</head>
<body>
<h2>Student details forms:</h2>
<form action="displayStudentInfo.jsp" method="post">
  <label>Name : </label>
  <input type="text" name="name"><br>
  <label>Roll no :</label>
  <input type="text" name="roll"><br>
  <label>Gender :</label>
  <input type="text" name="gender"><br>
  <label>Semester :</label>
  <input type="text" name="sem"><br>
  <button type="submit">SUBMIT</button>
</form>
</body>
</html>