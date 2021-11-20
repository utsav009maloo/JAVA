import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class first extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      
        String login=request.getParameter("login");
        String pwd=request.getParameter("pwd");
        
        if(login.equals("first") && pwd.equals("page"))
        {   Cookie c = new Cookie("c1",login);
            response.addCookie(c);
            out.print("<body bgcolor='Moccasin'>");
            out.println("Cookie named:"+c.getName()+" added");
            String path="/multiple/second";
            out.println("<p><a href="+path+">next page</a></p>");
              out.print("</body>");
        } 
        else { 
} }
}
