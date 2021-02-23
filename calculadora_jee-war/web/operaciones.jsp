<%-- 
    Document   : operaciones
    Created on : 23/02/2021, 11:11:23 AM
    Author     : salvarez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="get" action="<%= application.getContextPath()%>/calculadora">
            <table border="1">
                <tbody>
                    <tr>
                        <td><span>valor 1</span></td>
                        <td><input size="40" type="text" name="v1"/></td>
                    </tr>
                    <tr>
                        <td><span>valor 2</span></td>
                        <td><input type="text" name="v2"/></td>
                    </tr>    
                    <tr>
                        <td><span>operacion</span></td>
                        <td><input type="text" name="v3"/></td>
                    </tr>
                    <tr>
                        
                        <td colspan="2"><input type="submit" name="guardar" value="Guardar"/></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
