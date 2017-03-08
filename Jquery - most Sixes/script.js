$(document).ready(function() {
	$("#details").on("click", function() {
		$.ajax({
		       type: 'get',
		       url: 'mostsixes.xml',
		       dataType: 'xml',
		       success: populateTable
		    });
	});
});

function populateTable(xml, status) {
	var count=1;
	$(body).append("<table id='mostsixes'> <tr> <td colspan='6'>Most Sixes</td> <tr> <td>S.No</td> <td>Batsman</td><td>Teams</td> <td>Innings</td><td>Sixes</td><td>Span</td> </table>");
	$(xml).find('PLAYER').each(function(){
		var name = $(this).find('NAME').text();
		var team = $(this).find('TEAMS').text();
		var innings = $(this).find('INNINGS').text();
		var sixes = $(this).find('SIXES').text();
		var span = $(this).find('SPAN').text();
$('#mostsixes').append('<tr><td>'+(count++)+'</td><td>' + name + '</td><td>' + team + '</td><td>'+innings+'</td><td>'+sixes+'</td><td>'+span+'</td></tr>');
	});
	
}