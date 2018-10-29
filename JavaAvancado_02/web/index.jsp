<%-- 
    Document   : index.jsp
    Created on : 28/10/2018, 21:07:35
    Author     : nessk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atividade 02 Java Avançado - Tradutor Online</title>
    </head>
    <body>
        <h1>Digite abaixo a palavra que você deseja traduzir</h1>
        <form action="TradutorController" method="GET">
            <input type="text" name="palavra"/>
            <input type="submit" name="traduzir" />
        </form>
    </body>
</html>
