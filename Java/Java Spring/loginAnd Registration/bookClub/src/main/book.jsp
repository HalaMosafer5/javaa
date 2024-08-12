<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add a Book</title>
</head>
<body>
    <h2>Add a Book to Your Shelf</h2>
    <form action="${pageContext.request.contextPath}/books" method="post">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" required><br>
        <label for="author">Author:</label>
        <input type="text" id="author" name="author" required><br>
        <label for="thoughts">My thoughts:</label>
        <textarea id="thoughts" name="thoughts" required></textarea><br>
        <input type="submit" value="Submit">
    </form>
    <a href="${pageContext.request.contextPath}/books">back to the shelves</a>
</body>
</html>