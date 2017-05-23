
<%@page contentType="text/html"  import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>Result Page</title>
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

     <%
      String st[]=new String[10];
       for(int i=0;i<9;i++) 
       {
      int j=i+1;
      st[i]=request.getParameter("radio"+j);
      System.out.println(st[i]);

       }
          try 
          {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");  
             Statement stmt=connection.createStatement();
             ResultSet rs=stmt.executeQuery("Select ans from java");
            String ans[]=new String[10];
           int i=0;
           
             while(rs.next()) 
             {
             ans[i]=rs.getString("ans");
             i++;
             
             }
            int count=0;
          
            for(i=0;i<9;i++)
                
                
            {
              if(st[i].equals(ans[i]))
              {
               count++;
            
              }
           }
           int score=count*10;
           
            %>
                  
            <table width="100%" align="center" background="r.jpg" style="font-family:cambria;font-size:30px">
                <tr>
                    <td><br><br><br><br><br></td>
                  </tr>  
                  
                 
                <tr>
                    <td><br><br><br></td>
                  </tr>  
               
                <tr>
                    <td><h2><center> OneX Online Examination</center></h2></td>
                    </tr>
    
                <tr>
                    
                    <td><u><center>You have attended the Quiz sucessfully</center></u></td>
                    
                    </tr>
                     
                    <br>
                   <tr>
                      
                       <td><center>Correct Answer are <%=count%> </center></td>
                       
                       </tr>
                       
                       <tr>
                           <td><center> Your score <%=score%> out of 100</center></td>
                          </tr> 
                       
                       <tr>
                    <td><br><br><br><br><br></td>
                  </tr>  
                  
                  
            
         <% connection.close();
          }
catch(NullPointerException e)
		{%>
                
		<tr>
          
                    <td> <center><h1><%out.println("Your Quiz is Incomplete");%></h1></center></td>
                
                   </tr>
                     
                     
                <%       
		}
         %>
</table>
    </body>
</html>
