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
		PrintWriter out = httpResponse.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>About Us</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("I am a Java Developer");
		out.println("</body>");
		out.println("</html>");
}
}
	  
	

