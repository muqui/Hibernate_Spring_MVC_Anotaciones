<%-- 
    Document   : home
    Created on : 14/06/2018, 09:07:39 PM
    Author     : mq12
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form action="home" method="POST" commandName="person">
            <p> <form:label path="name">Nombre </form:label> </p>
            <form:input path="name"></form:input>
             <p> <form:label path="country">Correo </form:label> </p>
            <form:input path="country"></form:input>
            
            <hr>
            <form:button >Enviar</form:button>
            
        </form:form>
    </body>
</html>
