<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>VENTA</h1>
    <p>Precio: ${model.precio}</p>
    <p>Cantidad: ${model.cant}</p>
    <p>Importe: ${model.importe}</p>
    <p>Impuesto: ${model.impuesto}</p>
    <p>Total: ${model.total}</p>
    <a href="index.html">Retornar</a>
  </body>
</html>
