package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class contacts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CONTACT</title>\n");
      out.write("    </head>\n");
      out.write("   <body background=\"l7.jpg\">\n");
      out.write("        <table width=\"1000px\" align=\"center\">\n");
      out.write("          \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "quesmenu.jsp", out, false);
      out.write("\n");
      out.write("                    <hr />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("</table>\n");
      out.write("      \n");
      out.write("        <table width=\"1000\" height=\"100\" bgcolor=\"black\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <font face=\"Ariel Black\" color=\"white\" size=\"7\">Contact Us !</font>\n");
      out.write("            \n");
      out.write("                </td>\n");
      out.write("           \n");
      out.write("             </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("       <hr style=\"color: black\"/><br>\n");
      out.write("            \n");
      out.write("       <br>\n");
      out.write("       <br>\n");
      out.write("       <table clospan=\"2\"  align=\"left\"  >\n");
      out.write("            <form name=\"f1\" action=\"answer.jsp\" method=\"post\">\n");
      out.write("               <tr>\n");
      out.write("                   <td><font face=\"cambria\" color=\"black\" size=\"5\"><center>Leave Us a Reply</center></font></td>\n");
      out.write("\t\t\n");
      out.write("               </tr>\n");
      out.write("               <tr></tr>\n");
      out.write("                 <tr></tr>\n");
      out.write("                 <tr></tr>\n");
      out.write("               \n");
      out.write("               <tr>\n");
      out.write("                   <td><font face=\"cambria\" color=\"black\" size=\"3\" >NAME:</font></td><br>\n");
      out.write("                 <td><input type=\"text\" size=\"40\" name=\"t1\" required ></td>\n");
      out.write("\t       </tr>\n");
      out.write("               <tr></tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td><font face=\"cambria\" color=\"black\" size=\"3\" >E-MAIL:</font></td><br>\n");
      out.write("                 <td><input type=\"text\" size=\"40\" name=\"t2\" required></td>\n");
      out.write("\t       </tr>\n");
      out.write("                 <tr></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><font face=\"cambria\" color=\"black\" size=\"3\">SUBJECT:</font></td><br>\n");
      out.write("                <td><input type=\"text\" size=\"40\" name=\"t3\" ></td>\n");
      out.write("\t       </tr>\n");
      out.write("                 <tr></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><font face=\"cambria\" color=\"black\" size=\"3\">MESSAGE:</font></td><br>\n");
      out.write("                <td><textarea width=\"70\" height=\"50\" required>\n");
      out.write("\t</textarea>\n");
      out.write("\t</td>\n");
      out.write("               </tr>\n");
      out.write("                \n");
      out.write("               <tr>\n");
      out.write("\t\t\n");
      out.write("               <td>\n");
      out.write("                   <center><input type=\"submit\" value=\"Submit\" size=\"40\"></center>\n");
      out.write("               </td>\n");
      out.write("              \n");
      out.write("\t       </tr>\n");
      out.write("         \n");
      out.write("                     \n");
      out.write("              \n");
      out.write("            </form>\n");
      out.write("       </table>\n");
      out.write("        <table clospan=\"2\"  bgcolor=\"black\" width=\"300\" height=\"300\" style=\"position:fixed; left:600px; top:250px\" >\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("            <font face=\"Ariel Black\" color=\"white\" size=\"5\"><center>CONTACT INFO</center>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><hr style=\"color: white\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><font face=\"Ariel Black\" color=\"white\" size=\"4\">+91-9696607989</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> <font face=\"Ariel Black\" color=\"white\" size=\"4\">INFO@ONEX.COM </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("       </form>\n");
      out.write("   </body>\n");
      out.write("</html>\n");
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
