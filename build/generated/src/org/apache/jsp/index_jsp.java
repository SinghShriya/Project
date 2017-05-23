package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>ONEX</title>\n");
      out.write("        <link rel=\"icon\" href=\"images logo.png\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"pagestyle.css\" type=\"text/css\" />\n");
      out.write("<img src=\"images logo.png\" width=\"960px\" height=\"200px\"/>  \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body background=\"l7.jpg\">\n");
      out.write("        <table width=\"1000px\" align=\"center\">\n");
      out.write("          \n");
      out.write("            <tr> \n");
      out.write("                <td>\n");
      out.write("                    <hr />\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("                    <hr />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <br>\n");
      out.write("             <tr>\n");
      out.write("                <td class=\"slideshow\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "slideshow.jsp", out, false);
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <table background=\"bg1.jpg\">\n");
      out.write("             <tr>\n");
      out.write("              <td height=\"350px\" background=\"bg1.jpg\">\n");
      out.write("                  <h1><b><center>WELCOME TO ONLINE EXAMINATION SYSTEM</center></b></h1>\n");
      out.write("            <br><p><h3>ONEX is a one of its kind online testing site providing simplified testing solution to aspirants in INDIA.\n");
      out.write("                Our rich content alongwith the student friendly online exam portal provides seamless testing experience to students.</h3></p>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <br></table>\n");
      out.write("          \n");
      out.write("            <table>\n");
      out.write("                <tr><h2><center>HOW IT WORKS</center></h2></tr>\n");
      out.write("                <tr><td><img src=\"1.jpg\" width=\"200px\" height=\"288px\"  position=\"fixed\" left=\"20px\" top=\"100px\"/></td>\n");
      out.write("                <td><img src=\"2.jpg\" width=\"200px\" height=\"288px\" position=\"fixed\" left=\"220px\" top=\"100px\"/></td>\n");
      out.write("                <td><img src=\"3.jpg\" width=\"200px\" height=\"288px\"/></td>\n");
      out.write("                <td><img src=\"4.jpg\" width=\"200px\" height=\"288px\"/></td>\n");
      out.write("                <td><img src=\"5.jpg\" width=\"200px\" height=\"288px\"/></td></tr>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <table>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"background-color:black\" >\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
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
