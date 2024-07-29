package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Hostel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/SecurityGuard.jsp");
  }

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


    response.addHeader("Pragma","no-Cache");
     response.addHeader("Cache-Control","no-Store");
//      response.setHeader("Pragma","no-Cache");
//       response.setHeader("Cache-Control","no-Cache");
       String value=(String)session.getAttribute("ACCESS");
       if(value==null)
       {
           response.sendRedirect("HomePage.jsp");
       }
         if(session==null)
       {
           response.sendRedirect("HomePage.jsp");
       }
    
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("    .col{\n");
      out.write("    height: 50px;\n");
      out.write("    font-family :\"times new roman\";\n");
      out.write("    color:black;\n");
      out.write("    font-size: 23px;\n");
      out.write("box-shadow:black 1px 1px 1px;     \n");
      out.write("    /*background-color:white;*/\n");
      out.write("       }\n");
      out.write("        .col:hover{\n");
      out.write("            background-color:black;\n");
      out.write("            text-color:white; \n");
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
      out.write("                  <td class=\"col\" style=\"width:15px\"> <a href =\"logincode.jsp\" > SEARCH</a> </td>\n");
      out.write("                  <td class=\"col\" style=\"width:15px\"> <a href =\"contact.jsp\" > CONTACT </a> </td>\n");
      out.write("                 <td class=\"col\" style=\"width:15px\"> <a href =\"Booking.jsp\" > BOOKING</a> </td>\n");
      out.write("                  <td class=\"col\" style=\"width:15px\"> <a href =\"mailto:\" > QUERY</a> </td>\n");
      out.write("                    <td class=\"col\" style=\"width:15px\"> <a href =\"Review.jsp\" > REVIEW</a> </td>\n");
      out.write("                    <td class=\"col\" style=\"width:15px\"> <a href =\"SessionDestroy.jsp\" > LOGOUT</a> </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("         \n");
      out.write("            <hr>\n");
      out.write("            <div width=300px height=500px style=\"background-color:rgba(255,255,255,0.7);height:600px \" >\n");
      out.write("                      <table  width=\"100%\">\n");
      out.write("                          <tr>\n");
      out.write("                              <td><a href=\"Ultimate.jsp\"><video src=\"hostelpage1.webm\" width=\"100%\" autoplay=\"true\" loop=\"true\" muted=\"true\"  height=\"250px\" controls/></a></td>\n");
      out.write("                                <td><video src=\"hostelpage2.webm\" width=\"100%\" autoplay=\"true\" loop=\"true\" muted=\"true\"  height=\"250px\" controls/>\n");
      out.write("                                </td>\n");
      out.write("                                  \n");
      out.write("                          </tr>\n");
      out.write("                          <br>\n");
      out.write("                  \n");
      out.write("                          <tr>\n");
      out.write("                              <td><video src=\"hostelvideo3.webm\" width=\"100%\" autoplay=\"true\" loop=\"true\" muted=\"true\"  height=\"250px\" controls/>\n");
      out.write("                                </td>\n");
      out.write("                                <td><video src=\"hostelvideo5.webm\" width=\"100%\" autoplay=\"true\" loop=\"true\" muted=\"true\"  height=\"250px\" controls/>\n");
      out.write("                                </td>\n");
      out.write("                                  \n");
      out.write("                          </tr>\n");
      out.write("                      </table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </div>\n");
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
