package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>Result Page</title>\n");
      out.write("        </head>\n");
      out.write("          <body>\n");
      out.write("    \n");
      out.write("              <table width=\"1000px\" align=\"center\">\n");
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
      out.write("\n");
      out.write("     ");

      String st[]=new String[10];
       for(int i=0;i<st.length;i++) 
       {
      int j=i+1;
      st[i]=request.getParameter("radio"+j);
      System.out.println(st[i]);

       }
          try 
          {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");  
             Statement stmt=connection.createStatement();
             ResultSet rs=stmt.executeQuery("Select ans from java");
            String ans[]=new String[10];
           int i=0;
           
             while(rs.next()) 
             {
             ans[i]=rs.getString("ans");
             i++;
             
             }
            int count=0;
          
            for(i=0;i<st.length;i++)
                
                
            {
              if(st[i].equals(ans[i]))
              {
               count++;
            
              }
           }
           int score=count*10;
           
            
      out.write("\n");
      out.write("                  \n");
      out.write("            <table width=\"100%\" align=\"center\" background=\"r.jpg\" style=\"font-family:cambria;font-size:30px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><br><br><br><br><br></td>\n");
      out.write("                  </tr>  \n");
      out.write("                  \n");
      out.write("                 \n");
      out.write("                <tr>\n");
      out.write("                    <td><br><br><br></td>\n");
      out.write("                  </tr>  \n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td><h2><center> OneX Online Examination</center></h2></td>\n");
      out.write("                    </tr>\n");
      out.write("    \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td><u><center>You have attended the Quiz sucessfully</center></u></td>\n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                     \n");
      out.write("                    <br>\n");
      out.write("                   <tr>\n");
      out.write("                      \n");
      out.write("                       <td><center>Correct Answer are ");
      out.print(count);
      out.write(" </center></td>\n");
      out.write("                       \n");
      out.write("                       </tr>\n");
      out.write("                       \n");
      out.write("                       <tr>\n");
      out.write("                           <td><center> Your score ");
      out.print(score);
      out.write(" out of 100</center></td>\n");
      out.write("                          </tr> \n");
      out.write("                       \n");
      out.write("                       <tr>\n");
      out.write("                    <td><br><br><br><br><br></td>\n");
      out.write("                  </tr>  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("            \n");
      out.write("         ");
 connection.close();
          }
catch(NullPointerException e)
		{
      out.write("\n");
      out.write("                \n");
      out.write("\t\t<tr>\n");
      out.write("          \n");
      out.write("                    <td> <center><h1>");
out.println("Your Quiz is Incomplete");
      out.write("</h1></center></td>\n");
      out.write("                \n");
      out.write("                   </tr>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                ");
       
		}
         
      out.write("\n");
      out.write("</table>\n");
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
