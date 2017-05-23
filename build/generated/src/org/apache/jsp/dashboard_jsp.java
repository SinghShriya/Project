package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> MyProfile </title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"l7.jpg\">\n");
      out.write("        \n");
      out.write("              <table width=\"1000px\" align=\"center\">\n");
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
      out.write("        <table width =\"100%\" bgcolor=\"black\"> \n");
      out.write("            <tr> \n");
      out.write("                <td> <font face=\"cambria\" color=\"white\" size=\"7\" >Dashboard !</font></td>\n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("        </table>\n");
      out.write("        <hr style=\"color:black\"/><br><br>\n");
      out.write("        <style>\n");
      out.write("            #td{\n");
      out.write("    \n");
      out.write("     font-size: 20px;\n");
      out.write("     font-family: blue;\n");
      out.write("}\n");
      out.write("        .tt {\n");
      out.write("    width: 200px;\n");
      out.write("    height:50px;\n");
      out.write("    border: 8px solid black;\n");
      out.write("    padding: 80px;\n");
      out.write("    margin: 30px;\n");
      out.write("    background:aliceblue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("        \n");
      out.write("        <div style=\"position:fixed; left:480px; top:190px;\">    \n");
      out.write("        <table  width =\"440\" height=\"900\"  >\n");
      out.write("            <tr>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <td style=\"position:fixed; left:580px; top:170px; color:Black; font-family: cambria;\">\n");
      out.write("                    <h1>TEST PACKAGES</h1>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <img src=\"java.png\" width=\"200\" height=\"200\" style=\"position:fixed; left:480px; top:220px\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                  <img src=\"php.png\" width=\"200\" height=\"200\" style=\"position:fixed; left:680px; top:220px\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td style=\"position:fixed; left:520px; top:390px; \"><h2><u><a href=\"start1.jsp\" style=\"color:dodgerblue\">Java 2016</a></u></h2></td>\n");
      out.write("            \n");
      out.write("                <td style=\"position:fixed; left:720px; top:390px;\"><h2><u><a href=\"start2.jsp\" style=\"color:dodgerblue\">Php 2016</a></u></h2></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("                <td>\n");
      out.write("                    <img src=\"js.png\" width=\"150\" height=\"150\" style=\"position:fixed; left:500px; top:450px\">\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <img src=\"oracle.jpg\" width=\"150\" height=\"150\" style=\"position:fixed; left:700px; top:450px\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td style=\"position:fixed; left:500px; top:600px; color:dodgerblue;\"><h2><u><a href=\"start3.jsp\" style=\"color:dodgerblue\">JavaScript 2016</a></u></h2></td>\n");
      out.write("                <td style=\"position:fixed; left:700px; top:600px; color:dodgerblue;\"><h2><u><a href=\"start4.jsp\" style=\"color:dodgerblue\">Oracle 2016</a></u></h2></td>\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table></div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"tt\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"position:absolute;  left:100px; top:300px; color:black;\">\n");
      out.write("                    <h2><big> OnEx Welcomes You</big></h2>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"td\" style=\"top:400px; left:100px; position:absolute ;size:5  \" >\n");
      out.write("                    ");

	if(session.getAttribute("Name")!=null || session.getAttribute("Email")!=null )
	{
		String un=(String)session.getAttribute("Name");
                String emid=(String)session.getAttribute("Email");
		out.println("Name: "+un+" ");
      out.write("\n");
      out.write("                </td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"td\" style=\"top:450px; left:100px; position:absolute; size:5 \">\n");
      out.write("                    ");

            
                out.println("Email: "+emid+" ");
	}
      else
		response.sendRedirect("login.jsp");


	

      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        </table></div>\n");
      out.write("      \n");
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
