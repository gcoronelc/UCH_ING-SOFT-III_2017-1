<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CRUD DE CLIENTES</title>
    <link href="<c:url value="/css/estilos.css" />" 
          rel="stylesheet" type="text/css"/>
  </head>
  <body>
    <h1>EUREKA BANK</h1>
    <jsp:include page="menu.jsp" />
    
    <h2>${ accion } CLIENTE</h2>    
    
    <fieldset >
      <legend>Datos</legend>
      <form>
        
        <div>
          <label>Código:</label>
          <span>99999</span>
        </div>
        
        <div>
          <label>Paterno:</label>
          <input type="text" name="paterno">
        </div>
        
        
        
      </form>    
      
      
    </fieldset>
  </body>
</html>
