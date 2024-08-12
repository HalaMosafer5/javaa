<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Fruity Loops</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        table {
            width: 50%;
            margin: 0 auto;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Fruity Loops</h1>
    <table>
        <thead>
            <tr>
                <th>Fruit Name</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="fruit" items="${fruits}">
                <tr>
                    <td><c:out value="${fruit.name}"/></td>
                    <td>$<c:out value="${fruit.price}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>