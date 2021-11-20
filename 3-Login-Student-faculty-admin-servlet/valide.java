import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class valide extends HttpServlet {
@Override
public void doPost(HttpServletRequest request,HttpServletResponse response) 
			  throws ServletException,IOException
  {   
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	RequestDispatcher rd;
	String login=request.getParameter("login");
	String pwd=request.getParameter("pwd");
	String session=request.getParameter("session_id");
        if(login.equals("Admin") && pwd.equals("Hey"))
{
	rd=request.getRequestDispatcher("weladmin");
	rd.forward(request, response);        
}//if
else
{
 	out.println("<p><h1>Incorrect LoginId/Password </h1></p>");
	rd=request.getRequestDispatcher("/index.html");
	rd.include(request, response);
 }//else
        if(login.equals("Student") && pwd.equals("Why"))
{
	rd=request.getRequestDispatcher("welstu");
	rd.forward(request, response);        
}//if
else
{
 	out.println("<p><h1>Incorrect LoginId/Password </h1></p>");
	rd=request.getRequestDispatcher("/index.html");
	rd.include(request, response);
 }
         if(login.equals("Teacher") && pwd.equals("OK"))
{
	rd=request.getRequestDispatcher("weltea");
	rd.forward(request, response);        
}//if
else
{
 	out.println("<p><h1>Incorrect LoginId/Password </h1></p>");
	rd=request.getRequestDispatcher("/index.html");
	rd.include(request, response);
 }
} }
