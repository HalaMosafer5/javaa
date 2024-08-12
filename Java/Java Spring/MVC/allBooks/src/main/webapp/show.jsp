<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Book Details</title>
</head>
<body>
    <h1>Book Details</h1>
 <h1><c:out value="${book.title}"></c:out></h1>
<p>Description: <c:out value="${book.description}"></c:out></p>
<p>Language: <c:out value="${book.language}"></c:out></p>
<p>Number of Pages: <c:out value="${book.numberOfPages}"></c:out></p>
</body>
</html>