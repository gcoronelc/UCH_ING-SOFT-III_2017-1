<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CRUD DE CLIENTES</title>
    <link href='<c:url value="/css/estilos.css" />' 
          rel="stylesheet" type="text/css"/>
    <script src='<c:url value="/jquery/jquery.min.js" />'></script>
  </head>
  <body>
    <h1>EUREKA BANK</h1>
    <jsp:include page="menu.jsp" />

    <h2>CRUD DE CLIENTES</h2>

    <fieldset>
      <legend>Panel de Control</legend>
      <form id="form1">
        <div>

          <div class="form-field">
            <label>Paterno:</label>
            <input type="text" name="paterno"
                   id="paterno"
                   value="${bean.paterno}"/>
          </div>

          <div class="form-field">
            <label>Materno:</label>
            <input type="text" name="materno" 
                   id="materno"
                   value="${bean.materno}"/>
          </div>

          <div class="form-field">
            <label>Nombre:</label>
            <input type="text" name="nombre" 
                   id="nombre"
                   value="${bean.nombre}"/>
          </div>

          <div class="form-field">

            <input style="margin:10px 5px 0 5px; padding: 5px;"
                   type="button" 
                   id="btnBuscar"
                   name="btnBuscar" 
                   value="Buscar" />

            <input style="margin-top:10px 5px 0 5px; padding: 5px;"
                   type="button" 
                   id="btnNuevo"
                   name="btnBuscar" 
                   value="Nuevo" />

          </div>




        </div>
      </form>
    </fieldset>

    <div id="divResultado">
    </div>

    <script>

      $("#paterno").keyup(fnBuscar);
      $("#materno").keyup(fnBuscar);
      $("#nombre").keyup(fnBuscar);
      $("#btnBuscar").click(fnBuscar);
      
      function fnBuscar(){
        
        var data = $("#form1").serialize();
        
        $("#divResultado").load( "crudClientesConsultar.htm", data )

      }
      
      $("#btnNuevo").click(function(){
        window.location = "crudClientesNuevo.htm";
      });
      

    </script>

  </body>
</html>
