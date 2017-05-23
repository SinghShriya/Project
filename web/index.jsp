<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ONEX</title>
        <link rel="icon" href="images logo.png" />
<link rel="stylesheet" href="pagestyle.css" type="text/css" />
<img src="images logo.png" width="960px" height="200px"/>  

    </head>
    <body background="l7.jpg">
        <table width="1000px" align="center">
          
            <tr> 
                <td>
                    <hr />
                    <jsp:include page="menu.jsp"/>
                    <hr />
                </td>
            </tr>
            <br>
             <tr>
                <td class="slideshow">
                    <jsp:include page="slideshow.jsp"/>
                </td>
            </tr>
            <br>
            
            <table background="bg1.jpg">
             <tr>
              <td height="350px" background="bg1.jpg">
                  <h1><b><center>WELCOME TO ONLINE EXAMINATION SYSTEM</center></b></h1>
            <br><p><h3>ONEX is a one of its kind online testing site providing simplified testing solution to aspirants in INDIA.
                Our rich content alongwith the student friendly online exam portal provides seamless testing experience to students.</h3></p>
            </tr>
            
            <br></table>
          
            <table>
                <tr><h2><center>HOW IT WORKS</center></h2></tr>
                <tr><td><img src="1.jpg" width="200px" height="288px"  position="fixed" left="20px" top="100px"/></td>
                <td><img src="2.jpg" width="200px" height="288px" position="fixed" left="220px" top="100px"/></td>
                <td><img src="3.jpg" width="200px" height="288px"/></td>
                <td><img src="4.jpg" width="200px" height="288px"/></td>
                <td><img src="5.jpg" width="200px" height="288px"/></td></tr>
                <br>
                <br>
            </table>
            <br>
            <table>
            <tr>
                <td style="background-color:black" >
                    <jsp:include page="footer.jsp" />
                    
                </td>
            </tr>
        </table>
    </body>
</html>