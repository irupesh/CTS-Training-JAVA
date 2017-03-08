import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HomeServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//fill the code
		HttpSession session = request.getSession();
		session.setAttribute("username",(String)session.getAttribute("username"));
		session.setAttribute("password",(String)session.getAttribute("password"));
		PrintWriter out=response.getWriter();
		out.println("<html><body>"
				+ "<a href='./ProfileServlet?name="+request.getParameter("name")+"' id=profile>My Profile</a> "
				+ "<a href='./SalaryServlet?name="+request.getParameter("name")+"' id=salary>Salary Details</a> "
				+ "<a href='./LogoutServlet' id=logout>Logout</a><br>"
				+ "<hr>"
				+ "<h2>Welcome "+request.getParameter("name")+"!!!</h2>"
				+ "</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

