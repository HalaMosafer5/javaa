<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>New Ninja</title>
</head>
<body>
<h1>New Ninja</h1>
<form action="#" th:action="@{/ninjas/new}" th:object="${ninja}" method="post">
    <p>Dojo:
        <select th:field="*{dojo}">
            <option th:each="dojo : ${dojos}" th:value="${dojo}" th:text="${dojo.name}"></option>
        </select>
    </p>
    <p>First Name: <input type="text" th:field="*{firstName}" /></p>
    <p>Last Name: <input type="text" th:field="*{lastName}" /></p>
    <p>Age: <input type="number" th:field="*{age}" /></p>
    <p><input type="submit" value="Create" /></p>
</form>
</body>
</html>