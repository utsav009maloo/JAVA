/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Utsav Maloo
 */
public class MyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServlet</title>");            
            out.println("</head>");
            out.println("<body Bgcolor=\"pink\">");
            out.println("<h1 align=\"center\"> Shri Vaishnav Vidhyapeeta Vishvavidhyla</h1>");
            out.println("<h2 align=\"center\"> Mst I<sup>th</sup>Marks Sheet</h2>");
            out.println("<table border=\"9\" align=\"center\">");
            out.println("<tr>\n" +
"<th> Name </th>\n" +
"<th> IIT</th>\n" +
"<th> DLCD </th>\n" +
"<th> CPI</th>\n" +
"<th> Maths </th>\n" +
"</tr>");
            out.println("<tr>\n" +
"<td> rajesh </td>\n" +
"<td> 78 </td>\n" +
"<td> 75 </td>\n" +
"<td> 88 </td>\n" +
"<td> 98 </td>\n" +
"</tr>");
            out.println("<td> Utsav </td>\n" +
"<td> 98 </td>\n" +
"<td> 95 </td>\n" +
"<td> 98 </td>\n" +
"<td> 98 </td>\n" +
"</tr>");
            out.println("<td> ram</td>\n" +
"<td> 74 </td>\n" +
"<td> 77 </td>\n" +
"<td> 80 </td>\n" +
"<td> 70 </td>\n" +
"</tr>");
            out.println("<td> Sourabh </td>\n" +
"<td> 98 </td>\n" +
"<td> 85 </td>\n" +
"<td> 98 </td>\n" +
"<td> 88 </td>\n" +
"</tr>");
            out.println("<h4>Click hear to go to<a href=\"why\">Thank you page</a> </h4>");
            out.println("<h4><a href=\"index.html\">Back</a> </h4>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
