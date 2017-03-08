<%@page import="team.TeamDAO"%>
<%@page import="team.Team"%>
<%@page import="team.CityDAO"%>
<%@page import="team.City"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.OutputStream"%>


<html>
<body>


<% 
List<Team> al=new ArrayList<Team>();
TeamDAO td=new TeamDAO();
al=td.obtainAllTeams();
Iterator<Team> i=al.iterator();
	%>
<h2>Team List</h2>
<table id="teams" border='1'>
<tr><td><b>Team</b></td><td><b>Coach</b></td><td></td></tr>
<% while(i.hasNext())
{
	Team t=i.next();
	 %>
<tr><td><% out.println(t.getName());  %></td><td><%out.println(t.getCoach());  %></td><td><a href='Delete?teamid=<% out.println(t.getId()); %>'>Delete</a></td></tr>
<% } %>
</table>


</body>
</html>