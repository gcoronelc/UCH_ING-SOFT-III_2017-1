<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
