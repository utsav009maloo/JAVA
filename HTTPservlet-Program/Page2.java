import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Page2 extends HttpServlet
{@Override
   public void doGet(HttpServletRequest request,HttpServletResponse response)
            	   throws ServletException,IOException
   {response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    HttpSession hs=request.getSession(false);  
    String n=(String)hs.getAttribute("s_id");  
    out.print("<body bgcolor='Violet'>");
    out.print("Hello "+n); 
    out.print("<p><a href='Page3'>visit</a></p>");  
     
} }

