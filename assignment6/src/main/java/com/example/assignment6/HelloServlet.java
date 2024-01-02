package com.example.assignment6;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String ph = request.getParameter("ph");

        try {
            // load the JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Establish a connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ankita");

            // sql query
            String query = "SELECT * FROM personInfo WHERE phone = ?";

            // prepare the sql statement
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, ph);

            // execute statement
            ResultSet dbResponse = ps.executeQuery();

            // process received response of database
            String msg = "";

            if (dbResponse.next()) {
                msg = "Name: " + dbResponse.getString("name") + "<br>Contact number: " + dbResponse.getString("phone") + "<br>Email Id: " + dbResponse.getString("email");
            }
            else {
                msg = "No person with this contact number exists...";
            }

            dbResponse.close();
            ps.close();
            con.close();

            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2>search result:</h2>");
            out.println(msg);
            out.println("</body></html>");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void destroy() {
    }
}