
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a, .dropbtn {
    display: inline-block;
    color: white;
    text-align: left;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: darkcyan;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color: darkcyan}

.dropdown:hover .dropdown-content {
    display: block;
}
.a{
    position:absolute;
    left:250px;
   
}

</style>
<br>
<ul>
  
  <li class="dropdown">
    <a href="#" class="dropbtn"> TEST PACKAGES</a>
    <div class="dropdown-content">
      <a href="java details.jsp" >JAVA</a>
      <a href="phpdetails.jsp">PHP</a>
      <a href="jsdetails.jsp">JAVA SCRIPT</a>
      <a href="oracledetails.jsp">ORACLE</a>
    </div>
  <li><a href="dashboard.jsp">MY PROFILE</a></li>
    <li><a href="home.jsp">LOGOUT</a></li>
    
    
   
  </li>
</ul><br>
    </head>
</html>
