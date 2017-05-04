<%-- 
    Document   : consultarVentas
    Created on : May 4, 2017, 5:55:03 PM
    Author     : Alumno-UCH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CONSULTAR VENTAS</title>
  </head>
  <body>
    <h1>REGISTRAR VENTA</h1>
    <fieldset>
      <legend>Datos</legend>
      <form method="post" action="ConsultarVentas">
        <table>
          <tr>
            <td>Categoría:</td>
            <td>
              <select name="categoria">
                <option value="000">Seleccione una ...</option>
                <c:forEach items="${applicationScope.categorias}" var="r">
                  <option value="${r}">${r}</option>
                </c:forEach>
              </select>
            </td>
            <td>
              <input type="submit" value="Procesar"/>
            </td>
          </tr>
        </table>
      </form>
    </fieldset>
    <p style="color:blue;">${mensaje}</p>
    <p style="color:red;">${error}</p>
    
    <table border="1">
      <tr>
        <th>CLIENTE</th>
        <th>CATEGRIA</th>
        <th>PRODUCTO</th>
        <th>PRECIO</th>
        <th>CANTIDAD</th>
        <th>SUBTOTAL</th>
        <th>IMPUESTO</th>
        <th>TOTAL</th>
      </tr>
      
      <c:if test="${ventas != null}">
      <c:forEach items="${ventas}" var="r">
        <tr>
          <td>${r.cliente}</td>
          <td>${r.categoria}</td>
          <td>${r.producto}</td>
          <td>${r.precio}</td>
          <td>${r.cantidad}</td>
          <td>${r.subtotal}</td>
          <td>${r.impuesto}</td>
          <td>${r.total}</td>
        </tr>
      </c:forEach>
        </c:if>
    </table>
    
    
  </body>
</html>
