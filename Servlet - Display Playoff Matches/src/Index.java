

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PlayOffServlet
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
		String[] teamAimg={"gl","sh","gl","rc"};
		String[] teamBimg={"rcb","kkh","sh","sh"};
		int j=0;
		int k=0;
		int l=0;
		String[] array={"Qualifier 1","Eliminator","Qualifier 2","Final"};
		PrintWriter pw=response.getWriter();
		MatchBO mbo=new MatchBO();
		List<Match> al=null;
		al=mbo.obtainAllMatches();
        Iterator<Match> i=al.iterator();
        
        pw.println("<html><body><h3>Play Offs</h3><table border=1 id='playoff'>");
        while(i.hasNext())
        {
        	
        	Match m=i.next();
        	
        	pw.println("<tr><td>"+array[j]+"</td><td><img src='"+teamAimg[k]+".png' alt='img'/>"+m.getTeamA()+"</td><td>"+m.getTeamAscore()+"</td><td><img src='"+teamBimg[l]+"'>"+m.getTeamB()+"</td><td>"+m.getTeamBscore()+"</td></tr>");
        	
        	j++;k++;l++;
        	
        	
        }
        pw.println("</table></body></html>");
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
