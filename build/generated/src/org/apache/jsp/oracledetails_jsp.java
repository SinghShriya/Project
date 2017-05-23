package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class oracledetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>package mock</title>\n");
      out.write("</head>\n");
      out.write("<body background=\"l7.jpg\">\n");
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
      out.write("<table width=\"1000\"  align=\"center\" bgcolor=\"black\" style=\"font-family:cambria;font-size:60px;color:white\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Oracle Details!</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<table width=\"1000\" style=\"font-family:calibri; font-size:20px; color:black\">\n");
      out.write("<hr style=\"color:black\"/>\n");
      out.write("\n");
      out.write("<img src=\"index1.jpg\"width=\"200\" height=\"150\">\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><big><big><u>Oracle Introduction</u></big></big><br>\n");
      out.write("Oracle Database (commonly referred to as Oracle RDBMS or simply as Oracle) is an object-relational database management system[3] produced and marketed by Oracle Corporation.<br>\n");
      out.write("The Oracle DBMS can store and execute stored procedures and functions within itself.\n");
      out.write(" PL/SQL (Oracle Corporation's proprietary procedural extension to SQL), or the object-oriented language Java can invoke such code objects and/or provide the programming structures for writing them.<br>\n");
      out.write("<big>Storage</big><br>\n");
      out.write("\n");
      out.write("The Oracle RDBMS stores data logically in the form of tablespaces and physically in the form of data files (\"datafiles\").\n");
      out.write(" Tablespaces can contain various types of memory segments, such as Data Segments, Index Segments, etc. Segments in turn comprise one or more extents. Extents comprise groups of contiguous data blocks.\n");
      out.write(" Data blocks form the basic units of data storage.<br>\n");
      out.write("<big>Partitioning</big><br>\n");
      out.write("\n");
      out.write("The partitioning feature was introduced in Oracle 8.[10] This allows the partitioning of tables based on different set of keys. Specific partitions can then be easily added or dropped to help manage large data sets.<br>\n");
      out.write("<big>Monitoring</big><br>\n");
      out.write("\n");
      out.write("Oracle database management tracks its computer data storage with the help of information stored in the SYSTEM tablespace. The SYSTEM tablespace contains the data dictionary?and often (by default) indexes and clusters. \n");
      out.write("A data dictionary consists of a special collection of tables that contains information about all user-objects in the database. Since version 8i, the Oracle RDBMS also supports \"locally managed\" tablespaces that store space management information in bitmaps in their own headers rather than in the SYSTEM tablespace.\n");
      out.write("Version 10g and later introduced the SYSAUX tablespace, which contains some of the tables formerly stored in the SYSTEM tablespace, along with objects for other tools such as OEM, which previously required its own tablespace.<br>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><big><big><u>Application area</u></big></big><br>\n");
      out.write("<big>Application Development</big> <br>\t\t\n");
      out.write("\t*BI & Data Warehousing <br>\t\t\n");
      out.write("\t*Database Cloud <br>\t\n");
      out.write("\t*Enterprise Applications <br>\t\t\n");
      out.write("\t*Exadata Database Machine <br>\n");
      out.write("\t*High Availability <br>\t\n");
      out.write("\t*Information Integration <br>\t \n");
      out.write("\n");
      out.write("\t<big>Information Management</big><br>\n");
      out.write("\t*Manageability<br>\n");
      out.write("\t*Migration<br>\n");
      out.write("\t* Optimized Storage Management<br>\n");
      out.write("\t*Performance and Scalability<br>\n");
      out.write("\t*Security and Compliance<br>\n");
      out.write("\t\t  \t \n");
      out.write(" \t </table>\n");
      out.write("</body>\n");
      out.write("<table>\n");
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
