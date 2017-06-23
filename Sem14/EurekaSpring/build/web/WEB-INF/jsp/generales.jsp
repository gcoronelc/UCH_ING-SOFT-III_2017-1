<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='<c:url value="/css/estilos.css" />' 
              rel="stylesheet" type="text/css"/>
        <title>CONSULTAS GENERALES</title>
    </head>

    <body>
        <h1>CONSULTAS GENERALES</h1>

        <jsp:include page="menu.jsp" />

        <p>Cantidad de cuentas: ${cantCuentas}</p>
        <p>Saldo en Soles: ${saldoSoles}</p>
        <p>Saldo en Dolares: ${saldoDolares}</p>

    </body>
</html>
