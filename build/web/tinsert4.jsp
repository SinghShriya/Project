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
             <table width="300" align="center" style="font-family:cambria;font-size:30">
                 <tr>
		<td>   Serial number </td>
                <br>
             </tr>  
              <tr> 
		<td><input type="text" size="20px" name="t1" /></td>
	      </tr>
              <tr>
		<td>  Question </td>
                <br>
             </tr>
              <tr> 
		<td><textarea row="15" cols="40" name="t2">
	</textarea></td>
	      </tr>
             <tr>
		<td>  Option 1 </td>
                <br>
             </tr> 
              <tr> 
		<td><textarea row="8" cols="20" name="t3">
	</textarea></td>
	      </tr>
               <tr>
		<td>  Option 2 </td>
                <br>
             </tr> 
              <tr> 
		<td><textarea row="8" cols="20" name="t4">
	</textarea></td>
	      </tr>
               <tr>
		<td>  Option 3 </td>
                <br>
             </tr> 
              <tr> 
		<td><textarea row="8" cols="20" name="t5">
	</textarea></td>
	      </tr>
               <tr>
		<td>  Option 4 </td>
                <br>
             </tr> 
              <tr> 
		<td><textarea row="8" cols="20" name="t6">
	</textarea></td>
	      </tr>
               <tr>
		<td>  Answer </td>
                <br>
             </tr> 
              <tr> 
		<td><textarea row="8" cols="20" name="t7">
	</textarea></td>
	      </tr>
              
              <tr>
		<br>
              <br>
		<td><center><input type="submit" value="Insert" ></center></td>
	</tr>
           </table>
<%
    if(request.getParameter("t1")!=null)
    {
    Connection con=null;
    Statement st;
    ResultSet rs;
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");
       
        st=con.createStatement();
        
        
            int s_no=Integer.parseInt(request.getParameter("t1"));
            String ques=request.getParameter("t2");
            String op1=request.getParameter("t3");
            String op2=request.getParameter("t4");
            String op3=request.getParameter("t5");
            String op4=request.getParameter("t6");
            String ans=request.getParameter("t7");
     
     
     //insert
     String sql="insert into oracle values("+s_no+",'"+ques+"','"+op1+"','"+op2+"','"+op3+"','"+op4+"','"+ans+"')";
     
     int res=st.executeUpdate(sql);
          if(res!=0)
            
           response.sendRedirect("record.jsp");
          else
       out.println("record not inserted");
         
     con.close();
        
    }
    catch(Exception e)
            {
              out.println("duplicate entry");
            }
    }
    %>
 
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