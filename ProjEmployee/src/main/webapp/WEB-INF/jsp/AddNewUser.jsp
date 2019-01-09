<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>Add New User</h2>
		<form action="addUser" method="post">
			<div
				style="border: dotted; width: 20%; height: 10%; padding: 10%; border-radius: 1cm 2cm;">

				<p>
					<b>User Name : </b><input type="text" name="userName">
				</p>
				<p>
					<b>Password : </b><input type="password" name="userPassword">
				</p>
				<p>
					<input type="submit">
				</p>
			</div>
		</form>


	</center>
</body>
</html>