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
        <title>Simple Note Keeper</title>
    </head>
    <body>
        
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <h4 style="display:inline">Title:  </h4>
        <p style="display:inline">${note.getTitle()}</p> 
        <h4>Contents: </h4>
        <p>${note.getContents()}</p>
        <a href="note?edit">Edit</a>
       
    </body>
</html>
