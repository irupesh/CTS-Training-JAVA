import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
    {        
		  ResourceBundle rb= ResourceBundle.getBundle("mysql");
	        String url=rb.getString("db.url");
	        String user=rb.getString("db.username");
	        String pass=rb.getString("db.password");
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con=null;
	       
	        try
	        {
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ctsipl","root","rupesh07");
	         // con=DriverManager.getConnection(url,user,pass);
	        // fill the code
	      
	        }
	        catch(SQLException sqlEx){
	        	sqlEx.printStackTrace();
	        }
	        return con;
	       
	    }
    }


