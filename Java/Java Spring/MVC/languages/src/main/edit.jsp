<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit ${language.name}</title>
</head>
<body>
    <h1>Edit ${language.name}</h1>
    <form action="/languages/${language.id}" method="post">
        <label>Name:</label>
        <input type="text" name="name" value="${language.name}" required minlength="2" maxlength="20"><br>
        <label>Creator:</label>
        <input type="text" name="creator" value="${language.creator}" required minlength="2" maxlength="20"><br>
        <label>Version:</label>
        <input type="text" name="version" value="${language.version}" required><br>
        <input type="submit" value="Submit">
    </form>
    <a href="/languages">Back to Dashboard</a>
</body>
</html>