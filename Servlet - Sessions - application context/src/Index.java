

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Index() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context=getServletContext();
		int d=0,j=0,k=0,r=0;
		
		Object dobj = context.getAttribute("d"); 
		Object jobj = context.getAttribute("j");
		Object kobj = context.getAttribute("k");
		Object robj = context.getAttribute("r");
		
		
		if(dobj == null)
			context.setAttribute("d",0);
		else
			d = (int)dobj;
		
		if(jobj == null)
			context.setAttribute("j",0);
		else
			j = (int)jobj;
		
		if(kobj == null)
			context.setAttribute("k",0);
		else
			k = (int)kobj;
		
		if(robj == null)
			context.setAttribute("r",0);
		else
			r = (int)robj;
		
		try{
			String id=request.getParameter("id");
			
			if(id.equals("1")){
				d++;
				context.setAttribute("d",d);
			}else if(id.equals("2")){
				j++;
				context.setAttribute("j",j);
			}else if(id.equals("3")){
				k++;
				context.setAttribute("k",k);
			}else if(id.equals("4")){
				r++;
				context.setAttribute("r",r);
			}	
		}
		catch(Exception e){}
		
		String html = "<html><body><h3>Players</h3><table id='player'>"
				      +"<tr><td><img src='./images/msd.jpg' style='width:128px;height:128px;'><br>"+d+" Followers <a href='Index?id=1'>Follow</a></td> "
				      +"<td><img src='./images/jadeja.jpg' style='width:128px;height:128px;'><br>"+j+" Followers <a href='Index?id=2'>Follow</a></td></tr>"
				      +"<tr><td><img src='./images/kohli.jpg' style='width:128px;height:128px;'><br>"+k+" Followers  <a href='Index?id=3'>Follow</a></td> "
				      +"<td><img src='./images/rohit.jpg' style='width:128px;height:128px;'><br>"+r+" Followers <a href='Index?id=4'>Follow</a></td></tr></table>"
				      +"</body></html>";
		response.getWriter().println(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
