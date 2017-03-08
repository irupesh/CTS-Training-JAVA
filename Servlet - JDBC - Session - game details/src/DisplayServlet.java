

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		String date=request.getParameter("date");
		String teamA=request.getParameter("teamA");
		String teamB=request.getParameter("teamB");
		
		HttpSession session = request.getSession(false);
		
		if (session == null){
		    session = request.getSession();
		    ArrayList<String> list = new ArrayList<String>();
		    list.add(teamA);
		    list.add(teamB);
		    session.setAttribute("list", list);
		} else {
		    // Already created.
			boolean a=false,b=false;
			ArrayList<String> list=(ArrayList<String>)session.getAttribute("list");
			for(String s : list){
				if(s.equals(teamA)){
					a=true;
					break;
				}
			}
			if(!a){
				if(list.size()>=4){
					list.remove(0);
					list.add(teamA);
				}
				else
					list.add(teamA);
			}
			
			for(String s : list){
				if(s.equals(teamB)){
					b=true;
					break;
				}
			}
			if(!b){
				if(list.size()>=4){
					list.remove(0);
					list.add(teamB);
				}
				else
					list.add(teamB);
			}
				
			session.setAttribute("list", list);
		}
		
		
		Game game = null;
		try {
			game = new GameBO().viewGameDetails(date, teamA, teamB);
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Player> team1 =null;
		ArrayList<Player> team2 = null;
		if(game==null)
		{
			try {
				Team obj1 =new TeamDAO().getTeamByName(teamA);
				 team1 = new PlayerBO().obtainAllPlayers(obj1.getId());
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Team obj2 =new TeamDAO().getTeamByName(teamB);
				 team2 = new PlayerBO().obtainAllPlayers(obj2.getId());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			String html="<html><head><title></title></head>"
		            + "<body>"
					+ "<div id='gameDetail'>"
		            +"<table><tr><td>Date</td><td>Venue</td></tr>"
					+"<tr><td>"+date+"</td><td>"+"No match held"+"</td></tr>"
					+"<tr><td>"+teamA+"</td><td>"+teamB+"</td></tr>";
			
			Iterator itr=team1.iterator();  
			Iterator itr1=team2.iterator();
			  while(itr.hasNext() && itr1.hasNext()){  
				  Player p1=(Player)itr.next();
				  Player p2=(Player)itr1.next();
				  html += "<tr><td>"+p1.getName()+"</td><td>"+p2.getName()+"</td></tr>";
			  } 
			  html += "</table><br><a href='./Index' id='back'>back</a></div></body></html>";
			  
			  out.println(html);
			
		}
		else{
		System.out.println("team1="+game.getTeam1().getId());
		System.out.println("team2="+game.getTeam2().getId());
		try {
			 team1 = new PlayerBO().obtainAllPlayers(game.getTeam1().getId());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 team2 = new PlayerBO().obtainAllPlayers(game.getTeam2().getId());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		String html="<html><head><title></title></head>"
	            + "<body>"
				+ "<div id='gameDetail'>"
	            +"<table><tr><td>Date</td><td>Venue</td></tr>"
				+"<tr><td>"+date+"</td><td>"+game.getVenue().getName()+"</td></tr>"
				+"<tr><td>"+game.getTeam1().getName()+"</td><td>"+game.getTeam2().getName()+"</td></tr>";
		
		Iterator itr=team1.iterator();  
		Iterator itr1=team2.iterator();
		  while(itr.hasNext() && itr1.hasNext()){  
			  Player p1=(Player)itr.next();
			  Player p2=(Player)itr1.next();
			  html += "<tr><td>"+p1.getName()+"</td><td>"+p2.getName()+"</td></tr>";
		  } 
		  html += "</table><br><a href='./Index' id='back'>back</a></div></body></html>";
		  
		  out.println(html);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
