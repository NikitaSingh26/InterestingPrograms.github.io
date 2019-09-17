package beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/working")
public class Working extends HttpServlet
{
   int count = 0; 
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException 
	{
		res.setContentType("text/html");
		
		String choice = req.getParameter("r1");
		PrintWriter p = res.getWriter();
		 
	 if(choice != null)
	 {
		if(choice.equals("newAcc"))
		{
		 if(count == 0)
		 {
	       res.sendRedirect("new.html"); 
		 }
		 else
		 {
			p.println("<h2>OOPS.. You cannot open an account more than once!! </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		 }
		 
		 count++;
		}
		else if(choice.equals("deposit"))
		{
			res.sendRedirect("deposit.html");
		}
		else if(choice.equals("withdraw"))
		{
			res.sendRedirect("withdraw.html");
		}
		else if(choice.equals("balance"))
		{
			res.sendRedirect("balance.html");
		}
	 }else
	 {
		 RequestDispatcher rd = req.getRequestDispatcher("index.html");
		 p.println("<h3> Please choose an option first </h3>");
		 rd.include(req,res);
		 
	 }
	 
	
}
}