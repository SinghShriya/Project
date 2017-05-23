package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class tinsert4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("             <table width=\"300\" align=\"center\" style=\"font-family:cambria;font-size:30\">\n");
      out.write("                 <tr>\n");
      out.write("\t\t<td>   Serial number </td>\n");
      out.write("                <br>\n");
      out.write("             </tr>  \n");
      out.write("              <tr> \n");
      out.write("\t\t<td><input type=\"text\" size=\"20px\" name=\"t1\" /></td>\n");
      out.write("\t      </tr>\n");
      out.write("              <tr>\n");
      out.write("\t\t<td>  Question </td>\n");
      out.write("                <br>\n");
      out.write("             </tr>\n");
      out.write("              <tr> \n");
      out.write("\t\t<td><textarea row=\"15\" cols=\"40\" name=\"t2\">\n");
      out.write("\t</textarea></td>\n");
      out.write("\t      </tr>\n");
      out.write("             <tr>\n");
      out.write("\t\t<td>  Option 1 </td>\n");
      out.write("                <br>\n");
      out.write("             </tr> \n");
      out.write("              <tr> \n");
      out.write("\t\t<td><textarea row=\"8\" cols=\"20\" name=\"t3\">\n");
      out.write("\t</textarea></td>\n");
      out.write("\t      </tr>\n");
      out.write("               <tr>\n");
      out.write("\t\t<td>  Option 2 </td>\n");
      out.write("                <br>\n");
      out.write("             </tr> \n");
      out.write("              <tr> \n");
      out.write("\t\t<td><textarea row=\"8\" cols=\"20\" name=\"t4\">\n");
      out.write("\t</textarea></td>\n");
      out.write("\t      </tr>\n");
      out.write("               <tr>\n");
      out.write("\t\t<td>  Option 3 </td>\n");
      out.write("                <br>\n");
      out.write("             </tr> \n");
      out.write("              <tr> \n");
      out.write("\t\t<td><textarea row=\"8\" cols=\"20\" name=\"t5\">\n");
      out.write("\t</textarea></td>\n");
      out.write("\t      </tr>\n");
      out.write("               <tr>\n");
      out.write("\t\t<td>  Option 4 </td>\n");
      out.write("                <br>\n");
      out.write("             </tr> \n");
      out.write("              <tr> \n");
      out.write("\t\t<td><textarea row=\"8\" cols=\"20\" name=\"t6\">\n");
      out.write("\t</textarea></td>\n");
      out.write("\t      </tr>\n");
      out.write("               <tr>\n");
      out.write("\t\t<td>  Answer </td>\n");
      out.write("                <br>\n");
      out.write("             </tr> \n");
      out.write("              <tr> \n");
      out.write("\t\t<td><textarea row=\"8\" cols=\"20\" name=\"t7\">\n");
      out.write("\t</textarea></td>\n");
      out.write("\t      </tr>\n");
      out.write("              \n");
      out.write("              <tr>\n");
      out.write("\t\t<br>\n");
      out.write("              <br>\n");
      out.write("\t\t<td><center><input type=\"submit\" value=\"Insert\" ></center></td>\n");
      out.write("\t</tr>\n");
      out.write("           </table>\n");

    if(request.getParameter("t1")!=null)
    {
    Connection con=null;
    Statement st;
    ResultSet rs;
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");
       
        st=con.createStatement();
        
        
            int s_no=Integer.parseInt(request.getParameter("t1"));
            String ques=request.getParameter("t2");
            String op1=request.getParameter("t3");
            String op2=request.getParameter("t4");
            String op3=request.getParameter("t5");
            String op4=request.getParameter("t6");
            String ans=request.getParameter("t7");
     
     
     //insert
     String sql="insert into oracle values("+s_no+",'"+ques+"','"+op1+"','"+op2+"','"+op3+"','"+op4+"','"+ans+"')";
     
     int res=st.executeUpdate(sql);
          if(res!=0)
            
           response.sendRedirect("record.jsp");
          else
       out.println("record not inserted");
         
     con.close();
        
    }
    catch(Exception e)
            {
              out.println(e.toString());
            }
    }
    
      out.write("\n");
      out.write(" \n");
      out.write(" </form> \n");
      out.write("    <table>\n");
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
