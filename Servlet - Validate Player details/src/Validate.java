

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String errorText = "";

    /**
     * Default constructor. 
     */
    public Validate() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
	        PrintWriter out=response.getWriter();
	        String n=request.getParameter("name");
	        String e=request.getParameter("email");
	        String d=request.getParameter("dob");
	        String tr=request.getParameter("runs");
	        String av=request.getParameter("average");
	        
	        int b=validate(n,e,d,tr,av);
	        if(b!=1)
	        {
	        	out.println("<html><body>"+"<div id='error'>"+
                        errorText+"</div>"+"<br>"+"<a id='home' href=index.html>"+"<< Home"+"</a>"+
                            "</body></html>");
	            
	        }
	        
	        else {
	            out.println("<html>" + "<body bgcolor=\"#ffffff\">"+
	                            "<h1> Inserted SuccessFully!!!</h1>"+
	                                "</body></html>");
	            
	            
	              }
	}
	
   int validate(String n, String e, String d, String tr, String av) {
        int valid = 1;   
       
       if(n==""||!Pattern.compile("^[a-zA-Z- ]*$").matcher(n).matches())
       {
            errorText += "Invalid Name\n";
            valid = 0;
       }
        if(e=="" ||!Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$").matcher(e).matches()) {
            errorText += "Invalid Email\n";
            valid = 0;
        }
        if(d==""||!Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)").matcher(d).matches()) {
            errorText += "Invalid DOB\n";
            valid = 0;
        }
        if(tr==""||!Pattern.compile("[0-9]+").matcher(tr).matches()) {
            errorText += "Invalid runs\n";
            valid = 0;
        }
        if(av==""||!Pattern.compile("^\\d+\\.\\d{1,2}$").matcher(av).matches())
        {
            errorText+= "Invalid Average\n";
            valid=0;
        }
        
        return valid;
    }
}
