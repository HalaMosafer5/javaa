<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Edit Travel</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <h1>Edit Travel</h1>
    <form th:action="@{/edit_travel/{id}(id=${travel.id})}" method="post" th:object="${travel}">
        <div>
            <label for="name">Name:</label>
            <input type="text" id="name" th:field="*{name}" required>
        </div>
        <div>
            <label for="vendor">Vendor:</label>
            <input type="text" id="vendor" th:field="*{vendor}" required>
        </div>
        <div>
            <label for="amount">Amount:</label>
            <input type="number" id="amount" th:field="*{amount}" required>
        </div>
        <div>
            <label for="description">Description:</label>
            <textarea id="description" th:field="*{description}" required></textarea>
        </div>
        <button type="submit">Save Changes</button>
    </form>
</body>
</html>