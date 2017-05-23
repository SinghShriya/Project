<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> MyProfile </title>
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
    
        <table width ="100%" bgcolor="black"> 
            <tr> 
                <td> <font face="cambria" color="white" size="7" >Dashboard !</font></td>
            </tr>
           
        </table>
        <hr style="color:black"/><br><br>
        <style>
            #td{
    
     font-size: 20px;
     font-family: blue;
}
        .tt {
    width: 200px;
    height:50px;
    border: 8px solid black;
    padding: 80px;
    margin: 30px;
    background:aliceblue;
}

</style>
        
        <div style="position:fixed; left:480px; top:190px;">    
        <table  width ="440" height="900"  >
            <tr>
                <br>
                <br>
                <td style="position:fixed; left:580px; top:170px; color:Black; font-family: cambria;">
                    <h1>TEST PACKAGES</h1>
                </td>
            </tr>
            <tr>
                <td>
                    <img src="java.png" width="200" height="200" style="position:fixed; left:480px; top:220px">
                </td>
                <td>
                  <img src="php.png" width="200" height="200" style="position:fixed; left:680px; top:220px">
                </td>
            </tr>
            
            <tr>
                <td style="position:fixed; left:520px; top:390px; "><h2><u><a href="start1.jsp" style="color:dodgerblue">Java 2016</a></u></h2></td>
            
                <td style="position:fixed; left:720px; top:390px;"><h2><u><a href="start2.jsp" style="color:dodgerblue">Php 2016</a></u></h2></td>
            </tr>
            
                <td>
                    <img src="js.png" width="150" height="150" style="position:fixed; left:500px; top:450px">
                </td>
                <td>
                    <img src="oracle.jpg" width="150" height="150" style="position:fixed; left:700px; top:450px">
                </td>
            </tr>
            
            <tr>
                <td style="position:fixed; left:500px; top:600px; color:dodgerblue;"><h2><u><a href="start3.jsp" style="color:dodgerblue">JavaScript 2016</a></u></h2></td>
                <td style="position:fixed; left:700px; top:600px; color:dodgerblue;"><h2><u><a href="start4.jsp" style="color:dodgerblue">Oracle 2016</a></u></h2></td>
            
            </tr>
            
        </table></div>
        <br>
        <div class="tt">
        <table>
            <tr>
                <td style="position:absolute;  left:100px; top:300px; color:black;">
                    <h2><big> OnEx Welcomes You</big></h2>
            <tr>
                <td id="td" style="top:400px; left:100px; position:absolute ;size:5  " >
                    <%
	if(session.getAttribute("Name")!=null || session.getAttribute("Email")!=null )
	{
		String un=(String)session.getAttribute("Name");
                String emid=(String)session.getAttribute("Email");
		out.println("Name: "+un+" ");%>
                </td></tr>
            <tr>
                <td id="td" style="top:450px; left:100px; position:absolute; size:5 ">
                    <%
            
                out.println("Email: "+emid+" ");
	}
      else
		response.sendRedirect("login.jsp");


	
%>
                </td>
            </tr>
                </td>
            </tr>
            
        </table></div>
      
    </body>
</html>
