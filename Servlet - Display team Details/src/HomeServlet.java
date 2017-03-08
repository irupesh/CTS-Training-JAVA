import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		
		   //fill the code
		RequestDispatcher rd=null;
	    
		PrintWriter out=response.getWriter();
		try{
		String sname=request.getParameter("skill");
		String tname=request.getParameter("team_name");
		ServletContext con=request.getServletContext();
		//response.sendRedirect("BattingServlet?tn="+tname+",sn="+sname);
		if(sname.equals("Batting"))
	    {
			rd = con.getRequestDispatcher("/BattingServlet");
		    rd.forward(request,response);
		}
		else if(sname.equals("Bowling"))
		{
			rd = request.getRequestDispatcher("BowlingServlet");
		    rd.forward(request,response);
		}
		else if(sname.equals("All Rounder"))
		{
			rd = request.getRequestDispatcher("AllRounderServlet");
		    rd.forward(request,response);
		}}
		catch(Exception e){
			RequestDispatcher rd1=request.getRequestDispatcher("./HeaderServlet");
			rd1.include(request, response); 
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// fill the code
		doGet(request, response);
		
	}

}
