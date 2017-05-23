package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class javaques_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>question page</title>\n");
      out.write("</head>\n");
      out.write("<form name=\"f1\" action=\"result.jsp\" method=\"post\">\n");
      out.write("<body bgcolor=\"whitesmoke\">\n");
      out.write("    <style>\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a, .dropbtn {\n");
      out.write("    display: inline-block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover, .dropdown:hover .dropbtn {\n");
      out.write("    background-color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li.dropdown {\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("  \n");
      out.write("  <li class=\"dropdown\">\n");
      out.write("    <a href=\"#\" class=\"dropbtn\">MOCK TEST</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"javadetail.jsp\" >JAVA</a>\n");
      out.write("      <a href=\"php.jsp\">PHP</a>\n");
      out.write("      <a href=\"jsdetail.jsp\">JAVA SCRIPT</a>\n");
      out.write("      <a href=\"oracle.jsp\">ORACLE</a>\n");
      out.write("    </div>\n");
      out.write("  <li><a href=\"#LOGIN\">MY PROFILE</a></li>\n");
      out.write("    <li><a href=\"#SIGNUP\">LOGOUT</a></li>\n");
      out.write("   \n");
      out.write("  </li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<table width=\"1300\"  align=\"center\" bgcolor=\"black\" style=\"font-family:cambria;font-size:50px;color:white\">\n");
      out.write("    \n");
      out.write("<tr>\n");
      out.write("<td>Java Quiz Questions!</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table width=\"500\" style=\"font-family:cambria; font-size:20px; color:black\">\n");
      out.write("\n");
      out.write("<hr style=\"color:black\"/><br>\n");
      out.write("\n");
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
                        for(int i=1;i<=4;i++)
                        {
                       
                            String sql="select * from java where s_no='"+i+"'";
                        rs = st.executeQuery(sql);
                      
            while(rs.next())
            {
               
                
      out.write(" \n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("    <td> Question ");
      out.print(rs.getString("s_no") );
      out.write("</td></tr>\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(rs.getString("ques") );
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("1: <input type=\"radio\" name=\"a\" value= \"0p1\" />\n");
      out.print( rs.getString("op1") );
      out.write("</td></tr> \n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("2: <input type=\"radio\" name=\"a\" value=\"op2\" />\n");
      out.print( rs.getString("op2") );
      out.write("</td></tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("3: <input type=\"radio\" name=\"a\" value=\"op3\" />\n");
      out.print( rs.getString("op3") );
      out.write(" </td></tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("4: <input type=\"radio\" name=\"a\" value=\"op4\" />\n");
      out.print( rs.getString("op4") );
      out.write(" </td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    
}
}
con.close();
}
catch(Exception e)
		{
			System.out.println(e.toString());
		}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<center>\n");
      out.write("<input type=\"submit\" value=\"Submit\"></center></td></tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
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
