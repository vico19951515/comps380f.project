<%-- 
    Document   : home
    Created on : 2017年3月10日, 下午05:55:17
    Author     : wai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false"%>
<html>
    <body>
        <h1>Title : ${title}</h1>
        <h1>Message : ${message}</h1>
        <a href="<c:url value="/register"/>">Register</a>
 
    </body>
</html>
