
import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class insertvalues {

    public static void main(String[] args)
    {
    Connection con=null;
    Statement st;
    ResultSet rs;
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");
        System.out.println("CONNECTED");
        st=con.createStatement();
        
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int s_no;
     Scanner sc=new Scanner(System.in);
     String ques,op1,op2,op3,op4,ans;
     
     System.out.println("enter the serial no.");
     s_no=Integer.parseInt(br.readLine());
     
     System.out.println("enter the question");
     ques=sc.nextLine();
     
     System.out.println("enter option 1");
     op1=sc.nextLine();
     
     System.out.println("enter option 2");
     op2=sc.nextLine();
     
     System.out.println("enter option 3");
     op3=br.readLine();
     
     System.out.println("enter option 4");
     op4=sc.nextLine();
     
     System.out.println("enter correct option");
     ans=sc.nextLine();
    
    
     //insert
     String sql="insert into java values("+s_no+",'"+ques+"','"+op1+"','"+op2+"','"+op3+"','"+op4+"','"+ans+"')";
     
     int res=st.executeUpdate(sql);
          if(res!=0)
           System.out.println("record inserted");
          else
        System.out.println("record not inserted");
         
     con.close();
        
    }
    catch(Exception e)
            {
              System.out.println(e.toString());
            }
    }
    
}  