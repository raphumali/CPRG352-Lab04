<%-- 
    Document   : viewnote
    Created on : Jun 15, 2021, 1:25:32 AM
    Author     : 786097
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2>View Note</h2>
        <h4>Title: </h4>
        <h4>Contents: ${note.getTitle()}</h4>
    </body>
</html>
