<%--
  Created by IntelliJ IDEA.
  User: mapp190413
  Date: 09/09/2016
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.lang.String" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
 String correo = (String)request.getAttribute("email");
%>
  DIRECCION DE CONTACTO:<%=correo%>


</body>
</html>
