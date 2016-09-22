<%--
  Created by IntelliJ IDEA.
  User: mapp190413
  Date: 09/09/2016
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <title></title>
</head>
<body>
SELECCION DE COLOR POST
<form method="POST" action="server.color.com">
  COLOR
  <select name="color">
    <option value="amarillo">amarillo</option>
    <option value="rojo">rojo</option>
    <option value="negro">negro</option>
  </select>
  FORMATO
  <select name="formato">
    <option value="italica">ITALICA</option>
    <option value="negrita">NEGRITA</option>
    <option value="cursiva">CURSIVA</option>
  </select>
  <input type="submit" value="POST" name="POST"/>

  </form>
SELECCION POST TAMAÑO
<form method="POST" action="server.tamanio.com"  >
  TAMAÑO
  <input type="checkbox" name="tamanio" value="12">12</input>
  <input type="checkbox" name="tamanio" value="14">14</input>
  <input type="checkbox" name="tamanio" value="16">16</input>
  <input type="submit" value="POST" name="POST"/>
</form>
</body>
</html>
