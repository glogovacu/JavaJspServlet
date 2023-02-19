<%-- 
    Document   : dodajPravnoLice
    Created on : Feb 7, 2023, 3:19:31 PM
    Author     : Uros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Prijava Pravog Lica</h1>
    <c:if test="${success!=null}">
            ${success}
            </c:if>
        <form method="POST">
            <input name="naziv" placeholder="Naziv"></input>
            <input name="sediste" placeholder="Sedsite"></input>
            <input name="imePrezime" placeholder="Ime i Prezime"></input>
            <button type="submit">Dodaj</button>
        </form>
    <a href="./listaLica">Nazad ana listu</a>
    </body>
</html>
