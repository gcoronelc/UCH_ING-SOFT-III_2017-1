<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='<c:url value="/css/estilos.css" />' 
              rel="stylesheet" type="text/css"/>
        <title>CONSULTAR CLIENTES</title>
    </head>
    <body>
        <h1>CONSULTAR CLIENTES</h1>
        <jsp:include page="menu.jsp" />

        <fieldset>
            <legend>Critero de busqueda</legend>
            <form method="post" action="clientes.htm">
                <label>Paterno, Materno o Nombre:</label>
                <input type="text" 
                       name="criterio"
                       value="${criterio}"/>
                <input type="submit" value="Procesr"/>
            </form>
        </fieldset>

        <div>
            <h2>RESULTADO</h2>
            <fieldset>
                <legend>DATOS DEL CLIENTE</legend>
                <table border="1">

                    <thead>
                        <tr>
                            <th>CODIGO</th>
                            <th>PATERNO</th>
                            <th>MATERNO</th>
                            <th>NOMBRE</th>
                        </tr>
                    </thead>

                    <tbody>

                        <c:forEach items="${lista}" var="r">

                            <tr>
                                <td>${r.codigo}</td>
                                <td>${r.paterno}</td>
                                <td>${r.materno}</td>
                                <td>${r.nombre}</td>
                            </tr>

                        </c:forEach>

                    </tbody>

                </table>

            </fieldset>
        </div>
    </body>
</html>
