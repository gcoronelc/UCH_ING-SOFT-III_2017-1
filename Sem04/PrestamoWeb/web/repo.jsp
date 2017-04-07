<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PRESTAMO</title>
  </head>
  <body>
    <h1>CRONOGRAMA DE PAGO</h1>
    <table border="1">
      <thead>
        <tr>
          <th>MES</th>
          <th>CAPITAL</th>
          <th>INTERES</th>
          <th>TOTAL</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${lista}" var="bean">
        <tr>
          <td>${bean.mes}</td>
          <td>${bean.capital}</td>
          <td>${bean.interes}</td>
          <td>${bean.total}</td>
        </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
