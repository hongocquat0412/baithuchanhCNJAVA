package bai4;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		String username = req.getParameter("txtusername");
		String password = req.getParameter("txtpassword");
		String nut = req.getParameter("btn");
		if(nut.equals("Login")) {
			if(username.equals("admin") && password.equals("123")) {
				
				Cookie ck = new Cookie("username", username);
				ck.setMaxAge(60*60*2);// tao cookies trong 2h
				resp.addCookie(ck);
				req.setAttribute("kq", "Xin chao "+username);
				req.getRequestDispatcher("index.jsp").include(req, resp);
				
				
				
			}
			else {
				req.setAttribute("kq", "Tai khoan va mat khau sai");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
			
		}
	}
}
