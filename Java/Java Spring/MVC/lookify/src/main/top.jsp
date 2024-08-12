<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Top Ten Songs</title>
</head>
<body>
    <h1>Top Ten Songs</h1>
    <a href="/dashboard">Dashboard</a>
    <table>
        <thead>
            <tr>
                <th>Rating</th>
                <th>Name</th>
                <th>Artist</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="song : ${songs}">
                <td th:text="${song.rating}">Rating</td>
                <td><a th:href="@{/songs/{id}(id=${song.id})}" th:text="${song.title}">Title</a></td>
                <td th:text="${song.artist}">Artist</td>
            </tr>
        </tbody>
    </table>
</body>
</html>