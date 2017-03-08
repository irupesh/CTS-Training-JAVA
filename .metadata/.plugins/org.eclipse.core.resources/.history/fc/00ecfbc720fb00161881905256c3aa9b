

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
		
		String outData = "<html><head><title>Indian Premier League</title></head><body>";
		outData += "<h2>Indian Premier League</h2>"
				+ "<table id='batsman'>"
				+ "<tbody>"
				+ "<tr>"
				+ "<th>Sno</th>"
				+ "<th>Name</th>"
				+ "<th>Country</th>"
				+ "</tr>";
		
		PlayerDAO playerDAO = new PlayerDAO();
		List<Player> players = new ArrayList<>();
		int i = 0;
		
		try {
			players = playerDAO.obtainAllBatsMan();
		} catch (ClassNotFoundException | SQLException e) {		}
		
		for(Player p : players) {
			outData += "<tr>"
					+ "<td>" + (++i) + "</td>"
					+ "<td>" + p.getName() + "</td>"
					+ "<td>" + p.getCountry() + "</td>"
					+ "</tr>";
		}
			
		outData += "</tbody>"
				+ "</table>"
				+ "</body>"
				+ "</html>";
		
		PrintWriter out = response.getWriter();
		out.print(outData);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
