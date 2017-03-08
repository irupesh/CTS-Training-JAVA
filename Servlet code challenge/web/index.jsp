<%@page import="skillDetails.*"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.OutputStream"%>

<html>
<body>
<% 
List<Player> playerList=new ArrayList<Player>();
playerList = new PlayerBO().getSkillDetails();
%>

<table id="skill_details">
<tr><td>Player Name</td><td>Skill</td><td>Country</td></tr>
<% for(Player p:playerList)
{%>
<tr><td><% out.println(p.getName());  %></td><td><%out.println(p.getSkill().getName());  %></td><td><%out.println(p.getCountry());  %></td></tr>
<%} %>
</table>
</body>
</html>