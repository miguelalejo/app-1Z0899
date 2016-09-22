<%@ page import="ec.ocejwcd.entidad.Dog" %>
<%--
  Created by IntelliJ IDEA.
  User: mapp190413
  Date: 22/09/2016
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
SALUDOS DESDE PAGINAS
<% Dog dog=(Dog) request.getAttribute("dog");
%>
<%=dog%>
</body>
</html>
