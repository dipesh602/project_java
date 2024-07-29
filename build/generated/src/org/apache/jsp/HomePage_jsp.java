package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("    .col{\n");
      out.write("    height: 50px;\n");
      out.write("    font-family :\"times new roman\";\n");
      out.write("    color:black;\n");
      out.write("    font-size: 23px;\n");
      out.write("box-shadow:black 1px 1px 1px;     \n");
      out.write("/*    background-color:white;*/\n");
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
      out.write("        ");

        String value=(String)session.getAttribute("ACCESS");
        
      out.write("\n");
      out.write("\n");
      out.write("    <div width=300px height=500px style=\"background-color:rgba(255,255,255,0.5);height:100px; border: solid\" >\n");
      out.write("        <table width =\"100%\" style=\"padding-top:30px;\">\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <td class=\"col\" style=\"width:15px\"> <a href =\"HomePage.jsp\" > HOME </a> </td>\n");
      out.write("                 <td class=\"col\" style=\"width:15px\"> <a href =\"About.jsp\" > ABOUT</a> </td>\n");
      out.write("                  <td class=\"col\" style=\"width:15px\"> <a href =\"signup.jsp\" > SIGN UP </a> </td>\n");
      out.write("                   <td class=\"col\" style=\"width:15px\"> <a href =\"OwnerLogin.jsp\" > OWNER LOGIN</a> </td>\n");
      out.write("                   <td class=\"col\" style=\"width:15px\"> <a href =\"contact.jsp\" > CONTACT</a> </td>\n");
      out.write("                   \n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("       </div>\n");
      out.write("            <hr>\n");
      out.write("            \n");
      out.write("            <div width=300px  style=\"background-color:rgba(255,255,255,0.7);height:450px \" >\n");
      out.write("                <table align =\"center\" cellspacing=\"50\" cellpadding=\"0\">\n");
      out.write("                    ");
 
                             Cookie ck[]=request.getCookies();
                             String name="";
                             if(ck!=null)
                             {
                                 for(int i=0; i<ck.length; i++)
                                 {
                                     if(ck[i].getName().equals("CREATE"))
                                 {
                                     name=ck[i].getValue();
                                   }
                             }
                             }
                    
      out.write("\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                        <td  colspan=\"2\" style=\"font-size:60px; color:black\" > WELCOME TO HOSTELHUB\n");
      out.write("                        <br>\n");
      out.write("                        <video src=\"hostelvideo.webm\" width=\"100%\" autoplay=\"true\" loop=\"true\" muted=\"true\"  height=\"250px\" controls/>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <script>\n");
      out.write("                                function validate()\n");
      out.write("                                {\n");
      out.write("                                    if(frm.lid.value==0)\n");
      out.write("                                        alert(\"id is required\");\n");
      out.write("                                    if(frm.pass.value==0)\n");
      out.write("                                        alert(\"password is required\");\n");
      out.write("                                }\n");
      out.write("                                </script>\n");
      out.write("                            <form action=\"LoginPage.jsp\" name=\"frm\" >\n");
      out.write("    <table align=\"right\"  cellspacing='20' width=\"20%\"  style=\"border:ridge;border-color: black;\">\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td class=\"login\"  rowspan='2' colspan=\"2\"><h1 style=\"font-family:arial;color:black;text-transform: uppercase;background-color:lightblue; border-radius: 10px;\">Login</h1></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td ><h2>Id</h2></td>\n");
      out.write("            <td class=\"tabletheme\"><input type=\"text\" value=\"");
      out.print(name );
      out.write("\"  name=\"lid\" placeholder=\"enter id\"\n");
      out.write("                style=\"width:200px; height:40px; border-radius: 20px; border-width: 5px\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td ><h2>Password</h2></td>\n");
      out.write("            <td class=\"tabletheme\"><input type=\"password\"  name=\"pass\" placeholder=\"enter password\"\n");
      out.write("            style=\"width:200px; height:40px; border-radius: 20px; border-width: 5px\" </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("           \n");
      out.write("           <td colspan=\"2\"><input type=\"submit\" value=\"LOG IN\"  onClick=\"validate()\"                     \n");
      out.write("                       style=\"  border-radius: 20px;\">                \n");
      out.write("            </td>\n");
      out.write("            <td   align=\"left\" style=\" height: 50px;  font-family :times new roman;color:black; font-size: 15px;\"> <a href =\"Forgot.jsp\" >FORGOT PASSWORD</a> </td>\n");
      out.write("           \n");
      out.write("    \n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("    </tr>                        \n");
      out.write("</table>\n");
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
