package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("    .col{\n");
      out.write("    height: 50px;\n");
      out.write("    font-family :\"times new roman\";\n");
      out.write("    color:black;\n");
      out.write("    font-size: 23px;\n");
      out.write("box-shadow:black 1px 1px 1px;     \n");
      out.write("\n");
      out.write("       }\n");
      out.write("        .col:hover{\n");
      out.write("            background-color:black;\n");
      out.write("            text-color:white; \n");
      out.write("        }\n");
      out.write("          .col1{\n");
      out.write("    height: 50px;\n");
      out.write("    font-family :\"times new roman\";\n");
      out.write("    color:maroon;\n");
      out.write("    font-size: 33px;\n");
      out.write("box-shadow:black 1px 1px 1px;     \n");
      out.write("\n");
      out.write("       }\n");
      out.write("        .col1:hover{\n");
      out.write("            background-color:chocolate;\n");
      out.write("          text-color:white;\n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color:black;\n");
      out.write("        }    \n");
      out.write("        a:hover{\n");
      out.write("            color:white;\n");
      out.write("        }\n");
      out.write("/*       \n");
      out.write("       .submit:hover{\n");
      out.write("            background-color:black;\n");
      out.write("            text-color:white; \n");
      out.write("           color: yellow;\n");
      out.write("  \n");
      out.write("       }*/\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <body background = \"hostel.jpeg\" >\n");
      out.write("\n");
      out.write("    <div width=300px height=500px style=\"background-color:rgba(255,255,255,0.5);height:100px;border:solid \" >\n");
      out.write("        <table width =\"100%\" style=\"padding-top:30px;\">\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <td class=\"col\" style=\"width:15px\"> <a href =\"HomePage.jsp\" > HOME </a> </td>\n");
      out.write("                 <td class=\"col\" style=\"width:15px\"> <a href =\"about.jsp\" > ABOUT</a> </td>\n");
      out.write("                 <td class=\"col\" style=\"width:15px\"> <a href =\"contact.jsp\" > CONTACT</a> </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("       </div>\n");
      out.write("            <hr>\n");
      out.write("             <div width=300px height=800px style=\" background-color:rgba(255,255,255,0.5); height:600px; border:solid \" >\n");
      out.write("                 <table align=\"center\"  border=\"1\" width =\"30%\" style=\"border: solid;\"  >\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <td class=\"col1\"  style=\"width:15px ; padding-top: 20px; \"> <a href =\"DeleteHostel.jsp\" ><b>DELETE HOSTEL</b></a> </td>\n");
      out.write("            </tr>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <tr align=\"center\">\n");
      out.write("      <td class=\"col1\" style=\"width:15px; padding-top: 20px;\"> <a href =\"review.jsp\" ><b> REVIEW</b></a> </td></tr>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                \n");
      out.write("            <td class=\"col1\" style=\"width:15px; padding-top: 20px\"> <a href =\"complain.jsp\" > <b>COMPLAIN</b></a> </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("       </div>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("<!--                     <form action=\"AdminPage.jsp\" >\n");
      out.write("    <table align=\"center\"  cellspacing='10' width=\"30%\"   style=\"border:inset;border-color: white;height: 600px\">\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td class=\"signin\"  rowspan='2' colspan=\"2\"><h1 style=\"font-family:arial;color:black;text-transform: uppercase;background-color:cornsilk; border-radius: 10px;\">CREATE ACCOUNT</h1></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            </tr>\n");
      out.write("             <tr align=\"center\">\n");
      out.write("            <td ><h2>Id</h2></td>\n");
      out.write("            <td class=\"tabletheme\"><input type=\"text\"  name=\"lid\" placeholder=\"enter id\"\n");
      out.write("                style=\"width:200px; height:40px; border-radius: 20px; border-width: 5px\"</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td ><h2>Password</h2></td>\n");
      out.write("            <td class=\"tabletheme\"><input type=\"password\"  name=\"pass\" placeholder=\"enter password\"\n");
      out.write("            style=\"width:200px; height:40px; border-radius: 20px; border-width: 5px\" </td>\n");
      out.write("        </tr>\n");
      out.write("              <tr align=\"center\">\n");
      out.write("                  <td ><h2>Owner Name</h2></td>\n");
      out.write("            <td class=\"tabletheme\"><input type=\"text\"  name=\"username\" placeholder=\"enter owner Name\"\n");
      out.write("                style=\"width:200px; height:40px; border-radius: 20px; border-width: 5px\"</td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("         <tr align=\"center\">\n");
      out.write("                  <td ><h2>Contact</h2></td>\n");
      out.write("            <td class=\"tabletheme\"><input type=\"text\"  name=\"contact\" placeholder=\"enter Contact\"\n");
      out.write("                style=\"width:200px; height:40px; border-radius: 20px; border-width: 5px\"</td>\n");
      out.write("        </tr>\n");
      out.write("          <tr align=\"center\">\n");
      out.write("                  <td ><h2>City</h2></td>\n");
      out.write("            <td class=\"tabletheme\"><input type=\"text\"  name=\"city\" placeholder=\"enter City\"\n");
      out.write("                style=\"width:200px; height:40px; border-radius: 20px; border-width: 5px\"</td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td   colspan=\"2\"><input type=\"submit\" value=\"REGISTER\" \n");
      out.write("                 style=\"  border-radius: 20px;\"                  \n");
      out.write("            </td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("    </tr>                        \n");
      out.write("</table>-->\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("                   </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
