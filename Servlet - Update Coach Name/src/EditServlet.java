

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// fill the code
		String tname="";
        String cname="";
        
        String id=request.getParameter("teamid");
        TeamBO tbo=new TeamBO();
        try {
             tname=tbo.getTeamById(Integer.parseInt(id)).getName();
             cname=tbo.getTeamById(Integer.parseInt(id)).getCoach();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
        String outData = "<html><head><title>Indian Premier League</title></head><body>";
        outData += "<h2>Edit Team</h2>"
                + "<form method='post' action='UpdateServlet'>"
                + "<input type='text' name='name' value='"+tname+"'>"
                + "<br>"
                + "<input type='text' name='coach' value='"+cname+"'>"
                + "<input type='hidden' name='teamid' value='"+Integer.parseInt(id)+"'>"
                + "<input type='submit' value='Update' name='update'>"
                
                + "</form></body></html>";
        
	    response.getWriter().println(outData);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    
    
	}

}
