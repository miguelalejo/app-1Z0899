<%--
  Created by IntelliJ IDEA.
  User: mapp190413
  Date: 09/09/2016
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
  List listaEstilos = (List)request.getAttribute("estilos");
  Iterator it = listaEstilos.iterator();
  while(it.hasNext()){


%>
  <%=it.next()%>
<%
  }
  %>

</body>
</html>
