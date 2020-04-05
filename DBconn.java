package sm;

import java.sql.*;

public class DBconn 

[


     
    public static Connection conn()

    {  
      
 Connection con=null;

        try
        
       
 {
            
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:mydsn");

            System.out.print("Connection Estb");
   
        
        }
    
    catch(Exception e)
   
     {
            System.out.print("Error" + e.getMessage());   
    
      
  }
        
 return con;
    
}

    public static void main(String ss[])
 
   {

        DBconn cc=new DBconn();
 
      Connection con= cc.conn();
   
 }

}
