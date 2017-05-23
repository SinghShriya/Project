<%@ page  import="java.sql.*" %>

<html>
<head>
	<title>Teacher</title>
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
<table width="1000"  align="center" bgcolor="black" style="font-family:cambria;font-size:60px;color:white">

<tr>
<td>Update Questions!</td>
</tr>
</table>
                    <form method="get" action="">                  
<hr style="color:black"/>
             <table width="500" align="center" style="font-family:cambria;font-size:30">
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
                        rs = st.executeQuery("select * from js");
                           int i=1;
                           while(rs.next())
            {
                %>
<tr>

<td> <h2>Question <%=rs.getString("s_no") %></h2></td></tr>

<tr>
    <td><%= rs.getString("ques") %></td></tr>


<tr><td>
1: <%=rs.getString("op1")%></td></tr>

  <tr><td>  
2: <%=rs.getString("op2")%>
  </td></tr> 
  <tr><td>
3: <%=rs.getString("op3")%>
  </td></tr>
  <tr><td>
4:<%=rs.getString("op4")%>
            
</td>
</tr>
<tr><td>
                <br>
                </td></tr>


<%
i++;
}%>
<%
con.close();
}
catch(Exception e)
		{
			System.out.println(e.toString());
		}%>

                 <tr>
                     
		<td> Enter Serial number to delete</td>
                <br>
             </tr>  
              <tr> 
		<td><input type="text" size="20px" name="t1" /></td>
	      </tr>
              <tr>
		<br>
              <br>
		<td><center><input type="submit" value="Delete" ></center></td>
	</tr>
           

<%
    if(request.getParameter("t1")!=null)
    {
    
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");
       
        st=con.createStatement();
        
        
            int no=Integer.parseInt(request.getParameter("t1"));
            st=con.createStatement();
			int res=st.executeUpdate("delete from js where s_no="+no+"");
			if(res!=0)
				response.sendRedirect("tinsert3.jsp");
			else
				out.println("Record Not Deleted..");
				
			con.close();
		}catch(Exception e)
		{
			out.println(e.toString());
		}
		}
	%>
        </form>
        </table>
       
        </body>
</html>
