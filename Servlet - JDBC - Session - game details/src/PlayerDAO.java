import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlayerDAO{

    public ArrayList<Player> obtainAllPlayers(int id) throws ClassNotFoundException, SQLException {
        Connection con = DBConnection.getConnection();

       //fill the code
        	
        ArrayList<Player> players = new ArrayList<Player>();
        String selectSQL = "SELECT NAME FROM player where TEAM_ID = ?";
          PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
          preparedStatement.setInt(1, id);
          ResultSet rs = preparedStatement.executeQuery();
          while (rs.next()) {
        	  System.out.println(rs.getString("NAME"));
        	 Player p = new Player(rs.getString("NAME") );
        	 players.add(p);
          }
          return players;
    }


	
		
}
    
    


