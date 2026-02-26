<%-- 
    Document   : Notification
    Created on : Feb 23, 2026, 5:23:37 PM
    Author     : Minh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<! DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thong bao</title>
    </head>

    <body>
        <h1>Thông bao! </h1>
        <h3>${requestScope.info}</h3>
        <h3><a href="${requestScope.url}">${requestScope.urltitle}</a></h3>
    </body>
</html>
