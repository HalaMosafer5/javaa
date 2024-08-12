<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Details</title>
</head>
<body>
    <h1>Book Details</h1>
    <c:if test="${not empty book}">
        <p><strong>Title:</strong> ${book.title}</p>
        <p><strong>Author:</strong> ${book.author}</p>
        <p><strong>ISBN:</strong> ${book.isbn}</p>
        <p><strong>Published Date:</strong> ${book.publishedDate}</p>
        <p><strong>Description:</strong> ${book.description}</p>
    </c:if>
    <c:if test="${empty book}">
        <p>Book not found.</p>
    </c:if>
</body>
</html>