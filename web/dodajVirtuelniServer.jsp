<%-- 
    Document   : dodajVirtuelniServer
    Created on : Feb 7, 2023, 10:18:14 PM
    Author     : Uros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script >document.addEventListener("DOMContentLoaded", function() {
  const form = document.querySelector('form');
  const cenaDiv = document.querySelector('#cena');
  let cenaInput = document.querySelector('input[name="cenaInput"]');

  form.addEventListener('change', (event) => {
    let cena = 0;
    for (const input of form.elements) {
      if (input.type === 'radio' && input.checked) {
        cena += parseInt(input.value, 10);
      }
    }
    cenaDiv.innerHTML = cena;
    cenaInput.value = cena;
  });
});</script>
    </head>
    <body>
        <h1>Virtuelni Server</h1>
        <form method="POST">
            <input name="idPravnogLica" value="${pravnoLice.id}">
            <input name="idFizickogLica" value="${fizickoLice.id}">
            <h2>Nacin Placanja</h2>
            <input type="radio" id="pl1" name="meseci" value="700" checked>
            <label for="pl1">Mesecno</label>
            <input type="radio" id="pl2" name="meseci" value="3700">
            <label for="pl2">Na 6 meseci</label>
            <input type="radio" id="pl3" name="meseci" value="6700">
            <label for="pl3">Godisnje</label>
            <br>
            <h2>Procesori</h2>
            <input type="radio" id="p1" name="procesor" value="0" checked>
            <label for="p1">1 Procesor</label>
            <input type="radio" id="p2" name="procesor" value="1000">
            <label for="p2">2 Procesora</label>
            <input type="radio" id="p3" name="procesor" value="3000">
            <label for="p3">4 Procesora</label>
            <br>
            <h2>Ram</h2>
            <input type="radio" id="r1" name="ram" value="0" checked>
            <label for="r1">1 GB</label>
            <input type="radio" id="r2" name="ram" value="1000">
            <label for="r2">2 GB</label>
            <input type="radio" id="r3" name="ram" value="3000">
            <label for="r3">4 GB</label>
            <br>
            <h2>Diskovi</h2>
            <input type="radio" id="d1" name="diskovi" value="0" checked>
            <label for="d1">10 GB</label>
            <input type="radio" id="d2" name="diskovi" value="1000">
            <label for="d2">20 GB</label>
            <input type="radio" id="d3" name="diskovi" value="3000">
            <label for="d3">40 GB</label>
            <br>
            <h2>Bandwidth</h2>
            <input type="radio" id="b1" name="bandwidth" value="0" checked>
            <label for="b1">1 TB</label>
            <input type="radio" id="p2" name="bandwidth" value="1000">
            <label for="b2">2 TB</label>
            <input type="radio" id="b3" name="bandwidth" value="3000">
            <label for="b3">4 TB</label>
            <br>
            <h2>Operativni Sistem</h2>
            <select name="operativi">
                <option value="ubuntu" selected>Ubuntu</option>
                <option value="windows">Windows</option>
            </select>
            <br>
            <input name="cenaInput" value="700">
            <button type="submit">Potvrdi</button>
            <br>
            
            </form> 
            <div id="cena" name="cena">700</div> Dinara
            
    </body>
</html>
