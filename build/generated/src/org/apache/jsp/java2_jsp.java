package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class java2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("        <title> quiz </title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"l7.jpg\">\n");
      out.write("        \n");
      out.write("         <form name=\"f1\" action=\"resultjava.jsp\" method=\"post\">\n");
      out.write("     \n");
      out.write("             <table width=\"1000px\" align=\"center\">\n");
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
      out.write("                    <style>\n");
      out.write("      \n");
      out.write("\n");
      out.write("#block\n");
      out.write("{\n");
      out.write("    width:410;\n");
      out.write("    height:2500;\n");
      out.write("    padding:100px;\n");
      out.write("    margin:0px;\n");
      out.write("    background:none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<table width=\"1000\"  align=\"center\" bgcolor=\"black\" style=\"font-family:cambria;font-size:50px;color:white\">\n");
      out.write("    \n");
      out.write("<tr>\n");
      out.write("<td>Java Test!</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<hr style=\"color:black\"/><br>\n");
      out.write("<div class=\"a\"id=\"block\">\n");
      out.write("<table width=\"500\" style=\"font-family:cambria; font-size:25px; color:black ;\">\n");
      out.write("    \n");
      out.write("    ");
      connection.connect obj = null;
      synchronized (_jspx_page_context) {
        obj = (connection.connect) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new connection.connect();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
 	
                Connection con=null;
		Statement st;
		ResultSet rs;
                int count=0;
                String g;
                
		try
		{
                       con=obj.getConnect();
			st=con.createStatement();
                        rs = st.executeQuery("select * from java");
                           int i=1;
                           while(rs.next())
            {
                
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td> <h2>Question ");
      out.print(rs.getString("s_no") );
      out.write("</h2></td></tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print( rs.getString("ques") );
      out.write("</td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr><td>\n");
      out.write("1: <input type=\"radio\"  value=\"");
      out.print(rs.getString("op1"));
      out.write("\" name=\"radio");
      out.print(i);
      out.write("\" />");
      out.print( rs.getString("op1"));
      out.write("\n");
      out.write("</td></tr>\n");
      out.write("  <tr><td>  \n");
      out.write("2: <input type=\"radio\"  value=\"");
      out.print(rs.getString("op2"));
      out.write("\" name=\"radio");
      out.print(i);
      out.write("\" />");
      out.print( rs.getString("op2"));
      out.write("\n");
      out.write("  </td></tr> \n");
      out.write("  <tr><td>\n");
      out.write("3: <input type=\"radio\"  value=\"");
      out.print(rs.getString("op3"));
      out.write("\" name=\"radio");
      out.print(i);
      out.write("\" />");
      out.print( rs.getString("op3"));
      out.write(" \n");
      out.write("  </td></tr>\n");
      out.write("  <tr><td>\n");
      out.write("4: <input type=\"radio\"  value=\"");
      out.print(rs.getString("op4"));
      out.write("\" name=\"radio");
      out.print(i);
      out.write("\" />");
      out.print( rs.getString("op4"));
      out.write("\n");
      out.write("            \n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr><td>\n");
      out.write("                <br>\n");
      out.write("                </td></tr>\n");
      out.write("\n");
      out.write("\n");

i++;
}
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<center>\n");
      out.write("<input type=\"submit\" value=\"SUBMIT YOUR QUIZ\"></center></td></tr>\n");

con.close();
}
catch(Exception e)
		{
			System.out.println(e.toString());
		}
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("                </div>\n");
      out.write("</form>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "timer.jsp", out, false);
      out.write("\n");
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
