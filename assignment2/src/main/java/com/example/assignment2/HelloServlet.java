package com.example.assignment2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);

        // get last access time from the session
        Date lastAccessTime = new Date(session.getLastAccessedTime());
        SimpleDateFormat dtFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");


        out.println("<html><body>");
        out.println("<p>Last access date and time: " + dtFormat.format(lastAccessTime) + "</p>");
        out.println("</body></html>");

    }

    public void destroy() {
    }
}