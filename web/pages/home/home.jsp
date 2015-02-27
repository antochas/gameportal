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
        <LINK REL="stylesheet" type="text/css" href="./mainCSS.css"/>
        <title>Game Portal</title>
    </head>
    <body>
        <DIV ID="customBG">
        <TABLE ALIGN="LEFT">
            <TR>
                <TD>
                    <IMG SRC="./Graphics/gameLogo.png" WIDTH="200" HEIGHT="50"/>
                    <IMG SRC="./Graphics/portalLogo.png" WIDTH="200" HEIGHT="50"/>
                </TD>
            </TR>
        </TABLE>
        <TABLE ID="signUser">
            <form action="login" method="POST">
                <TR>
                    <TD>
                        <input ID="inputStyling" type="textbox" name="uname" placeholder="Username" required/>
                    </TD>
                </TR>
                <TR>
                    <TD>
                        <input ID="inputStyling" type="password" name="upassword" placeholder="Password" required/>
                    </TD>
                </TR>
                <TR>
                    <TD ALIGN="CENTER">
                        <input ID="buttonStyling" type="submit" value="Login">
                    </TD>
                </TR>
            </form>
        </TABLE>
        </DIV>
        <DIV ID="customBody" HEIGHT="500">
        <TABLE ALIGN="CENTER">
        <%
            List<Games> gl = (List<Games>)request.getSession().getAttribute("featuredgamelist");
            for(int i = 0 ; i<gl.size();i++)
            {
                out.print("<TR><TD>" + gl.get(i).getName() + "</TD></TR>");
            }
        %>
        </TABLE>
        </DIV>
    </body>
</html>
