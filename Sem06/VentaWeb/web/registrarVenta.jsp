<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>REGISTRAR VENTA</title>
  </head>
  <body>
    <h1>REGISTRAR VENTA</h1>
    <fieldset>
      <legend>Datos de la venta</legend>
      <form method="post" action="ProcesarVenta">
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
          </tr>
          <tr>
            <td>Producto:</td>
            <td><input type="text" name="producto"/></td>
          </tr>
          <tr>
            <td>Cliente:</td>
            <td><input type="text" name="cliente"/></td>
          </tr>
          <tr>
            <td>Precio:</td>
            <td><input type="text" name="precio"/></td>
          </tr>
          <tr>
            <td>Cantidad:</td>
            <td><input type="text" name="cantidad"/></td>
          </tr>
          <tr>
            <td colspan="2">
              <input type="submit" value="Procesar"/>
            </td>
          </tr>
        </table>
      </form>
    </fieldset>
    <p style="color:blue;">${mensaje}</p>
    <p style="color:red;">${error}</p>
  </body>
</html>
