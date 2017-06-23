<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='<c:url value="/css/estilos.css" />' 
              rel="stylesheet" type="text/css"/>
        <title>CONSULTAR CLIENTE</title>
    </head>
    <body>
        <h1>CONSULTAR CLIENTE</h1>
        <jsp:include page="menu.jsp" />
        <fieldset>
            <legend>Critero de busqueda</legend>
            <form method="post" action="cliente.htm">
                <label>Código de cliente:</label>
                <input type="text" name="codigo" />
                <input type="submit" value="Procesr"/>
            </form>
        </fieldset>

        <div>
            <h2>RESULTADO</h2>
            <fieldset>
                <legend>DATOS DEL CLIENTE</legend>
                <div>
                    <label>Código:</label>
                    <strong>${bean.codigo}</strong>
                </div>
                <div>
                    <label>Paterno:</label>
                    <strong>${bean.paterno}</strong>
                </div>
                <div>
                    <label>Materno:</label>
                    <strong>${bean.materno}</strong>
                </div>
                <div>
                    <label>Nombre:</label>
                    <strong>${bean.nombre}</strong>
                </div>

            </fieldset>
        </div>
    </body>
</html>
