

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Index() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String outData = "<html><head><title>Indian Premier League</title></head><body>";
        outData += "<h3>Enter Team Details :</h3>"
                + "<form method='post' action='Display'>"
        		+"<table>"
                +"<tr>"
                +"<td> Name </td>"
                +"<td><input type='text' name='name'></td>"
                +"</tr>"
                +"<tr>"
                +"<td>Coach </td>"
                + "<td><input type='text' name='coach'></td>"
                +"</tr>"
                +"<tr>"
                +"<td>City </td>"
                + "<td><input type='text' name='city'></td>"
                +"</tr>"
                +"<tr>"
                +"<td>Captain </td>"
                + "<td><input type='text' name='captain'></td>"
                +"</tr>"
                +"<tr>"
                +"<td></td>"
                + "<td><input type='submit' name='submit' value='Submit'></td>"
                +"</tr>"
                
                + "</form></table></body></html>";
        
	    response.getWriter().println(outData);
		
		
	}

}
