<%@page contentType="text/html"  import="java.sql.* "pageEncoding="UTF-8"%>

<html>
    <head>
       
        <title> quiz </title>
    </head>
    <body background="l7.jpg">
         <form name="f1" action="resultphp.jsp" method="post">
     <table width="1000px" align="center">
          
            <tr>
                <td>
                    <jsp:include page="quesmenu.jsp"/>
                    <hr />
                </td>
            </tr>
</table>
<style>
      

#block
{
    width:410;
    height:2500;
    padding:100px;
    margin:0px;
    background:none;
}
</style>

<table width="1000"  align="center" bgcolor="black" style="font-family:cambria;font-size:50px;color:white">
    
<tr>
<td>Php Test!</td>
</tr>
</table>
<hr style="color:black"/><br>
<div class="a"id="block">
<table width="600" style="font-family:cambria; font-size:25px; color:black ;">
    
    <jsp:useBean id="obj" class="connection.connect"/>

<% 	
                Connection con=null;
		Statement st;
		ResultSet rs;
                int count=0;
                String g;
                
		try
		{
                       con=obj.getConnect();
			st=con.createStatement();
                        rs = st.executeQuery("select * from php");
                           int i=1;
                           while(rs.next())
            {
                %>
<tr>

<td> <h2>Question <%=rs.getString("s_no") %></h2></td></tr>

<tr>
    <td><%= rs.getString("ques") %></td></tr>


<tr><td>
1: <input type="radio"  value="<%=rs.getString("op1")%>" name="radio<%=i%>" /><%= rs.getString("op1")%>
</td></tr>
  <tr><td>  
2: <input type="radio"  value="<%=rs.getString("op2")%>" name="radio<%=i%>" /><%= rs.getString("op2")%>
  </td></tr> 
  <tr><td>
3: <input type="radio"  value="<%=rs.getString("op3")%>" name="radio<%=i%>" /><%= rs.getString("op3")%> 
  </td></tr>
  <tr><td>
4: <input type="radio"  value="<%=rs.getString("op4")%>" name="radio<%=i%>" /><%= rs.getString("op4")%>
            
</td>
</tr>
<tr><td>
                <br>
                </td></tr>


<%
i++;
}%>
<tr>
<td>
<center>
<input type="submit" value="SUBMIT YOUR QUIZ"></center></td></tr>
<%
con.close();
}
catch(Exception e)
		{
			System.out.println(e.toString());
		}%>


</table>
                </div>
</form>
                <jsp:include page="timer.jsp"/>
</body>
</html>