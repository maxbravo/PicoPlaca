<%-- 
    Document   : ok
    Created on : Mar 28, 2017, 2:39:40 PM
    Author     : mbravo
--%>

<%@page import="model.*" %>
<%

    Vehicle v1 = (Vehicle)request.getSession().getAttribute("vehicle1");

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vehicular Restriction Information</title>
    </head>
    <body>
        <h1>Your car: <%= v1.getPlate() %> </h1> <br>
        Date: <%= v1.getDate() %> - <%= v1.restriction() %> <br>
        <a href="index.jsp">Back...</a>
    </body>
</html>
