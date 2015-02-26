<%-- 
    Document   : home
    Created on : Feb 25, 2015, 10:25:03 PM
    Author     : a
--%>

<%@page import="java.util.List"%>
<%@page import="database.model.Games"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="login" method="POST">
            <input type="textbox" required="" name="uname" placeholder="Username">
            <input type="password" required="" name="upassword">
            <input type="submit" value="Login">
        </form> 
         <%
            List<Games> gl = (List<Games>)request.getSession().getAttribute("featuredgamelist");
            for(int i = 0 ; i<gl.size();i++){
            
            out.print(gl.get(i).getName());
            
            }
           
        %>
    </body>
</html>
