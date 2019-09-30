package bai4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logoutservlet")
public class logoutservlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset= utf-8");
		PrintWriter out = resp.getWriter();
		
		Cookie ck = new Cookie("username", "");
		ck.setMaxAge(0);
		resp.addCookie(ck);
		 
		out.print("Đăng xuất thành công và đã xóa cookies");
	}
}
