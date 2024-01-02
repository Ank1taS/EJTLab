package com.example.assignment8;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.assignment8.beans.Employee;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String action = request.getParameter("button");
        System.out.println(action);
//        String msg = "";

        try {
            // load JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Establish a connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ankita");

            if ("insert".equals(action)) {
                Employee emp = new Employee();

                emp.setName(request.getParameter("name"));
                emp.setId(request.getParameter("id"));
                emp.setContact(request.getParameter("ph"));
                emp.setDepartment(request.getParameter("dept"));

                PreparedStatement ps = con.prepareStatement("INSERT INTO employeeInfo (name, id, phone, department) VALUES (?,?,?,?)");

                ps.setString(1, emp.getName());
                ps.setString(2, emp.getId());
                ps.setString(3, emp.getContact());
                ps.setString(4, emp.getDepartment());

                ps.executeUpdate();
            } else if (action.equals("search")) {
                int id = Integer.parseInt(request.getParameter("id"));

                // search in database
                PreparedStatement ps = con.prepareStatement("SELECT  * FROM employeeInfo WHERE id = ?");
                ps.setInt(1, id);
                ResultSet result = ps.executeQuery();
                Employee emp = new Employee();

                if (result.next()) {
                    emp.setName(result.getString("name"));
                    emp.setId(result.getString("id"));
                    emp.setContact(result.getString("phone"));
                    emp.setDepartment(result.getString("department"));

                    request.setAttribute("employee", emp);
                }
            }

            // Forward to JSP
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    public void destroy() {
    }
}