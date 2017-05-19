<%-- 
    Document   : login
    Created on : 11-may-2017, 12:35:20
    Author     : sac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="get" action="AuthenticationServlet">
            <table border="1">
                <tr>
                    <td>
                        <p>usuario: </p> 
                    </td>
                    <td>
                        <input type="text" name="user">
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>contraseña: </p>
                    </td>
                    <td>
                        <input type="password" name="password" >
                    </td>
                </tr>
                <tr>
                    <td rowspan="2">
                        <input type="submit" value = "Procesar">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
