<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INICIO DE SESION</title>
    </head>
    <body>
        <h1>INICIO DE SESION</h1>
        <form method="post" action="login.htm">
            <fieldset>
                <legend>Datos de inicio de sesión</legend>
                <div>
                    <label>Usuario:</label>
                    <input type="text" name="usuario" />
                </div>
                <div>
                    <label>Clave:</label>
                    <input type="password" name="clave" />
                </div>
                <div>
                    <input type="submit" value="btnIngresar" />
                </div>
            </fieldset>
        </form>
    </body>
</html>
