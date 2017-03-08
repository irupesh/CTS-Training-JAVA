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

List<City> alcity=new ArrayList<City>();
CityDAO ct=new CityDAO();
alcity=ct.obtainAllCities();
Iterator<City> ii=alcity.iterator();

    %>








<table id="teams">
<h2>Existing Teams</h2>
<tr><td><b>Team</b></td><td><b>Coach</td></b></tr>
<% while(i.hasNext())
{
    Team t=i.next(); %>
<tr><td><% out.println(t.getName());  %></td><td><%out.println(t.getCoach());  %></td></tr>
<%} %>
</table>

<h2>New Team!!! Register Here...</h2>
<form action="Register" method="POST">
<table>
<tr><td>Name</td><td><input type="text" name="name"></td></tr>
<tr><td>Coach</td><td><input type="text" name="coach"></td></tr>
<tr><td>Home City</td><td><select name="city">
<% while(ii.hasNext())
{
    City c=ii.next(); %>
  <option value="<% out.println(c.getName());  %>"><% out.println(c.getName());  %></option>
<%} %>
</select>
  </td></tr>
<tr><td><input type="submit" value="Register" id="register"></td></tr>
</table>
</form>

</body>
</html>