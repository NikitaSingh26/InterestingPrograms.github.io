package beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/withdraw")
public class Withdraw extends HttpServlet
{
 
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		try
		{
			String id = req.getParameter("tid");
			String amount = req.getParameter("twith");
		    int amt = Integer.parseInt(amount);
		    int a = 0;
		    
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:33060/BankingSystem","root","1234");
			Statement st = c.createStatement();
			
			ResultSet rs = st.executeQuery("select * from userdata");
			while(rs.next())
			{
			 if(rs.getString(1).equals(id))
			 {
				 a = rs.getInt(4);
			 }
			}
			
			if(amt > a)
			{
				RequestDispatcher rd = req.getRequestDispatcher("withdraw.html");
				p.println("<h1> Insufficient Balance!! BACK OFF !!! </h1> ");
				rd.include(req, res);
			}
			else
			{
				a = a - amt;
				int ack = st.executeUpdate("update userdata set Balance = '"+a+"' where ID = '"+id+"'");
				
				p.println("<h2> Withdrawal of "+amt+"has been made successfully</h2>");
			}
			
			
			
			p.println("<button onclick = 'fx()' >");
	        p.println("GO BACK TO PORTAL </button>");
			p.println("<script type = 'text/javascript'>");
			p.println("function fx() {window.location = 'index.html'; }");
			p.println("</script>");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
