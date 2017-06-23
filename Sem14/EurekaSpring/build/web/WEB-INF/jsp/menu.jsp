<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
  .menuItem{
    margin: 5px;
    padding: 10px 15px;
    display: inline-block;
    float: left;
    background-color: background;
    color: white;
    text-decoration: none;
  }
</style>
<div>
  <a class="cssLinkMenu ${menuGenerales}" href="generales.htm">Generales</a>
  <a class="cssLinkMenu" href="cliente.htm">Cliente</a>
  <a class="cssLinkMenu" href="clientes.htm">Clientes</a>
  <a class="cssLinkMenu  ${menuCuentaClientes}" href="cluentaClientes.htm">Cuentaas x Clientes</a>
   <a class="cssLinkMenu ${crudClientes}" href="crudClientes.htm">CRUD Clientes</a>
</div>
<div style="clear: both;"></div>