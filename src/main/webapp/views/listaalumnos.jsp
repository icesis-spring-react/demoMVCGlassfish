<%--
  Created by IntelliJ IDEA.
  User: computacion2
  Date: 8/30/23
  Time: 7:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de alumnos</title>
</head>
<body>
<ul th:each="alumno : ${listaalumnos}">
    <li th:text="${alumno.nombre}"></li>
    <li th:text="${alumno.edad}"></li>
</ul>

<p>
    ${alumno_test}
</p>
</body>
</html>
