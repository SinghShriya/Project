<%@page contentType="text/html"import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONTACT</title>
    </head>
   <body background="l7.jpg">
        <table width="1000px" align="center">
          
            <tr>
                <td>
                    <jsp:include page="quesmenu.jsp"/>
                    <hr />
                </td>
            </tr>
</table>
      
        <table width="1000" height="100" bgcolor="black">
            <tr>
                <td>
                    
                    <font face="Ariel Black" color="white" size="7">Contact Us !</font>
            
                </td>
           
             </tr>
            
            
        </table>
       <hr style="color: black"/><br>
            
       <br>
       <br>
       <table clospan="2"  align="left"  >
            <form name="f1" action="answer.jsp" method="post">
               <tr>
                   <td><font face="cambria" color="black" size="5"><center>Leave Us a Reply</center></font></td>
		
               </tr>
               <tr></tr>
                 <tr></tr>
                 <tr></tr>
               
               <tr>
                   <td><font face="cambria" color="black" size="3" >NAME:</font></td><br>
                 <td><input type="text" size="40" name="t1" required ></td>
	       </tr>
               <tr></tr>
               
                <tr>
                    <td><font face="cambria" color="black" size="3" >E-MAIL:</font></td><br>
                 <td><input type="text" size="40" name="t2" required></td>
	       </tr>
                 <tr></tr>
                <tr>
                    <td><font face="cambria" color="black" size="3">SUBJECT:</font></td><br>
                <td><input type="text" size="40" name="t3" ></td>
	       </tr>
                 <tr></tr>
                <tr>
                    <td><font face="cambria" color="black" size="3">MESSAGE:</font></td><br>
                <td><textarea width="70" height="50" required>
	</textarea>
	</td>
               </tr>
                
               <tr>
		
               <td>
                   <center><input type="submit" value="Submit" size="40"></center>
               </td>
              
	       </tr>
         
                     
              
            </form>
       </table>
        <table clospan="2"  bgcolor="black" width="300" height="300" style="position:fixed; left:600px; top:250px" >
            <tr>
                <td>
            <font face="Ariel Black" color="white" size="5"><center>CONTACT INFO</center>
                </td>
            </tr>
            <tr>
                <td><hr style="color: white"/></td>
            </tr>
            <tr>
                <td><font face="Ariel Black" color="white" size="4">+91-9696607989</td>
            </tr>
            <tr>
                <td> <font face="Ariel Black" color="white" size="4">INFO@ONEX.COM </td>
            </tr>
            
        </table>
       </form>
   </body>
</html>
