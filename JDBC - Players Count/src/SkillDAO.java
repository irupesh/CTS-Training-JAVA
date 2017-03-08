

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.TreeMap;

public class SkillDAO {
  public TreeMap<Skill,Integer> skillCount(){
      TreeMap<Skill,Integer> skillCountMap = new TreeMap<Skill,Integer>();
      try{
          ResourceBundle rb= ResourceBundle.getBundle("mysql");
          String url=rb.getString("db.url");
          String user=rb.getString("db.username");
          String pass=rb.getString("db.password");
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url,user,pass);
         
              
          //fill your code
          
          Statement stmt=con.createStatement(); 
          ResultSet rs=stmt.executeQuery("select s.id,s.name,count(p.id) from player p join skill s on p.skill_id = s.id group by s.name");  
          while(rs.next()){  
        	  Skill skill = new Skill((long)rs.getInt(1),rs.getString(2)); 
        	  skillCountMap.put(skill, rs.getInt(3));
          }
          con.close();
      }
      catch(Exception e){
      System.out.println("something wrong");
      }
      return skillCountMap;

  }
}

