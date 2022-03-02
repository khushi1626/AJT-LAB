import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addservlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		String nm=req.getParameter("name");
		String pss=req.getParameter("pass");
		
		if(nm.equals("ADMIN") && pss.equals("BVM") )
		{
			RequestDispatcher rd=req.getRequestDispatcher("servlet2");
			rd.forward(req, res);
		}
		else
		{
			res.getWriter().println("InCorrect");
//			RequestDispatcher rd=req.getRequestDispatcher("servlet2");
//			rd.include(req, res);
		}
		
	}
	
}
