package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class timer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");

String mins = request.getParameter( "mins" );
if( mins == null ) mins = "10";
  
String secs = request.getParameter( "secs" );
if( secs == null ) secs = "1";

      out.write("\n");
      out.write("<script>\n");
      out.write("<!--\n");
      out.write("var mins = ");
      out.print(mins);
      out.write("; // write mins to javascript\n");
      out.write("var secs = ");
      out.print(secs);
      out.write("; // write secs to javascript\n");
      out.write("function timer()\n");
      out.write("{\n");
      out.write("// tic tac\n");
      out.write("if(--secs==-1)\n");
      out.write("{\n");
      out.write("secs = 59;\n");
      out.write("--mins;\n");
      out.write("}\n");
      out.write("\n");
      out.write("// leading zero? formatting\n");
      out.write("if( secs < 10 ) secs = \"0\" + secs;            \n");
      out.write("if( mins < 10 ) mins = \"0\" + parseInt( mins, 10 );\n");
      out.write(" \n");
      out.write("// display\n");
      out.write("document.forma.mins.value = mins;\n");
      out.write("document.forma.secs.value = secs;\n");
      out.write(" \n");
      out.write("// continue?\n");
      out.write("if( secs == 0 && mins == 0 ) // time over\n");
      out.write("{\n");
      out.write("\n");
      out.write("window.location=\"resultjava.jsp\";\n");
      out.write("//document.form.ok.disabled = true;\n");
      out.write("//response.sendRedirect(\"ph.jsp\");\n");
      out.write("\n");
      out.write("//document.formb.results.style.display = \"block\";\n");
      out.write("}\n");
      out.write("else // call timer() recursively every 1000 ms == 1 sec\n");
      out.write("{ \n");
      out.write("window.setTimeout( \"timer()\", 1000 );\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("<form action=\"");
      out.print(request.getRequestURL());
      out.write("\" name=\"forma\">\n");
      out.write("Time remaining:<input type=\"text\" name=\"mins\" size=\"1\">:<input type=\"\" name=\"secs\" size=\"1\" >\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("<!--\n");
      out.write("timer(); // call timer() after page is loaded\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
