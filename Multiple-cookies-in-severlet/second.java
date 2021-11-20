import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class second extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
    PrintWriter out=response.getWriter();
        Cookie c[]=request.getCookies();
        out.println("c.length="+c.length);
     for(int i=0;i<c.length;i++) {
           out.print("<body bgcolor='Tomato'>");
            out.println("CookieName=" + c[i].getName() + 
                        "CookieValue=" + c[i].getValue()); }
           //to add another cookie
           Cookie c1 = new Cookie("c2","0445");
           response.addCookie(c1);

        String path="/multiple/third";
        out.println("<a href="+path+">next page</a>");
    out.print("</body>");}}

