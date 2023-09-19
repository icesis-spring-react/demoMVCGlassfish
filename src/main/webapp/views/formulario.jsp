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
    <title>Formulario</title>

</head>
<body>
    <tag:form action="registrar" method="post" modelAttribute="alumnoFrm">
        Nombre: <tag:input path="nombre" /><br>
        Edad: <tag:input path="edad" /><br>

        <tag:input path="nota.desc" type="hidden"/>
        Nota: <tag:select path="nota.valor" onchange="myNewFunction(this)">
        <c:forEach items="${posibles_notas}" var="nota_valor">
            <tag:option value="${nota_valor.valor}" label="${nota_valor.desc}" />
        </c:forEach>
        </tag:select>
        <tag:button>Registrar</tag:button>
    </tag:form>
</body>
<script>
function myNewFunction(sel) {
    document.getElementById("nota.desc").value = sel.options[sel.selectedIndex].text;
}
</script>
</html>
