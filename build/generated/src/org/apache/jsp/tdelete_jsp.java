package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class tdelete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Teacher</title>\n");
      out.write("</head>\n");
      out.write("<body background=\"l7.jpg\">\n");
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
      out.write("<table width=\"1000\"  align=\"center\" bgcolor=\"black\" style=\"font-family:cambria;font-size:60px;color:white\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Update Questions!</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("                    <form method=\"get\" action=\"\">                  \n");
      out.write("<hr style=\"color:black\"/>\n");
      out.write("             <table width=\"500\" align=\"center\" style=\"font-family:cambria;font-size:30\">\n");
      out.write("                 ");
      connection.connect obj = null;
      synchronized (_jspx_page_context) {
        obj = (connection.connect) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new connection.connect();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
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
      out.write("1: ");
      out.print(rs.getString("op1"));
      out.write("</td></tr>\n");
      out.write("\n");
      out.write("  <tr><td>  \n");
      out.write("2: ");
      out.print(rs.getString("op2"));
      out.write("\n");
      out.write("  </td></tr> \n");
      out.write("  <tr><td>\n");
      out.write("3: ");
      out.print(rs.getString("op3"));
      out.write("\n");
      out.write("  </td></tr>\n");
      out.write("  <tr><td>\n");
      out.write("4:");
      out.print(rs.getString("op4"));
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
      out.write('\n');

con.close();
}
catch(Exception e)
		{
			System.out.println(e.toString());
		}
      out.write("\n");
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                     \n");
      out.write("\t\t<td> Enter Serial number to delete</td>\n");
      out.write("                <br>\n");
      out.write("             </tr>  \n");
      out.write("              <tr> \n");
      out.write("\t\t<td><input type=\"text\" size=\"20px\" name=\"t1\" /></td>\n");
      out.write("\t      </tr>\n");
      out.write("              <tr>\n");
      out.write("\t\t<br>\n");
      out.write("              <br>\n");
      out.write("\t\t<td><center><input type=\"submit\" value=\"Delete\" ></center></td>\n");
      out.write("\t</tr>\n");
      out.write("           \n");
      out.write("\n");

    if(request.getParameter("t1")!=null)
    {
    
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");
       
        st=con.createStatement();
        
        
            int no=Integer.parseInt(request.getParameter("t1"));
            st=con.createStatement();
			int res=st.executeUpdate("delete from java where s_no="+no+"");
			if(res!=0)
				response.sendRedirect("tinsert.jsp");
			else
				out.println("Record Not Deleted..");
				
			con.close();
		}catch(Exception e)
		{
			out.println(e.toString());
		}
		}
	
      out.write("\n");
      out.write("        </form>\n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("        </body>\n");
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
