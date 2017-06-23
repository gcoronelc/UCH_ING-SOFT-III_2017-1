<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CRUD DE CLIENTES</title>
    <link href='<c:url value="/css/estilos.css" />' 
          rel="stylesheet" type="text/css"/>
    <style>
      label{
        width: 100px;
        display: inline-block;  
      }
    </style>
  </head>
  <body>
    <h1>EUREKA BANK</h1>
    <jsp:include page="menu.jsp" />

    <h2>${ accion } CLIENTE</h2>    

    <form method="post" action="crudClientesGrabar.htm">
      
      <input type="hidden" name="codigo" value="${bean.codigo}"/>
      <input type="hidden" name="accion" value="${accion}"/>

      <fieldset >
        <legend>Datos</legend>
        <form>

          <div>
            <label>Código:</label>
            <span>${bean.codigo}</span>
          </div>

          <div>
            <label>Paterno:</label>
            <input type="text" name="paterno" 
                   size="50"
                   ${disabled}
                   value="${bean.paterno}">
          </div>

          <div>
            <label>Materno:</label>
            <input type="text" name="materno"
                   size="50"
                   ${disabled}
                   value="${bean.materno}">
          </div>

          <div>
            <label>Nombre:</label>
            <input type="text" name="nombre" 
                   size="50"
                   ${disabled}
                   value="${bean.nombre}">
          </div>

          <div>
            <label>DNI:</label>
            <input type="text" name="dni" 
                   size="50"
                   ${disabled}
                   value="${bean.dni}">
          </div>

          <div>
            <label>Ciudad:</label>
            <input type="text" name="ciudad" 
                   size="50"
                   ${disabled}
                   value="${bean.ciudad}">
          </div>

          <div>
            <label>Dirección:</label>
            <input type="text" name="direccion" 
                   size="50"
                   ${disabled}
                   value="${bean.direccion}">
          </div>

          <div>
            <label>Teléfono:</label>
            <input type="text" name="telefono" 
                   size="50"
                   ${disabled}
                   value="${bean.telefono}">
          </div>

          <div>
            <label>Email:</label>
            <input type="text" name="email" 
                   size="50"
                   ${disabled}
                   value="${bean.email}">
          </div>

          <div>
            <input type="submit" 
                   class="btnMain"
                   value="Procesar">
          </div>

      </fieldset>

    </form>


  </body>
</html>
