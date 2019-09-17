package beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/new")
public class NewAccount extends HttpServlet
{
 
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		
	  try
	  {
		String name = req.getParameter("t1");
		String email = req.getParameter("t2");
		String amount = req.getParameter("t3");
		String custID ; 
		int amt = Integer.parseInt(amount);
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYhhmmss");
		String str = sdf.format(d);
		custID = str + name.substring(0, 2);
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:33060/BankingSystem","root","1234");
		Statement st = c.createStatement();
		int ack = st.executeUpdate("insert into userdata values('"+custID+"','"+name+"','"+email+"','"+amt+"')");
		
		p.println("<h1>Your unique CustomerID id "+custID+"</h1><br>");
		p.println("<h2><i>You better note it down for all future reference</i></h2><br>");
		p.println("<h3> Your account has been created </h3><br><br>");
		
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
