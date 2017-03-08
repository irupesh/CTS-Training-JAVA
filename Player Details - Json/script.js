$(document).ready(function() {
	$("#json").on("click", function() {
		var form = $('#f').serializeArray();
		var formObject = {};
		$.each(form,
		    function(i, v) {
		        formObject[v.name] = v.value;
		    });
		var data = JSON.stringify( formObject );
		$("#data").val(data);
	});
});

