<%--
  Created by IntelliJ IDEA.
  User: computacion2
  Date: 9/4/23
  Time: 7:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Alumno</title>
</head>
<body>
<c:if test="${not empty alumno}">
    <ul>
        <li>Nombre: ${alumno.nombre}</li>
        <li>Edad ${alumno.edad}</li>
    </ul>
</c:if>
    <a href="listaalumnos">Ver lista</a>
</body>
</html>
