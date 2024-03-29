<!DOCTYPE html>
<html>
<head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: black;
}

li {
    float: left;
}

li a, .dropbtn {
    display: inline-block;
    color: whitesmoke;
    text-align: center;
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
    background-color: white;
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

.dropdown-content a:hover {background-color:darkcyan}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>
</head>
<body>

<ul>
  <li><a class="active" href="home.jsp">HOME</a></li>
  <li class="dropdown">
    <a href="#" class="dropbtn">TEST PACKAGES</a>
    <div class="dropdown-content">
      <a href="java details.jsp">JAVA</a>
      <a href="phpdetails.jsp">PHP</a>
      <a href="jsdetails.jsp">JAVA SCRIPT</a>
      <a href="oracledetails.jsp">ORACLE</a>
    </div>
  <li><a href="account.jsp">LOGIN</a></li>
    <li><a href="account2.jsp">SIGNUP</a></li>
    <li><a href="contacts.jsp">CONTACTS</a></li>
  
  </li>
</ul>

</body>
</html>