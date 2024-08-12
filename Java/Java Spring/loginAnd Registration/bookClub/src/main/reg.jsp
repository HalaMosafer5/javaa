<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>Register</h2>
    <form action="${pageContext.request.contextPath}/register" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>
        <label for="confirmPw">Confirm Password:</label>
        <input type="password" id="confirmPw" name="confirmPw" required><br>
        <input type="submit" value="Register">
    </form>
    <p>Already have an account? <a href="${pageContext.request.contextPath}/login">Login</a></p>
</body>
</html>

</html>