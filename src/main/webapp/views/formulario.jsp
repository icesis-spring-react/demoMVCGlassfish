<%--
  Created by IntelliJ IDEA.
  User: computacion2
  Date: 9/4/23
  Time: 7:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="tag" %>
<html>
<head>
    <title>Formulario</title>
</head>
<body>
    <tag:form action="registrar" method="post" modelAttribute="alumnoFrm">
        Nombre: <tag:input path="nombre" /><br>
        Edad: <tag:input path="edad" /><br>
        <tag:button>Registrar</tag:button>
    </tag:form>
</body>
</html>
