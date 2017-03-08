$(document).ready(function() {
	$("#getdetails").on("click", function() {
		$.getJSON('teamdetail.json', function(data) {
			var jsondata = data["teamList"];
			for(var i=0;i<3;i++){
				var date = jsondata[i].date;
				var venue = jsondata[i].venue;
				var matchdetails = jsondata[i].matchdetails;
				$('#teamdetail').append('<tr><td>'+date+'</td><td>' + venue + '</td><td>' + matchdetails + '</td></tr>');
			}
			
		});
	});
});