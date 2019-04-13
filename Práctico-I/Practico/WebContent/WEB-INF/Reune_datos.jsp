<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@page import="java.sql.*"%>

	<%
		String nombre = request.getParameter("nombre");

		String apellidomaterno = request.getParameter("apellidomaterno");

		String apellidopaterno = request.getParameter("apellidopaterno");

		String telefono = request.getParameter("telefono");

		String email = request.getParameter("email");

		String status = request.getParameter("status");
		
		String fecha = request.getParameter("fecha");


		Class.forName("com.mysql.jdbc.Driver");

		try {

			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/proyecto_jsp", "root",
					"");

			Statement miStatement = miConexion.createStatement();

			String instruccionSql = "INSERT INTO USUARIOS (nombre, apellidomaterno, apellidopaterno, telefono, email, status, fecha)VALUES('"
					+ nombre + "','" + apellidomaterno + "','" + apellidopaterno + "','" + telefono + "','" + email + "','" + status
					+ "' , ' " + fecha + "'    )";

			miStatement.executeUpdate(instruccionSql);

			out.println("Registrado con exito");
		} catch (Exception e) {

			out.println("Ha habido un error");
		}
	%>


</body>
</html>