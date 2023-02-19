<%-- 
    Document   : detaljnijeOServerima
    Created on : Feb 8, 2023, 1:57:23 AM
    Author     : Uros
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Svi zakupljeni Server</h1>
        <h2>Virtuelni Serveri</h2>
            <c:forEach items="${pravnoLice.virtuelniServer}" var="v" varStatus="loop">
  <c:set var="today" value="<%= new Date() %>" /> 
  <c:set var="endDate" value="${v.datumKraja}" />
  <c:if test="${endDate.after(today)}" >
    <p style="color: green;">
  </c:if>
  <c:if test="${!endDate.after(today)}" >
    <p style="color: red;">
  </c:if>
  ${v.procesor/1000+1}Procesora ${v.ram/1000+1}GB ${(v.diskovi/1000+1)*10}GB ${v.bandwidth/1000+1}TB ${v.operativni} ${v.cena}Dinara 
  <fmt:formatDate value="${v.datumPocetka}" pattern="dd-MM-yyyy"/> 
  <fmt:formatDate value="${v.datumKraja}" pattern="dd-MM-yyyy"/>
  </p>
</c:forEach>
  <c:forEach items="${fizickoLice.virtuelniServer}" var="v" varStatus="loop">
  <c:set var="today" value="<%= new Date() %>" /> 
  <c:set var="endDate" value="${v.datumKraja}" />
  <c:if test="${endDate.after(today)}" >
    <p style="color: green;">
  </c:if>
  <c:if test="${!endDate.after(today)}" >
    <p style="color: red;">
  </c:if>
  ${v.procesor/1000+1}Procesora ${v.ram/1000+1}GB ${(v.diskovi/1000+1)*10}GB ${v.bandwidth/1000+1}TB ${v.operativni} ${v.cena}Dinara 
  <fmt:formatDate value="${v.datumPocetka}" pattern="dd-MM-yyyy"/> 
  <fmt:formatDate value="${v.datumKraja}" pattern="dd-MM-yyyy"/>
  </p>
</c:forEach>
                
                
                <h2>Fizicki Serveri</h2>
                <c:forEach items="${fizickoLice.fizickiServer}" var="f" varStatus="loop">
                <p>${f.procesor}Procesora ${f.ram}GB ${f.diskovi}GB ${f.bandwidth}TB ${f.cena}Dinara ${f.datumKupovanja}</p>
                <a href="DodajFizickiServerServlet?idFizickoLice=${fizickoLice.id}"></a>
            </c:forEach>
                <c:forEach items="${pravnoLice.fizickiServer}" var="f" varStatus="loop">
                <p>${f.procesor}Procesora ${f.ram}GB ${f.diskovi}GB ${f.bandwidth}TB ${f.cena}Dinara ${f.datumKupovanja}</p>
                <a href="DodajFizickiServerServlet?idPravnoLice=${pravnoLice.id}"></a>
            </c:forEach>
        
    </body>
</html>
