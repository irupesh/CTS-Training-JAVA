import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class SkillDAO {

  public List<Skill> listAllSkills() throws ClassNotFoundException, SQLException{
       ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);
   //fill your code
      
      List<Skill> skills = new ArrayList<Skill>();
       
      Statement stmt=con.createStatement(); 
      ResultSet rs=stmt.executeQuery("select * from skill order by name");  
      while(rs.next()){  
    	  Skill skill = new Skill((long)rs.getInt(1),rs.getString(2));
          skills.add(skill);
      }
      con.close();
      return skills;
  }
  
}
