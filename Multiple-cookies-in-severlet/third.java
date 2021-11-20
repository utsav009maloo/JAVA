import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class third extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
       Cookie c[]=request.getCookies();
        for (Cookie c1 : c) {
            out.print("<body bgcolor='Khaki'>");
            out.println("<p>");
            out.println("CookieName=" + c1.getName() + "CookieValue=" + c1.getValue());
            out.println("</p>");
            out.print("</body>");
        }
    } 
}
