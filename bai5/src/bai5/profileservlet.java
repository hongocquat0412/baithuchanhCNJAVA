package bai5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/profileservlet")
public class profileservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession();
		if(session!= null) 
		{
			String name = (String)session.getAttribute("username");
				out.print("<b> Bạn đã có session </b>");
				out.print("</br> welcome "+name);
		}
		else{
			out.print("<b> Bạn cần phải đăng nhập lại để có session </b>");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
