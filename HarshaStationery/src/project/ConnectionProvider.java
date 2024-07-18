
package project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon(){
        
    try{
      Class.forName("com.mysql.cj.jdbc.Driver"); 
      Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hsd","root","root123");
      return con;  
       }
    catch(Exception e){
        return null;
    }
    }
    
}
