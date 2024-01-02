<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>User validation page</title>
</head>
<body>
<form action="hello-servlet" method="post">
  <label>Enter User ID: </label>
  <input type="text" name="id" required><br>
  <label>Enter password: </label>
  <input type="password" name="pw" required><br>

  <button type="submit">Submit</button>

</form>
</body>
</html>