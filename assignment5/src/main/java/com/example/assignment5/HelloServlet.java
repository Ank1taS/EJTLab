package com.example.assignment5;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // receives response from the user
        String name = request.getParameter("name");
        String phone = request.getParameter("ph");
        String email = request.getParameter("email");

        try {
            // load the JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Establish a connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ankita");
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ankita");

            // sql query
            String query = "INSERT INTO personInfo VALUES (?,?,?)";

            // prepare sql statement
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2,phone);
            ps.setString(3,email);

            // execute the statement
            int rowInserted = ps.executeUpdate();

            //close resources
            ps.close();
            con.close();

            if (rowInserted != 0) {
                out.println("<html><body>");
                out.println("<h1>Contact added successfully</h1>");
                out.println("</body></html>");
            }
            else {
                out.println("<html><body>");
                out.println("<h1>Failed to add Contact. Please try again</h1>");
                out.println("</body></html>");
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public void destroy() {
    }
}