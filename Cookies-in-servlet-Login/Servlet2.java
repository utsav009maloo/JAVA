import java.io.*;  
import javax.servlet.http.*;  
  
public class Servlet2 extends HttpServlet {  
  
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) {
            Cookie ck[]=request.getCookies();
            out.print("<body bgcolor='BlueViolet'>");
            out.print("Hello "+ck[0].getValue());
            out.print("</body>");
        }  
  
         }catch(Exception e){System.out.println(e);}  
    }  
      
  
}  