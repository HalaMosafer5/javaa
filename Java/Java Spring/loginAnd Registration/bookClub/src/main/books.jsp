<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>${book.title}</title>
</head>
<body>
    <h2>${book.title} by ${book.author}</h2>
    <p>Posted by ${book.user.name}</p>
    <h3>Here are ${book.user.name}'s thoughts:</h3>
    <p>${book.thoughts}</p>
    <c:if test="${user.id == book.user.id}">
        <form action="${pageContext.request.contextPath}/books/${book.id}/edit" method="get">
            <input type="submit" value="Edit">
        </form>
        <form action="${pageContext.request.contextPath}/books/${book.id}/delete" method="post">
            <input type="submit" value="Delete">
        </form>
    </c:if>
    <a href="${pageContext.request.contextPath}/books">back to the shelves</a>
</body>
</html>