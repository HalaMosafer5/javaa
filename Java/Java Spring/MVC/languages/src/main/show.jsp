<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>${language.name}</title>
</head>
<body>
    <h1>${language.name}</h1>
    <p>Creator: ${language.creator}</p>
    <p>Version: ${language.version}</p>
    <a href="/languages/${language.id}/edit">Edit</a>
    <form action="/languages/${language.id}/delete" method="post">
        <button type="submit">Delete</button>
    </form>
    <br>
    <a href="/languages">Back to Dashboard</a>
</body>
</html>