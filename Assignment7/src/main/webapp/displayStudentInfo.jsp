<%--
  Created by IntelliJ IDEA.
  User: sahoo
  Date: 29/12/2023
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example.assignment7.beans.Student"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student details page</title>
</head>
<body>
<h2>Student details</h2>
<%
    // retrieve from request
    String name = request.getParameter("name");
    String roll = request.getParameter("roll");
    String gender = request.getParameter("gender");
    String semester = request.getParameter("semester");

    // create new instance of student (bean) and set the value
    Student st = new Student();
    st.setName(name);
    st.setRoll(roll);
    st.setGender(gender);
    st.setSemester(semester);
%>

Name: <%= st.getName()%><br>
Roll no.: <%= st.getRoll()%><br>
Gender: <%= st.getGender()%><br>
Semester: <%= st.getSemester()%><br>

</body>
</html>
