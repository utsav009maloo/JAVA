import java.io.*;  
import javax.servlet.http.*;
public class valid extends HttpServlet {  
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
    response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) {
            String n=request.getParameter("userName");
            out.print("Welcome "+n);
            
            Cookie ck=new Cookie("uname",n);
            response.addCookie(ck);
            out.print("<body bgcolor='Chartreuse'>");
            out.print(" <form action=\"Servlet2\" method=\"post\"> ");
            out.print("<input type='submit' value='go'>");
            out.print("</form>");
            out.print("</body>");
        }  
        }catch(Exception e)
        {System.out.println(e);}  
  }  
}  