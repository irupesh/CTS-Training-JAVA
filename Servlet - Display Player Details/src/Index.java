

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Index() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String htmlRespone = "<html>";
		htmlRespone += "<form method='get' action='Display'>";
		htmlRespone += "<select name='teamName'>";
	    PlayerBO handle = new PlayerBO();
	    PrintWriter writer = response.getWriter();
		List<Team> teamList = handle.getTeamList();
		
		for(Team team : teamList){
			String option = "<option value='"+team.getName()+"'>"+team.getName()+"</option>";
			htmlRespone += option;
		}
		
		htmlRespone += "</select>"+"<input type='submit' value='Submit' name='submit'>";
		htmlRespone +="</form>";
		htmlRespone += "</html>";
		
		writer.println(htmlRespone);
	}

}
