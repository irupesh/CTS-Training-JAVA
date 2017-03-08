

import java.io.IOException;
import java.io.PrintWriter;

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
     * Default constructor. 
     */
    public Display() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        String bowl=request.getParameter("bowling");
        String bat=request.getParameter("batting");
        String feild=request.getParameter("fielding");
        String att=request.getParameter("attitude");
        String rating=request.getParameter("rating");
        String com=request.getParameter("comments");
        
        String html = "<html><body>Feedback of player"+" " +name+"<br>"; 
        		html +=	"<table id='feedback' border='1'>"  + "<tr><td>Bowling</td><td>"+ bowl+"</td></tr>"+ "<tr><td>Batting</td><td>"+ bat+"</td></tr>" + "<tr><td>Fielding</td><td>"+ feild+"</td></tr>" + "<tr><td>Rating</td><td>"+ rating + "</td></tr>" + "<tr><td>Attitude</td><td>"+ att+"</td></tr>"  + "<tr><td>Comments</td><td>"+ com+"</td></tr></table>";
        		html += "</body></html>";
        out.println(html);
	}

}
