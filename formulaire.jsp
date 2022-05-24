<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="Client" class="beans.ClientBean" scope="session"></jsp:useBean>

<b>le nom est : <%= Client.getNom() %> </b> <br>
<b>le prenom est : <%= Client.getPrenom() %> </b><br>
<b>le adresse est : <%= Client.getAdresse() %> </b><br>
<b>le telephone est : <%= Client.getNumtel() %> </b><br>
<b>le E-mail est : <%= Client.getEmail() %> </b><br>

</body>
</html>