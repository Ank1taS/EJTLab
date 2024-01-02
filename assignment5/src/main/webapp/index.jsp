<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>person details collection page</title>
</head>
<body>
<h1>Welcome</h1>

<form action="hello-servlet" method="post">
  <label>Name      :</label>
  <input type="text" name="name" >
  <br>
  <label>contact no:</label>
  <input type="number" name="ph" >
  <br>
  <label>Email ID  :</label>
  <input type="email" name="email" >
  <br>
  <button type="submit">SUBMIT</button>
</form>
</body>
</html>