<%--
  Created by IntelliJ IDEA.
  User: computacion2
  Date: 8/30/23
  Time: 7:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de alumnos</title>
</head>
<body>${listaalumnos}
<ul>
<c:forEach items="${listaalumnos}" var="alumno">
    <li><a href="consultar?nombre=${alumno.nombre}" title="Ver detalle del alumno">${alumno.nombre} -
    ${alumno.nota.valor} - ${alumno.nota.desc}</a> </li>
</c:forEach>
</ul>
<a href="formulario">Registrar</a>
</body>
</html>
