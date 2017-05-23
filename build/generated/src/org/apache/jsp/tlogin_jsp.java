package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class tlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("        <title> Teacher LOGIN</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body background=\"l7.jpg\">\n");
      out.write("        \n");
      out.write("              <table width=\"1000px\" align=\"center\">\n");
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
      out.write("      \n");
      out.write("        <table width=\"1000\" height=\"100\" bgcolor=\"black\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <font face=\"cambria\" color=\"white\" size=\"7\">Teacher  Login!</font>\n");
      out.write("            \n");
      out.write("                </td>\n");
      out.write("           \n");
      out.write("             </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("                    <hr>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <table clospan=\"2\"  align=\"center\"   >\n");
      out.write("            <form name=\"f1\" action=\"\" method=\"get\">\n");
      out.write("     \n");
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <td><font face=\"cambria\" color=\"black\" size=\"4\">USER NAME:</font></td>\n");
      out.write("\t\t\n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               <tr>\n");
      out.write("\t\t<td><input type=\"text\" size=\"70\" name=\"t1\" placeholder=\"Username\" required ></td>\n");
      out.write("\t       </tr>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("\t       <tr>\n");
      out.write("\t\t<td><font face=\"cambria\" color=\"black\" size=\"4\">PASSWORD:</font></td>\n");
      out.write("                \n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("\t\t<td><input type=\"password\" size=\"70\" name=\"t2\" placeholder=\"Password\" required></td>\n");
      out.write("\t       </tr>\n");
      out.write("\t       <tr>\n");
      out.write("\t\t\n");
      out.write("\t\t<td><input type=\"submit\" value=\"Login\" size=\"40\"  ></td>\n");
      out.write("\t       </tr>\n");
      out.write("               <tr>\n");
      out.write("                   <td><a href=\"account2.jsp\">::Register New User</a></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                   <td>\n");
      out.write("                       ");

                           if(request.getParameter("t1")!=null || request.getParameter("t2")!=null )
                           {
                        
                              String id=request.getParameter("t1");
                              String pw=request.getParameter("t2");
                                    
                 		Connection con=null;
                                Statement st;
		                ResultSet rs;
                                boolean flag=false;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");
			st=con.createStatement();
			rs=st.executeQuery("select * from tlogin where user_name='"+id+"' && pass_word='"+pw+"' " );
                        
                                                    
                 if(rs.next())
                  {
                      String usdb=rs.getString("user_name");
                      String pwdb=rs.getString("pass_word");
                      String namedb=rs.getString("name");
                      String emaildb=rs.getString("email_id");
		             if(id.equals(usdb) && pw.equals(pwdb)) 
                             {
                                    session.setAttribute("Name",namedb);
                                    session.setAttribute("Email",emaildb);
                                    
                                    flag=true;
                                
                             }
                  }
                            if(flag==true)
			response.sendRedirect("tprofile.jsp");
                            else 
      out.write("\n");
      out.write("                <script>\n");
      out.write("\t\t\talert(\"Sorry, You are not an user..\");\n");
      out.write("\t\t\t\n");
      out.write("                  </script> \n");
      out.write("                  ");

		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
                    con.close();
                           }

      out.write("\n");
      out.write("                   </td>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</tr>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
