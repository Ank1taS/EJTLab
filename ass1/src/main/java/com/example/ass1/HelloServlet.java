package com.example.ass1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.lang.String;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private int counter;

    public void init() {
        counter = 0;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ++counter;

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String msg1 = "This page is visited ";
        String msg2 = " times";

        out.print("<html><body><p>" + msg1 + counter + msg2 + "</p><body></html>");

    }



    public void destroy() {
    }
}