package com.example.assignment4;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String validUserId;
    private String validUserPw;

    public void init() {
        // retrieve init parameter from web.xml
        validUserId = getServletConfig().getInitParameter("validUserId");
        validUserPw = getServletConfig().getInitParameter("validPassword");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // retrieve user inputs
        String userId = request.getParameter("id");
        String userPw = request.getParameter("pw");

        boolean validUser = false;
        if (userId.equals(validUserId) && userPw.equals(validUserPw)) {
            validUser = true;
        }

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if (validUser) {
            out.println("<h1>Login successful</h1>");
        }
        else {
            out.println("<h1>Login Failed</h1>");
        }

        out.println("</body></html>");
    }

    public void destroy() {
    }
}