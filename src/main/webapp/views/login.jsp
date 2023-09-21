<%--
  Created by IntelliJ IDEA.
  User: computacion2
  Date: 9/4/23
  Time: 7:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="tag" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<p>${mensaje}</p>
    <tag:form action="autenticar" method="post" modelAttribute="user">
        Username: <tag:input path="username" /><br>
        Clave: <tag:input path="clave" type="password" /><br>
        <tag:button>Ingresar</tag:button>
    </tag:form>
</body>
</html>
