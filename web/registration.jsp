<%@ page  import="java.sql.*" %>
<html>
    <head>
        <title>Registration page</title>
         
     <body background="l7.jpg">
          <table width="1000px" align="center">
          
            <tr>
                <td>
                    <jsp:include page="menu.jsp"/>
                    <hr />
                </td>
            </tr>
</table>
         
     <form name="f1" action=" " method="post">
         <table width="1300" align="center" style="font-family:cambria;font-size:60px;background-color:black;color:white">
           <tr>
               <td>Register!</td>
             </tr> 
             </table>
         <hr style="color:black"/><br>
             <table width="200"align="center"style="font-family:cambria;font-size:20">
                 <tr>
		<td>   Name</td>
                <br>
             </tr>  
              <tr> 
		<td><input type="text" size="40px" name="t1" required></td>
	      </tr>
              <tr>
		<td>  User Name</td>
                <br>
             </tr>  
              <tr> 
		<td><input type="text" size="40px" name="t2" required></td>
	      </tr>
         <tr>
		<td>  email Address</td>
                <br>
         </tr> 
         <tr>
		<td><input type="text"size="40px"  name="t3" required></td>
	 </tr>
	<tr>
		<td>  Password</td>
                <br>
         </tr> 
         <tr>
		<td><input type="password" size="40px"  name="t4" required></td>
	</tr>
        
         <tr>
		<td>Mobile no.</td>
                <br>
         </tr>
         <tr>
		<td><input type="text" size="40px" name="t5" required></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="Sign up" onClick="reg()"></td>
	</tr>
        <br>
        <br>
        <tr>
            <td>
                <a href="account.jsp">: :login Existing user</a>
        </table>
         
        <script>
             
             function reg()
             {
               
                 alert("You Are Registered Successfully !!");
                 
             }
             </script>
             <%  
                 if(request.getParameter("t1")!=null || request.getParameter("t2")!=null || request.getParameter("t3")!=null || request.getParameter("t4")!=null || request.getParameter("t5")!=null)
                 {
        Connection con=null;
        Statement st;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");	
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");   
            st=con.createStatement();
            
            String name=request.getParameter("t1");
            String uname=request.getParameter("t2");
            String email=request.getParameter("t3");
            String password=request.getParameter("t4");
            int phn=Integer.parseInt(request.getParameter("t5"));
                     
            String sql="insert into login values('"+uname+"','"+name+"','"+email+"','"+password+"',"+phn+")";
            int res=st.executeUpdate(sql);
            if(res!=0)
               
                response.sendRedirect("login.jsp");
            else
                out.println("Record Not Inserted");
           
            con.close();
        }catch(Exception ee)
        {
            out.println( ee.toString());
        }
                 }  
        %>
        </table>          
      </form>
        <table>
            <tr>
                <td style="background-color:black" >
                    <jsp:include page="footer.jsp" />
                    
                </td>
            </tr>
        </table>
        
         </body>
  </html>