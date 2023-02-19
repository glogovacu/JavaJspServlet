<%-- 
    Document   : listaLica
    Created on : Feb 7, 2023, 2:31:47 PM
    Author     : Uros
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Fizicka Lica</h1>
        <c:forEach items="${fizickoLice}" var="f" varStatus="loop">
            <div>${loop.index+1} ${f.ime} ${f.prezime} ${f.adresa}
                <a href="./DodajFizickiServerServlet?idFizickoLice=${f.id}"> Dodaj Fizicki Server</a>
                <a href="./DodajVirtuelniServerServlet?idFizickoLice=${f.id}"> Dodaj Virtuelni Server</a>
                <a href="./DetaljnijeOServerimaServlet?idFizickoLice=${f.id}">Detaljnije o serverima</a>

            </div>
                
        </c:forEach>
    <a href="./DodajFizickoLServlet">Dodaj fizicko lice</a>
    <h1>Pravna Lica</h1>
    <c:forEach items="${pravnoLice}" var="p" varStatus="loop">
            <div>${loop.index+1} ${p.naziv} ${p.sediste} ${p.imePrezime} 
                <a href="./DodajFizickiServerServlet?idPravnoLice=${p.id}"> Dodaj Fizicki Server</a>
                <a href="./DodajVirtuelniServerServlet?idPravnoLice=${p.id}"> Dodaj Virtuelni Server</a>
                <a href="./DetaljnijeOServerimaServlet?idPravnoLice=${p.id}">Detaljnije o serverima</a>

            </div>
                
        </c:forEach>
    <a href="./DodajPravnoLice">Dodaj pravno lice</a>
    
    </body>
</html>
