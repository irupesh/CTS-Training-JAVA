

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BowlingServlet
 */
@WebServlet("/BowlingServlet")
public class BowlingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BowlingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		List<Player> ls=null;
		PrintWriter out=response.getWriter();
		RequestDispatcher rd1=request.getRequestDispatcher("./HeaderServlet");
		rd1.include(request, response); 
		try{
		
			String sn1=request.getParameter("skill");
			String tn1=request.getParameter("team_name");
		System.out.println(sn1+"   "+tn1);
		SkillBO sb=new SkillBO();
		Skill s=sb.getSkillByName(sn1);
		TeamBO tb=new TeamBO();
		Team t=tb.getTeamByName(tn1);
		ls=new ArrayList<Player>();
		PlayerBO pd=new PlayerBO();
		ls=pd.getPlayerDetails(t.getId(),s.getId());
		 
		String ht="<html><head></head><body>"
		    		+ "<h1 align='center'>Indian Premier League</h1>"
		    		+ "<h4>Bowlers Details</h4>"
		    		+ "<table id='bowlers' border=1>"
		    		+ "<tr><th>Sno</th><th>Name</th><th>Country</th></tr>";
		int i=1;
		for(Player p:ls)
		{
			ht+="<tr><td>"+i+"</td>"
				+ "<td>"+p.getName()+"</td>"
				+ "<td>"+p.getCountry()+"</td></tr>";
			i++;
		}
		ht+="</table></body></html>";
		out.println(ht);
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//fill the code
		doGet( request,response);
}
}
