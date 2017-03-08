

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderServlet
 */
@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html;charset=UTF-8"); 
	PrintWriter out = response.getWriter(); 
	String sn1=request.getParameter("skill");
	String tn1=request.getParameter("team_name");
	out.println("<a href='./index.html'>Home</a>"); 
	out.println("<a href='./BattingServlet?team_name="+tn1+"&skill="+"Batting"+"'>BatsMen</a>"); 
	out.println("<a href='./BowlingServlet?team_name="+tn1+"&skill="+"Bowling"+"'>Bowlers</a>"); 
	out.println("<a href='./AllRounderServlet?team_name="+tn1+"&skill="+"All Rounder"+"'>All Rounder</a>"); 
	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//fill the code
	}

}
