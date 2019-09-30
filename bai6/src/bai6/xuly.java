package bai6;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static java.sql.DriverManager.getConnection;

import java.beans.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet")
public class xuly extends HttpServlet {
	
	//private static String DB_URL = "jdbc:sqlserver://PC\\\\SQLEXPRESS:1433;databaseName=Baitap1sql;integratedSecurity=true";
	private static String DB_URL = "jdbc:mysql://localhost:8080/testjava";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "04121998";
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("btn").equals("Login"))
		{
			resp.setContentType("text/html; charset=utf-8");
			PrintWriter out = resp.getWriter();
			
		try {
			out.print("hello quat </br>");
				
				Class.forName("com.mysql.cj.jdbc.Driver");  
			    Connection conn = DriverManager.getConnection(DB_URL,"root","");
				//Connection conn = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
				// crate statement
	            PreparedStatement stmt =  conn.prepareStatement("select * from KhachHang");
	            // get data from table 'student'
	            ResultSet rs = stmt.executeQuery();
	            // show data
	            while (rs.next()) {
	               out.print(rs.getString(1));    
	           }
	            // close connection
	            conn.close();
				
			}catch(Exception e) {
	            out.print(e);
	        }
	}
	}

}
