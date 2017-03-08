

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// fill the code
		ArrayList<Player> al=null;
		try {
			al=(ArrayList<Player>) new PlayerBO().getAllCaptain();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort(al);
		PrintWriter out=response.getWriter();
		out.println("<html><body>"
				+ "<h2>Indian Premier League</h2>"
				+ "<b>Team Details:</b>"
				+ "<table id='team'>"
				+ "<tr><th>Sno</th><th>Captain Name</th><th>Country</th><th>Coach</th><th></th></tr>");
		Iterator< Player>it=al.iterator();
		int sno=1;
		System.out.println("index");
		while(it.hasNext())
		{
			Player p=it.next();
			out.println("<tr><td>"+(sno++)+"</td><td>"+p.getName()+"</td><td>"+p.getTeam().getName()+"</td><td>"+p.getCountry()+"</td><td>"+p.getTeam().getCoach()+"</td><td><a value='Edit' href='EditServlet?teamid="+p.getTeam().getId()+"' >Edit</a></td></tr>");
		}
		out.println("</table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
