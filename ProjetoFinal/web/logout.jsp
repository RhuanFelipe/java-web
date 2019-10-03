<%-- 
    Document   : logout
    Created on : 26/09/2019, 11:11:30
    Author     : rhuan.silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            session.invalidate();
            response.sendRedirect("login.jsp");
        %>
    </body>
</html>
