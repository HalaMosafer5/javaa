<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Languages</title>
</head>
<body>
    <h1>Languages</h1>
    <form action="/languages" method="post">
        <label>Name:</label>
        <input type="text" name="name" required minlength="2" maxlength="20"><br>
        <label>Creator:</label>
        <input type="text" name="creator" required minlength="2" maxlength="20"><br>
        <label>Version:</label>
        <input type="text" name="version" required><br>
        <input type="submit" value="Submit">
    </form>
    <table>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${languages}" var="language">
            <tr>
                <td><a href="/languages/${language.id}">${language.name}</a></td>
                <td>${language.creator}</td>
                <td>${language.version}</td>
                <td>
                    <a href="/languages/${language.id}/edit">Edit</a>
                    <form action="/languages/${language.id}/delete" method="post" style="display:inline;">
                        <button type="submit">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>