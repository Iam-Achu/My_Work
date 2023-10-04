package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/Aboutus.do")
public class About extends HttpServlet {
	protected void doGet(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws ServletException, IOException
{
		String name = httpRequest.getParameter("name");
		httpRequest.setAttribute("name", "Thanmay");
		httpRequest.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(httpRequest, httpResponse);
		
}
}
	  
	

