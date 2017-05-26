<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>MULTIPLICAR</title>
    <style>

      div{
        margin: 10px;
        padding: 10px;
      }

    </style>
  </head>
  <body>
    <h1>MULTIPLICAR</h1>
    <a href="index.htm">Retornar</a>
    <form method="post" action="multiplicar.htm">
      <div>
        <label>Número 1:</label>
        <input type="text" name="num1" />
      </div>
      <div>
        <label>Número 2:</label>
        <input type="text" name="num2" />
      </div>
      <div>
        <input type="submit" value="Procesar" />
      </div>
    </form>

    <c:if test="${rpta != null}">
      <h1>Reporte</h1>
      <div>
        <div>Númaro 1: ${n1}</div>
        <div>Númaro 2: ${n2}</div>
        <div>Producto: ${rpta}</div>
      </div>
    </c:if>

  </body>
</html>