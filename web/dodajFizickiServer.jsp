<%-- 
    Document   : dodajFizickiServer
    Created on : Feb 7, 2023, 8:25:45 PM
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
        <h1>Fizicki server:</h1>
        <form method="POST">
            <input name="idPravnogLica" value="${pravnoLice.id}"></input>
            <input name="idFizickogLica" value="${fizickoLice.id}"></input>
            Procesor:<input name="procesor" value="1" disabled></input>
            RAM:<input name="ram" value="1" disabled></input>
            Broj diskova:<input name="diskovi" value="1" disabled></input>
            Bandwidth:<input name="bandwidth" value="10" disabled></input>
            Cena:<input name="cena" value="1500" disabled></input>
            <button type="submit">Izaberi</button>
        </form>
        <form method="POST">
            <input name="idPravnogLica" value="${pravnoLice.id}" hidden></input>
            <input name="idFizickogLica" value="${fizickoLice.id}" hidden></input>
            Procesor:<input name="procesor" value="2" disabled></input>
            RAM:<input name="ram" value="2" disabled></input>
            Broj diskova:<input name="diskovi" value="2" disabled></input>
            Bandwidth:<input name="bandwidth" value="20" disabled></input>
            Cena:<input name="cena" value="2700" disabled></input>
            <button type="submit">Izaberi</button>
        </form>
        <form method="POST">
            <input name="idPravnogLica" value="${pravnoLice.id}" hidden></input>
            <input name="idFizickogLica" value="${fizickoLice.id}" hidden></input>
            Procesor:<input name="procesor" value="4" disabled></input>
            RAM:<input name="ram" value="4" disabled></input>
            Broj diskova:<input name="diskovi" value="4" disabled></input>
            Bandwidth:<input name="bandwidth" value="40" disabled></input>
            Cena:<input name="cena" value="5000" disabled></input>
            <button type="submit">Izaberi</button>
        </form>
    </body>
</html>
