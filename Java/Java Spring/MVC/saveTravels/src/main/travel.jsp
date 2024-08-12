<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Travel List</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <h1>Travel</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Name</th>
                <th>Vendor</th>
                <th>Amount</th>
                <th>Description</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="trvel : ${travel}">
                <td th:text="${travel.name}"></td>
                <td th:text="${travel.vendor}"></td>
                <td th:text="${travel.amount}"></td>
                <td th:text="${travel.description}"></td>
                <td>
                    <a th:href="@{/edit_travel/{id}(id=${travel.id})}">Edit</a> | 
                    <a th:href="@{/delete_travel/{id}(id=${travel.id})}">Delete</a>
                </td>
            </tr>
        </tbody>
    </table>
    <a href="/add_travel">Add New Travel</a>
</body>
</html>