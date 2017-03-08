package team;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		//fill the code
		String tname=request.getParameter("name");
		String cname=request.getParameter("coach");
		String city=request.getParameter("city");
		
		try {
			Team tm=new Team(tname,cname,new CityDAO().getCityByName(city.trim()));
			System.out.println("name = "+city);
			TeamDAO td=new TeamDAO();
			 int s=td.createTeam(tm);
			 System.out.println("return " +s);
			 if(s>0)
			 {
				 out.println("<html><body>Team Registered Successfully<a href='index.jsp' id='home'><br>Home</body><html>");
			 }
			 else
			 {
				 out.println("Failed	");
			 }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
