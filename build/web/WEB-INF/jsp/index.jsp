<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account List</title>
    </head>

    <body>
        <h1>Acount Management</h1>
        <a href="show-add-account"></a>
        <table>
            <tr>
                <td>ID</td>
                <td>UserName</td>
                <td>Password</td>
                <td>FullName</td>
                <td>Address</td>
                
            </tr>
            <c:forEach var="item" items="${accounts}">
                <c:url var="updateLink" value= "show-update-account">
                    <c:param name="accountId" value="${item.id}"/>
                        
                </c:url>
                 <c:url var="deleteLink" value= "delete-account">
                    <c:param name="accountId" value="${item.id}"/>
                        
                </c:url>
                <tr>
                    <td>${item.id}</td>
                    <td>${item.username}</td>
                    <td>${item.passowrd}</td>
                    <td>${item.fullname}</td>
                    <td>${item.address}</td>
                </tr>
        </table>
    </body>
</html>
