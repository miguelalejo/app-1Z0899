<%--
  Created by IntelliJ IDEA.
  User: mapp190413
  Date: 09/09/2016
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
SELECCION DE COLOR
<form method="POST" action="server.color.com">
  <select name="color">
    <option value="amarillo">amarillo</option>
    <option value="rojo">rojo</option>
    <option value="negro">negro</option>
  </select>
  <input type="submit" value="POST" name="POST"/>

  </form>


<form method="GET" action="server.color.com">
  <select name="color">
    <option value="amarillo">amarillo</option>
    <option value="rojo">rojo</option>
    <option value="negro">negro</option>
  </select>
  <input type="submit" value="GET" name="GET"/>

</form>
</body>
</html>
