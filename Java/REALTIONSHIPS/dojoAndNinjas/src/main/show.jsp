<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Dojo Page</title>
</head>
<body>
<h1 th:text="${dojo.name} + ' Location Ninjas'">Dojo Ninjas</h1>
<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
    </tr>
    <tr th:each="ninja : ${dojo.ninjas}">
        <td th:text="${ninja.firstName}">First Name</td>
        <td th:text="${ninja.lastName}">Last Name</td>
        <td th:text="${ninja.age}">Age</td>
    </tr>
</table>
</body>
</html>