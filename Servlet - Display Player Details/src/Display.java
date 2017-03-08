

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String team = request.getParameter("teamName");
		PlayerBO handle = new PlayerBO();
		PrintWriter writer = response.getWriter();
		List<Player> playerList = handle.getPlayerListByTeam(team);
		
		String htmlRespone = "<html>"+"<table>	<tr> <th> Name</th><th>Team</th><th> Matches</th><th> Highest Score</th><th> Runs</th><th> Strike Rate</th></tr>";
		
		for(Player player : playerList){
			htmlRespone += "<tr><td>"+player.getName()+"</td><td>"+player.getTeam().getName()+"</td><td>"+player.getMatches()+"</td><td>"+player.getHighestScore()+"</td><td>"+player.getRuns()+"</td><td>"+player.getStrikeRate()+"</td></tr>";
		}
          		
		htmlRespone +="</table></html>";
		writer.println(htmlRespone);
		
	}

}
