package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registration page</title>\n");
      out.write("         \n");
      out.write("     <body background=\"l7.jpg\">\n");
      out.write("          <table width=\"1000px\" align=\"center\">\n");
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
      out.write("         \n");
      out.write("     <form name=\"f1\" action=\" \" method=\"post\">\n");
      out.write("         <table width=\"1300\" align=\"center\" style=\"font-family:cambria;font-size:60px;background-color:black;color:white\">\n");
      out.write("           <tr>\n");
      out.write("               <td>Register!</td>\n");
      out.write("             </tr> \n");
      out.write("             </table>\n");
      out.write("         <hr style=\"color:black\"/><br>\n");
      out.write("             <table width=\"200\"align=\"center\"style=\"font-family:cambria;font-size:20\">\n");
      out.write("                 <tr>\n");
      out.write("\t\t<td>   Name</td>\n");
      out.write("                <br>\n");
      out.write("             </tr>  \n");
      out.write("              <tr> \n");
      out.write("\t\t<td><input type=\"text\" size=\"40px\" name=\"t1\" required></td>\n");
      out.write("\t      </tr>\n");
      out.write("              <tr>\n");
      out.write("\t\t<td>  User Name</td>\n");
      out.write("                <br>\n");
      out.write("             </tr>  \n");
      out.write("              <tr> \n");
      out.write("\t\t<td><input type=\"text\" size=\"40px\" name=\"t2\" required></td>\n");
      out.write("\t      </tr>\n");
      out.write("         <tr>\n");
      out.write("\t\t<td>  email Address</td>\n");
      out.write("                <br>\n");
      out.write("         </tr> \n");
      out.write("         <tr>\n");
      out.write("\t\t<td><input type=\"text\"size=\"40px\"  name=\"t3\" required></td>\n");
      out.write("\t </tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>  Password</td>\n");
      out.write("                <br>\n");
      out.write("         </tr> \n");
      out.write("         <tr>\n");
      out.write("\t\t<td><input type=\"password\" size=\"40px\"  name=\"t4\" required></td>\n");
      out.write("\t</tr>\n");
      out.write("        \n");
      out.write("         <tr>\n");
      out.write("\t\t<td>Mobile no.</td>\n");
      out.write("                <br>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("\t\t<td><input type=\"text\" size=\"40px\" name=\"t5\" required></td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td></td>\n");
      out.write("\t\t<td><input type=\"submit\" value=\"Sign up\" onClick=\"reg()\"></td>\n");
      out.write("\t</tr>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                <a href=\"account.jsp\">: :login Existing user</a>\n");
      out.write("        </table>\n");
      out.write("         \n");
      out.write("        <script>\n");
      out.write("             \n");
      out.write("             function reg()\n");
      out.write("             {\n");
      out.write("               \n");
      out.write("                 alert(\"You Are Registered Successfully !!\");\n");
      out.write("                 \n");
      out.write("             }\n");
      out.write("             </script>\n");
      out.write("             ");
  
                 if(request.getParameter("t1")!=null || request.getParameter("t2")!=null || request.getParameter("t3")!=null || request.getParameter("t4")!=null || request.getParameter("t5")!=null)
                 {
        Connection con=null;
        Statement st;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");	
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");   
            st=con.createStatement();
            
            String name=request.getParameter("t1");
            String uname=request.getParameter("t2");
            String email=request.getParameter("t3");
            String password=request.getParameter("t4");
            int phn=Integer.parseInt(request.getParameter("t5"));
                     
            String sql="insert into login values('"+uname+"','"+name+"','"+email+"','"+password+"',"+phn+")";
            int res=st.executeUpdate(sql);
            if(res!=0)
               
                response.sendRedirect("login.jsp");
            else
                out.println("Record Not Inserted");
           
            con.close();
        }catch(Exception ee)
        {
            out.println( ee.toString());
        }
                 }  
        
      out.write("\n");
      out.write("        </table>          \n");
      out.write("      </form>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"background-color:black\" >\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("         </body>\n");
      out.write("  </html>");
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
