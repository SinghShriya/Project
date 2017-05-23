<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Category</title>
       
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
        <body>
    
              <table width="1000px" align="center">
          
            <tr>
                <td>
                    <jsp:include page="menu.jsp"/>
                    <hr />
                </td>
            </tr>
</table>
        
        <table width="1000" height="100" bgcolor="black">    
                <tr>
                    
                    <td><font face="cambria" color="white" size="7">Sign Up Category !</font></td>
            
                </tr>
        </table>
                    <hr>
        <br>
        <br>
        <table align="center">
            <img src="teacher.jpg" width="200" height="200" style="position:fixed; left:550px; top:300px" >
            
              <img src="student.jpg" width="200" height="200" style="position:fixed; left:250px; top:300px" >   
              <tr><td> <a href="registration.jsp" style="position:fixed; left:250px; top:500px"><button class="button" ><span>Student</span></button></a></td></tr>
            <tr><td><a href="tregistration.jsp" style="position:fixed; left:550px; top:500px" ><button class="button"><span>Teacher </span></button></a></td></tr>
        </table>
        

</body>
</html>