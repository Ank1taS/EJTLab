package com.example.assignment3;

import java.io.*;
import java.lang.String;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // get values
        String name = request.getParameter("stName");
        String roll = request.getParameter("stRoll");
        String gender = request.getParameter("gender");
        String semester = request.getParameter("semester");
        String[] programmingLanguage = request.getParameterValues("programmingLanguage");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Student Details</h1>");
        out.println("<p> Name: " + name + "</p>");
        out.println("<p> Roll No.: " + roll + "</p>");
        out.println("<p> Gender: " + gender + "</p>");
        out.println("<p> Current semester: " + semester + "</p>");
        out.print("<p> Programming language known: ");
        for (String pl: programmingLanguage) {
            out.print(pl + ", ");
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}