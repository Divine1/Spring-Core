<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h2>welcome jsp file</h2>
	<!-- <form action="/kt-session/newdata"> -->
	<!-- <button type="submit">CLick</button> -->
	<input type="text" id="inputtext" placeholder="enter color" />
	<button onclick="trigger()">CLick</button>
	<div id="content"></div>
	<!-- </form> -->
</body>
<!-- <script src="/kt-session/static/jquery-3.3.1.min.js"></script> -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"
	integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
	crossorigin="anonymous"></script>
<script>
	var trigger = function() {
		console.log("in trigger()");
		var inputdata = document.getElementById("inputtext").value;
		$.ajax({
			url : "https://code.jquery.com/kt-session/newdata?input="+inputdata,
			type : 'GET',
			success : function(data, textStatus, request) {
				console.log("success")
				console.log("textStatus ", textStatus);
				console.log("request ", request);
				console.log("data ", data);
				console.log("Content-Type ",request.getResponseHeader('Content-Type'));
				document.getElementById("content").innerHTML = "the color is "+data.color;
			},
			error : function(request, textStatus, errorThrown) {
				console.log("error");
				console.log("request ", request);
				console.log("textStatus ", textStatus);
				console.log("errorThrown ", errorThrown);
			}
		});

		/* $.ajax({
			url : "/kt-session/newdata",
			type : 'GET',
			success : function(res) {
				console.log(res);
				alert(res);
			},
			error : function(xhr, ajaxOptions, thrownError) {
				alert(xhr.status);
				alert(thrownError);
			}
		}); */
	};
</script>
</html>