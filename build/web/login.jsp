<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>LOGIN</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body background="l7.jpg">
        
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
                <td>
                    
                    <font face="cambria" color="white" size="7">Student  Login!</font>
            
                </td>
           
             </tr>
            
            
        </table>
                    <hr>
        <br>
        <br>
        <table clospan="2"  align="center"   >
            <form name="f1" action="" method="get">
     

               <tr>
                   <td><font face="cambria" color="black" size="4">USER NAME:</font></td>
		
               </tr>
               
               <tr>
		<td><input type="text" size="70" name="t1" placeholder="Username" required ></td>
	       </tr>
               
            
	       <tr>
		<td><font face="cambria" color="black" size="4">PASSWORD:</font></td>
                
               </tr>
               <tr>
		<td><input type="password" size="70" name="t2" placeholder="Password" required></td>
	       </tr>
	       <tr>
		
		<td><input type="submit" value="Login" size="40"  ></td>
	       </tr>
               <tr>
                   <td><a href="account2.jsp">::Register New User</a></td>
               </tr>
               <tr>
                   <td>
                       <%
                           if(request.getParameter("t1")!=null || request.getParameter("t2")!=null )
                           {
                        
                              String id=request.getParameter("t1");
                              String pw=request.getParameter("t2");
                                    
                 		Connection con=null;
                                Statement st;
		                ResultSet rs;
                                boolean flag=false;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");
			st=con.createStatement();
			rs=st.executeQuery("select * from login where user_name='"+id+"' && pass_word='"+pw+"' " );
                        
                                                    
                 if(rs.next())
                  {
                      String usdb=rs.getString("user_name");
                      String pwdb=rs.getString("pass_word");
                      String namedb=rs.getString("name");
                      String emaildb=rs.getString("email_id");
		             if(id.equals(usdb) && pw.equals(pwdb)) 
                             {
                                    session.setAttribute("Name",namedb);
                                    session.setAttribute("Email",emaildb);
                                    
                                    flag=true;
                                
                             }
                  }
                            if(flag==true)
			response.sendRedirect("dashboard.jsp");
                            else %>
                <script>
			alert("Sorry, You are not an user..");
			
                  </script> 
                  <%
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
                    con.close();
                           }
%>
                   </td>
		
		
	</tr>
            </form>
            
        </table>
       
    </body>
</html>

