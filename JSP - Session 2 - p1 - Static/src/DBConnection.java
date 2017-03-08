
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
        Connection con = DriverManager.getConnection(url,user,pass);
        return con;
    }
}

