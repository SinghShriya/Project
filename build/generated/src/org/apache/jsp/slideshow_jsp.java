package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slideshow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("var slideimages = new Array(); // create new array to preload images\n");
      out.write("slideimages[0] = new Image(); // create new instance of image object\n");
      out.write("slideimages[0].src = \"st3.jpg\"; // set image src property to image path, preloading image in the process\n");
      out.write("slideimages[1] = new Image();\n");
      out.write("slideimages[1].src = \"st4.jpg\";\n");
      out.write("slideimages[2] = new Image();\n");
      out.write("slideimages[2].src = \"st51.jpg\";\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<img src=\"st3.jpg\" id=\"slide\" width=\"1000px\" height=\"400px\" />\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("//variable that will increment through the images\n");
      out.write("var step=0;\n");
      out.write("\n");
      out.write("function slideit(){\n");
      out.write(" //if browser does not support the image object, exit.\n");
      out.write(" if (!document.images)\n");
      out.write("  return;\n");
      out.write(" document.getElementById('slide').src = slideimages[step].src;\n");
      out.write(" if (step<2)\n");
      out.write("  step++;\n");
      out.write(" else\n");
      out.write("  step=0;\n");
      out.write(" //call function \"slideit()\" every 2.5 seconds\n");
      out.write(" setTimeout(\"slideit()\",2500);\n");
      out.write("}\n");
      out.write("\n");
      out.write("slideit();\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
