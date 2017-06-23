<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
  
<h2>RESULTADO</h2>

<table border="1">

  <thead>
    <tr>
      <th>ACCION</th>
      <th>CODIGO</th>
      <th>PATERNO</th>
      <th>MATERNO</th>
      <th>NOMBRE</th>
    </tr>
  </thead>

  <tbody>

    <c:forEach items="${lista}" var="r">

      <tr>
        <td>
          <a href="#">E</a>
          <a href="#">D</a>
        </td>
        <td>${r.codigo}</td>
        <td>${r.paterno}</td>
        <td>${r.materno}</td>
        <td>${r.nombre}</td>
      </tr>
      
    </c:forEach>

  </tbody>

</table>


