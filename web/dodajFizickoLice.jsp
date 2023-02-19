<%-- 
    Document   : dodajFizickoLice
    Created on : Feb 7, 2023, 3:19:40 PM
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
        <h1>Prijava Fizickog Lica</h1>
        <c:if test="${success!=null}">
            ${success}
            </c:if>
        <form method="POST">
            <input name="ime" placeholder="Ime"></input>
            <input name="prezime" placeholder="Prezime"></input>
            <input name="adresa" placeholder="Adresa"></input>
            <button type="submit">Dodaj</button>
        </form>
    </body>
</html>
