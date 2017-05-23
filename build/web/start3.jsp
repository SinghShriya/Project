<%-- 
    Document   : start
    Created on : Jul 14, 2016, 10:26:00 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<style>
.button {
  
  border-radius: 4px;
  background-color: darkcyan;
  border: none;
  color: white;
  text-align: center;
  font-size: 28px;
  padding: 20px;
  width: 200px;
  transition: all 0.7s;
  cursor: pointer;
  margin: 5px;
  alignment-adjust: center;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '»';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
</style>
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
    
        <table width="1000" bgcolor="black">    
                <tr>
                    
                    <td><font face="Ariel Black" color="white" size="7">Start !</font></td>
            
                </tr>
                
        </table>
                    <hr>
        <br>
        <br>
        <h1>Click here to start your test....</h1>
        <table align="center" style="font-family:cambria;font-size:20px">
           <tr>
               <td><br>You have 10 questions to Answer in 10 minutes</td>
               </tr>
              
              </table>
        <br>
        <br>
         <table align="center">
           
              <tr><td> <a href="js.jsp" style="position:fixed; left:400px; top:380px"><button class="button" ><span>Start your test! </span></button></a></td></tr>
           
        </table>
        <br>    
              <br>
              <br>
        
           <table align="center" style="font-family:cambria;font-size:20px">
         <tr>
              <td><br>NOTE:All questions are compulsory</td>
                   </tr>
       </table>
        
       
    </body>
</html>