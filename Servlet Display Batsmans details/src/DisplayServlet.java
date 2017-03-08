

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
   //fill the code
		PlayerBO playerBO = new PlayerBO();
		PrintWriter out=response.getWriter();
		List<Player> playerList =new ArrayList<>();
		try {
		   playerList = playerBO.obtainAllBatsMan();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String html = "<html><body><h1>Indian Premier League</h1><h3>Batsman List:</h3>";
		html  += "<table id='batsman' boder=1><tr><td>Sno</td><td>Name</td><td>Country</td></tr>";
		int count=1;
		for(Player player :playerList){
			html  += "<tr><td>"+(count++)+"</td><td>"+player.getName()+"</td><td>"+player.getCountry()+"</td></tr>";
        } 
		html  += "</table></body></html>";
		out.println(html);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
