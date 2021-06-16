<%-- 
    Document   : editnote
    Created on : Jun 15, 2021, 1:25:20 AM
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
        <h2>Edit Note</h2>
       <form method="post" action="">
           <label for="title">Title: </label>
           <input type="text" id="title" name="title" value="${note.getTitle()}"><br>
           <label for="contents">Contents: </label>
           <textarea id="contents" name="contents" rows="8" cols="30">${note.getContents()}</textarea><br>
           <input type="submit" value="Save">
        
       </form>
    </body>
</html>
