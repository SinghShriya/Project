package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class start1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>start Page</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<style>\n");
      out.write(".button {\n");
      out.write("  \n");
      out.write("  border-radius: 4px;\n");
      out.write("  background-color: darkcyan;\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  font-size: 28px;\n");
      out.write("  padding: 20px;\n");
      out.write("  width: 200px;\n");
      out.write("  transition: all 0.7s;\n");
      out.write("  cursor: pointer;\n");
      out.write("  margin: 5px;\n");
      out.write("  alignment-adjust: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button span {\n");
      out.write("  cursor: pointer;\n");
      out.write("  display: inline-block;\n");
      out.write("  position: relative;\n");
      out.write("  transition: 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button span:after {\n");
      out.write("  content: '»';\n");
      out.write("  position: absolute;\n");
      out.write("  opacity: 0;\n");
      out.write("  top: 0;\n");
      out.write("  right: -20px;\n");
      out.write("  transition: 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover span {\n");
      out.write("  padding-right: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover span:after {\n");
      out.write("  opacity: 1;\n");
      out.write("  right: 0;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body background=\"l7.jpg\">\n");
      out.write("    <table width=\"1000px\" align=\"center\">\n");
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
      out.write("    \n");
      out.write("        <table width=\"1000\" bgcolor=\"black\">    \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td><font face=\"Ariel Black\" color=\"white\" size=\"7\">Start !</font></td>\n");
      out.write("            \n");
      out.write("                </tr>\n");
      out.write("        </table>\n");
      out.write("                    <hr>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <h1>Click here to start your test....</h1>\n");
      out.write("         <table align=\"center\" style=\"font-family:cambria;font-size:20px\">\n");
      out.write("           <tr>\n");
      out.write("               <td><br>You have 10 questions to Answer in 10 minutes</td>\n");
      out.write("               </tr>\n");
      out.write("              \n");
      out.write("              </table>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <table align=\"center\">\n");
      out.write("               <tr><td> <a href=\"java2.jsp\" style=\"position:fixed; left:400px; top:380px\"><button class=\"button\" ><span>Start your test! </span></button></a></td></tr>\n");
      out.write("            <tr>\n");
      out.write("                   \n");
      out.write("        </table>\n");
      out.write("           <table align=\"center\" style=\"font-family:cambria;font-size:20px\">\n");
      out.write("         <tr>\n");
      out.write("              <td><br>NOTE:All questions are compulsory</td>\n");
      out.write("                   </tr>\n");
      out.write("       </table>\n");
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
