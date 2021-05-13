<%@ page language = "java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" url="http://java.sum.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <head>
    </head>
    <body>
        <% out.println("MyBatis : Hello World"); %>
        <br>
        <c:forEach var"dto" items="${users}">
            ${dto.id} / ${dto.name} <br>
        </c:forEach>
    </body>    
    </html>