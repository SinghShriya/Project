package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jsdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>package mock</title>\n");
      out.write("</head>\n");
      out.write("<body background=\"l7.jpg\">\n");
      out.write("    <table width=\"1000px\" align=\"center\">\n");
      out.write("          \n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("                    <hr />\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("</table>\n");
      out.write("<table width=\"1000\"  align=\"center\" bgcolor=\"black\" style=\"font-family:cambria;font-size:60px;color:white\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Java Script Details!</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<table width=\"1000\" style=\"font-family:calibri; font-size:20px; color:black\">\n");
      out.write("<hr style=\"color:black\"/>\n");
      out.write("\n");
      out.write("<img src=\"js.jpg\"width=\"200\" height=\"150\">\n");
      out.write("<br>\n");
      out.write("<tr>\n");
      out.write("\t<td><big><big><u>JavaScript - Overview</u></big></big>\n");
      out.write("\t</td>\n");
      out.write("\t</tr>\n");
      out.write("<tr><td>\n");
      out.write("Javascript is a dynamic computer programming language. It is lightweight and most commonly used as a part of web pages, whose implementations allow client-side script to interact with the user and make dynamic pages.<br>\n");
      out.write(" It is an interpreted programming language with object-oriented capabilities.<br>\n");
      out.write("The ECMA-262 Specification defined a standard version of the core JavaScript language.<br>\n");
      out.write("\n");
      out.write("    *JavaScript is a lightweight, interpreted programming language.<br>\n");
      out.write("\n");
      out.write("    *Designed for creating network-centric applications.<br>\n");
      out.write("\n");
      out.write("    *Complementary to and integrated with Java.<br>\n");
      out.write("\n");
      out.write("    *Complementary to and integrated with HTML.<br>\n");
      out.write("\n");
      out.write("    *Open and cross-platform.<br>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td><big><big><u>Advantages of JavaScript</u></big></big><br>\n");
      out.write("\n");
      out.write("The merits of using JavaScript are -<br>\n");
      out.write("\n");
      out.write(" <big>   Less server interaction </big>- You can validate user input before sending the page off to the server. This saves server traffic, which means less load on your server.<br>\n");
      out.write("\n");
      out.write("  <big>  Immediate feedback to the visitors</big> - They don't have to wait for a page reload to see if they have forgotten to enter something.<br>\n");
      out.write("\n");
      out.write("  <big>  Increased interactivity</big> - You can create interfaces that react when the user hovers over them with a mouse or activates them via the keyboard.<br>\n");
      out.write("\n");
      out.write("    <big>Richer interfaces</big> - You can use JavaScript to include such items as drag-and-drop components and sliders to give a Rich Interface to your site visitors.<br>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><big><big><u>JavaScript - Syntax</u></big></big><br>\n");
      out.write("JavaScript can be implemented using JavaScript statements that are placed within the <script>... </script> HTML tags in a web page.<br>\n");
      out.write("\n");
      out.write("You can place the <script> tags, containing your JavaScript, anywhere within you web page, but it is normally recommended that you should keep it within the <head> tags.<br>\n");
      out.write("\n");
      out.write("The <script> tag alerts the browser program to start interpreting all the text between these tags as a script. A simple syntax of your JavaScript will appear as follows.<br>\n");
      out.write("\n");
      out.write("<script ...><br>\n");
      out.write("   JavaScript code<br>\n");
      out.write("</script><br>\n");
      out.write("\n");
      out.write("The script tag takes two important attributes -<br>\n");
      out.write("\n");
      out.write(" <big>   Language </big>- This attribute specifies what scripting language you are using. Typically, its value will be javascript. Although recent versions of HTML (and XHTML, its successor) have phased out the use of this attribute.<br>\n");
      out.write("\n");
      out.write(" <big>   Type</big> - This attribute is what is now recommended to indicate the scripting language in use and its value should be set to \"text/javascript\".<br>\n");
      out.write("\n");
      out.write("This function can be used to write text, HTML, or both. Take a look at the following code.<br>\n");
      out.write("\n");
      out.write("<pre>&lthtml&gt\n");
      out.write("   &thbody&gt\n");
      out.write("      &ltscript language=\"javascript\" type=\"text/javascript\"\n");
      out.write("         &lt!--\n");
      out.write("            document.write(\"Hello World!\")\n");
      out.write("         //--&gt\n");
      out.write("      &lt/script&gt\n");
      out.write("   &lt/body&gt\n");
      out.write("&lt/html&gt</pre>\n");
      out.write("\n");
      out.write("This code will produce the following result -<br>\n");
      out.write("\n");
      out.write("<big>Hello World!</big>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<br>\n");
      out.write("</table>\n");
      out.write("                    <table>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td style=\"background-color:black\" >\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("</body>\n");
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
