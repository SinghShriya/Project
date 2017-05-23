package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class phpdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Package mock</title>\n");
      out.write("    </head>\n");
      out.write("        <body background=\"l7.jpg\">\n");
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
      out.write("    \n");
      out.write("<table width=\"1350\" height=\"100\"  bgcolor=\"black\"> \n");
      out.write("    \n");
      out.write("                 <tr>\n");
      out.write("                     <td><font face=\"cambria\" color=\"white\" size=\"8\">Php details !</font></td>\n");
      out.write("                 </tr>\n");
      out.write("                                 \n");
      out.write("              </table><hr style=\"color:black\"/><br><br>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("<table width=\"1000\" style=\"font-family:Calbri; font-size:20px; color:black;\">\n");
      out.write("    <img src=\"php.png\" width=\"200\" height=\"200\" >\n");
      out.write("   \n");
      out.write("       \n");
      out.write("    <tr><td><p> \n");
      out.write("                \n");
      out.write("                PHP is a recursive acronym for \"PHP: Hypertext Preprocessor\".\n");
      out.write("\n");
      out.write("PHP is a server side scripting language that is embedded in HTML. It is used to manage dynamic content, databases, session tracking, even build entire e-commerce sites.\n");
      out.write("\n");
      out.write("It is integrated with a number of popular databases, including MySQL, PostgreSQL, Oracle, Sybase, Informix, and Microsoft SQL Server.\n");
      out.write("\n");
      out.write("PHP is pleasingly zippy in its execution, especially when compiled as an Apache module on the Unix side. The MySQL server, once started, executes even very complex queries with huge result sets in record-setting time.\n");
      out.write("\n");
      out.write("PHP supports a large number of major protocols such as POP3, IMAP, and LDAP. PHP4 added support for Java and distributed object architectures (COM and CORBA), making n-tier development a possibility for the first time.\n");
      out.write("\n");
      out.write("PHP is forgiving: PHP language tries to be as forgiving as possible.\n");
      out.write("\n");
      out.write("PHP Syntax is C-Like.</p><td></tr>\n");
      out.write("    <tr><td><h3><u>Common uses of PHP:</u></h3><br>\n");
      out.write("        \n");
      out.write("    <p>PHP performs system functions, i.e. from files on a system it can create, open, read, write, and close them.\n");
      out.write("\n");
      out.write("PHP can handle forms, i.e. gather data from files, save data to a file, thru email you can send data, return data to the user.\n");
      out.write("\n");
      out.write("You add, delete, modify elements within your database thru PHP.\n");
      out.write("\n");
      out.write("Access cookies variables and set cookies.\n");
      out.write("\n");
      out.write("Using PHP, you can restrict users to access some pages of your website.\n");
      out.write("\n");
      out.write("It can encrypt data.</p>\n");
      out.write("    <tr><td><h3><u>\"Hello World\" Script in PHP:</u></h3><br>\n");
      out.write("            <p>\n");
      out.write("               To get a feel for PHP, first start with simple PHP scripts. Since \"Hello, World!\" is an essential example, first we will create a friendly little \"Hello, World!\" script.\n");
      out.write("\n");
      out.write("As mentioned earlier, PHP is embedded in HTML. That means that in amongst your normal HTML (or XHTML if you're cutting-edge) you'll have PHP statements like this - \n");
      out.write("                \n");
      out.write("            </p>\n");
      out.write("            <pre>\n");
      out.write("               &lt;html&gt;\n");
      out.write("   \n");
      out.write("   &lt;head&gt;\n");
      out.write("      &lt;title&gt;Hello World&lt;/title&gt;\n");
      out.write("   &lt;/head&gt;\n");
      out.write("   \n");
      out.write("   &lt;body&gt;\n");
      out.write("      &lt;?php echo \"Hello, World!\";?&gt;\n");
      out.write("   </body>\n");
      out.write("\n");
      out.write("&lt;/html&gt; \n");
      out.write("\n");
      out.write("            </pre>\n");
      out.write("            \n");
      out.write("            </td></tr>\n");
      out.write("</table>\n");
      out.write(" <table>\n");
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
