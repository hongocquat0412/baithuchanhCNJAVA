package bai4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profileservlet")
public class profileservlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		Cookie ck[] = req.getCookies();
		if(ck!= null) 
		{
			String name = ck[0].getValue();
			if(name.equals("")|| name!=null) {
				out.print("<b> Bạn đã có cookies </b>");
				out.print("</br> welcome "+name);
			}
		}
		else {
			out.print("<b> Bạn cần phải đăng nhập lại để có cookies </b>");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
