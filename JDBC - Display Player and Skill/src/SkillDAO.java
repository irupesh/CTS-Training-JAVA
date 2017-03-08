

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SkillDAO {
    
    public Skill getSkillByID(Long id) throws ClassNotFoundException, SQLException {
        ResourceBundle rb= ResourceBundle.getBundle("mysql");
        
        String url=rb.getString("db.url");
        String user=rb.getString("db.username");
        String pass=rb.getString("db.password");
          Connection con = DriverManager.getConnection(url,user,pass);
     
         //fill your code
          Skill skill = null;
          Statement stmt=con.createStatement(); 
          ResultSet rs=stmt.executeQuery("select * from skill where id ="+id);  
          while(rs.next()){  
        	   skill = new Skill((long)rs.getInt(1),rs.getString(2));  
          }
          con.close();
          return skill;


    }
    
}
