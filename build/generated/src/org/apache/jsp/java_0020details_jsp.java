package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class java_0020details_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<table width=\"1000\"  align=\"center\" bgcolor=\"black\" style=\"font-family:cambria;font-size:60px;color:white\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Java Details!</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table width=\"1000\" style=\"font-family:calibri; font-size:20px; color:black\">\n");
      out.write("<hr style=\"color:black\"/>\n");
      out.write("\n");
      out.write("<img src=\"index.png\"width=\"200\" height=\"150\">\n");
      out.write("<br>\n");
      out.write("<tr>\n");
      out.write("\t<td><big><big><u>Java overview</u></big></big><br>\n");
      out.write("\tJava programming language was originally developed by Sun Microsystems.<br>\n");
      out.write("        java is:<br>\n");
      out.write("\n");
      out.write("   <big>* Object Oriented:</big> In Java, everything is an Object.<br> Java can be easily extended since it is based on the Object model.<br>\n");
      out.write("\n");
      out.write("   <big>* Platform independent:</big> Unlike many other programming languages including C and C++, when Java is compiled, it is not compiled into platform specific machine, rather into platform independent byte code.\n");
      out.write("   <br> This byte code is distributed over the web and interpreted by virtual Machine (JVM) on whichever platform it is being run.<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <big>* Simple:</big> Java is designed to be easy to learn.<br> If you understand the basic concept of OOP Java would be easy to master.<br>\n");
      out.write("\n");
      out.write("    <big>* Secure:</big> With Java's secure feature it enables to develop virus-free, tamper-free systems. Authentication techniques are based on public-key encryption.<br>\n");
      out.write("   <big>* Architectural-neutral:</big> Java compiler generates an architecture-neutral object file format which makes the compiled code to be executable on many processors, with the presence of Java runtime system.<br>\n");
      out.write("\n");
      out.write("  <big>* Portable: </big>Being architectural-neutral and having no implementation dependent aspects of the specification makes Java portable. Compiler in Java is written in ANSI C with a clean portability boundary which is a POSIX subset.<br>\n");
      out.write("\n");
      out.write("  <big>* Robust:</big> Java makes an effort to eliminate error prone situations by emphasizing mainly on compile time error checking and runtime checking.</br>\n");
      out.write("\n");
      out.write("  <big>* Multithreaded:</big> With Java's multithreaded feature it is possible to write programs that can do many tasks simultaneously. This design feature allows developers to construct smoothly running interactive applications.<br>\n");
      out.write("\n");
      out.write("  <big>* Interpreted:</big> Java byte code is translated on the fly to native machine instructions and is not stored anywhere. The development process is more rapid and analytical since the linking is an incremental and light weight process.<br>\n");
      out.write("\n");
      out.write("  <big>* High Performance:</big> With the use of Just-In-Time compilers, Java enables high performance.\n");
      out.write("\n");
      out.write("  <big>* Distributed:</big> Java is designed for the distributed environment of the internet.<br>\n");
      out.write("\n");
      out.write("  <big>* Dynamic:</big> Java is considered to be more dynamic than C or C++ since it is designed to adapt to an evolving environment.<br> Java programs can carry extensive amount of run-time information that can be used to verify and resolve accesses to objects on run-time.<br>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><br><big><big><u>Java  Basic Syntax</u></big></big><br>\n");
      out.write("\n");
      out.write("When we consider a Java program it can be defined as a collection of objects that communicate via invoking each other's methods. Let us now briefly look into what do class, object, methods and instance variables mean.<br>\n");
      out.write("\n");
      out.write("   <big> Object -</big> Objects have states and behaviours. Example: A dog has states - colour, name, breed as well as behaviours -wagging, barking, eating. An object is an instance of a class.<br>\n");
      out.write("\n");
      out.write("    <big>Class - </big>A class can be defined as a template/ blue print that describes the behaviours/states that object of its type support.<br>\n");
      out.write("\n");
      out.write("   <big> Methods - </big>A method is basically a behaviour. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.<br>\n");
      out.write("\n");
      out.write("   <big> Instance Variables - </big>Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables.<br>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><br><big><big><u>Java - Object & Classes</u></big></big><br>\n");
      out.write("  Java is an Object-Oriented Language. As a language that has the Object Oriented feature, Java supports the following fundamental concepts:\n");
      out.write("\n");
      out.write("   * Polymorphism<br>\n");
      out.write("   *Inheritance<br>\n");
      out.write("    *Encapsulation<br>\n");
      out.write("   * Abstraction<br>\n");
      out.write("    *Classes<br>\n");
      out.write("   * Objects<br>\n");
      out.write("   * Instance<br>\n");
      out.write("    *Method<br>\n");
      out.write("     *Message Parsing<br>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("</table>\n");
      out.write("                    <table>\n");
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
