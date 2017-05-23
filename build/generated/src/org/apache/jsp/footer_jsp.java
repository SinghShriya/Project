package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   \n");
      out.write("        <table width=\"1000px\" height=\"300\" style=\"background-color:darkcyan\" >\n");
      out.write("            <tr><td> <font face=\"Maiandra GD\" color=\"white\" size=\"4\"> <h2 align=\"left\">Contact Us</h2></font>\n");
      out.write("                    <ul><font face=\"Maiandra GD\" color=\"white\" size=\"2\">\n");
      out.write("                        <li>Ph.: <a \"tel:+919873839210\">+91-9696607989</a></li>\n");
      out.write("                        <li>Email: <a \"mailto:info@practicemock.com\">info@oneX.com</a></li>\n");
      out.write("                        </font></ul>\n");
      out.write("           \n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("               <font face=\"Maiandra GD\" color=\"white\" size=\"4\"> <h2>Quick Link</h2></font>\n");
      out.write("                    <ul><font face=\"Maiandra GD\" color=\"white\" size=\"2\">\n");
      out.write("                        <li><a href=\"account.jsp\"><font face=\"Maiandra GD\">Login</a> </li>\n");
      out.write("                        <li><a href=\"account2.jsp\">Sign Up</a> </li>\n");
      out.write("                        <li><a href=\"http://www.practicemock.com/terms\">Terms & Conditions</a></li>\n");
      out.write("                       \n");
      out.write("                        </font> </ul>\n");
      out.write("                </td></tr> \n");
      out.write("          </table>\n");
      out.write("           \n");
      out.write("    </body>\n");
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
