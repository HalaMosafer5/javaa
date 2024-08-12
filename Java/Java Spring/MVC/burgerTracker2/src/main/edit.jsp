<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Burger</title>
</head>
<body>
 <h2>Edit a Burger:</h2>
      <form:form modelAttribute="burger" action="/edit/${burger.id}" method="put">
       <form:errors path="*" cssClass="error" />
        <p>
            Burger Name: <form:input path="name" />
            <form:errors path="name" cssClass="error" />
        </p>
        <p>
            Restaurant Name: <form:input path="restaurant" />
            <form:errors path="restaurant" cssClass="error" />
        </p>
        <p>
            Rating: <form:input path="rating" />
            <form:errors path="rating" cssClass="error" />
        </p>
        <p>
            Notes: <form:textarea path="notes" />
            <form:errors path="notes" cssClass="error" />
        </p>
        <p>
            <input type="submit" value="Submit" />
        </p>
    </form:form>
</body>
</html>