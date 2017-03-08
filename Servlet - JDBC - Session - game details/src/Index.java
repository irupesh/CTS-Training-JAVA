

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String recent ="";
		HttpSession session = request.getSession(false);
		if (session != null) {
		    // Already created.
			ArrayList<String> n=(ArrayList<String>)session.getAttribute("list"); 
			for(String s : n){
				recent+= s+"<br>";
			}
			}
		
		
		 String html="<html><head><title></title></head>"
		            + "<body>"
		            + "<h1 align='center'>View Team Details</h1>"
		            +"<form name='form1' method='get' action='DisplayServlet'>"
		            +"<table id='table1' border='1' >"
		            + "<tr><td>Select Game Date</td><td><select name='date'>"
		            + "<option value='2015-05-14'>2015-05-14</option>"
		            + "<option value='2015-02-10'>2015-02-10</option>"
		            +"<option value='2016-01-05'>2016-01-05</option>"
		            +"<option value='2016-02-11'>2016-02-11</option>"
		            +"</select></td></tr>"
		            + "<tr><td>Select Team A</td><td><select name='teamA'>"//teamA
		            + "<option value='Delhi Daredevils'>Delhi Daredevils</option>"
		   +" <option value='Gujarat Lions'>Gujarat Lions</option>"
		   +" <option value='Kings XI Punjab'>Kings XI Punjab</option>"
		   +"<option value='Mumbai Indians'>Mumbai Indians</option>"
		   +"  <option value='Rising Pune Supergiants'>Rising Pune Supergiants</option>"
		   +"  <option value='Sunrisers Hyderabad'>Sunrisers Hyderabad</option>"
		   +" <option value='Royal Challengers Bangalore'>Royal Challengers Bangalore</option>"
		   +" <option value='Kolkata Knight Riders'>Kolkata Knight Riders</option> </select></td></tr>"
		   + "<tr><td>Select Team B</td><td><select name='teamB'>"//teamB
		   + "<option value='Delhi Daredevils'>Delhi Daredevils</option>"
		   +" <option value='Gujarat Lions'>Gujarat Lions</option>"
		   +" <option value='Kings XI Punjab'>Kings XI Punjab</option>"
		   +"<option value='Mumbai Indians'>Mumbai Indians</option>"
		   +"  <option value='Rising Pune Supergiants'>Rising Pune Supergiants</option>"
		   +"  <option value='Sunrisers Hyderabad'>Sunrisers Hyderabad</option>"
		   +" <option value='Royal Challengers Bangalore'>Royal Challengers Bangalore</option>"
		   +" <option value='Kolkata Knight Riders'>Kolkata Knight Riders</option> </select></td></tr>"
		   + " </table><input type='submit' name='submit' value='Get Details'></form>"
		   +"Recently Visited teams:<br><div id=recent>"+recent
		   + "</div></body></html>";
		 
		 out.println(html);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
