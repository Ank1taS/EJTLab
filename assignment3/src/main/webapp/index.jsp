<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>student details</title>
</head>
<body>
<%--<h1><%= "" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>

<form action="hello-servlet" method="post">
    <label>Name: </label>
    <input type="text" name="stName" required>
    <br>

    <label>Roll No: </label>
    <input type="number" name="stRoll" required>
    <br>

    <label>Gender: </label>
    <input type="radio" name="gender" value="Male" required>Male
    <input type="radio" name="gender" value="Female" > Female
    <br>

    <label>Semester: </label>
    <select name="semester" required>
        <option value="1">1st semester</option>
        <option value="2">2nd semester</option>
        <option value="3">3rd semester</option>
        <option value="4">4th semester</option>
    </select>
    <br>

    <label>Programming Languages Known:</label>
    <input type="checkbox" value="C" name="programmingLanguage"> C
    <input type="checkbox" value="C++" name="programmingLanguage"> C++
    <input type="checkbox" value="java" name="programmingLanguage"> java
    <input type="checkbox" value="python" name="programmingLanguage"> python
        <!-- Add more programming languages options as needed -->
    <br>

    <button type="submit">Submit</button>
</form>


</body>
</html>