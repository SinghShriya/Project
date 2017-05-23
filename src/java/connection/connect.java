
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connect {
    
    
    public Connection getConnect()
    {
        Connection con=null;
        Statement st;
       
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");	
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onex","root","admin");
            st=con.createStatement(); 
            
        }
        catch(Exception e)
        {
            
        }
        return con;
    }
    
    
}


