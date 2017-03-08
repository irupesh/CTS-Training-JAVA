$(document).ready(function() {
	$("#submit").on("click", function() {
		var name= $('#name').val();
		var email= $('#email').val();
		var mobile= $('#mobile').val();
		var date= $('#date').val();
		var ticket = $('#ticket').val();
		var venue= $('#venue').val();
		var ticketType = $("input[name='ticketType']:checked").val();
		
		$('#display').append("<h1>Registration Details<h1>");
		$('#display').append("<br>Name         :"+name);
		$('#display').append("<br>Email        :"+email);
		$('#display').append("<br>Mobile Number:"+mobile);
		$('#display').append("<br>Date         :"+date);
		$('#display').append("<br>Venue        :"+venue);
		$('#display').append("<br>No.of Tickets:"+ticket);
		$('#display').append("<br>Ticket Type  :"+ticketType);
	});
});