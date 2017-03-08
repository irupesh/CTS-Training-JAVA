

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
       

    public Display() {
        super();
      
    }

    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
	try {
	      Connection con= DBConnection.getConnection();

	      int id;
		String name=request.getParameter("name");
		String coach=request.getParameter("coach");
		String city=request.getParameter("city");
		String captain=request.getParameter("captian");
		TeamBO t=new TeamBO();
		City homecity = new City(101,city);
		int captain_id = new TeamDAO().getPlayerIdByPlayerName(captain);
		Team team = new Team(name, coach, homecity, captain_id);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select id from city where name='"+city+"'");
		if(!rs.next())
		{
			t.createCity(homecity);
			id=101;
		}
		else{
		     id=rs.getInt(1);
		}
		
		boolean result = new TeamDAO().createTeam(team);
		
		
		String outdata="<html><body>Team Details are <br> <h2>Team Created Successfully</h2>";
        outdata+="<table>"
                +"<tr><td>Name<td><td>Coach</td><td>City</td><td>Captain</td></tr>"
                +"<tr><td>"+name+"<td><td>"+coach+"</td><td>"+city+"</td><td>"+captain+"</td></tr>"
                
                +"</table></body></html>";
        PrintWriter out = response.getWriter();
        out.print(outdata);
		
	} 
	
	
	
	catch (ClassNotFoundException |SQLException e) {
        PrintWriter out = response.getWriter();
        out.print("hello");
		e.printStackTrace();
	} 
	}
		
			
		
		
		
		
	 
		
	}

}
