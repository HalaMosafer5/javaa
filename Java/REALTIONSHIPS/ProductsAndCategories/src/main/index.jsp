<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<h1>Home Page</h1>
<p><a href="/products/new">New Product</a></p>
<p><a href="/categories/new">New Category</a></p>
<hr>
<table>
	<thead>
		<tr>
			<td>Products</td>
			<td>Categories</td>
		</tr>
	</thead>
    <tbody>
		<tr>
			<td>
				<ul>
					<c:forEach var="product" items="${products}">
						<li><a href="/products/${product.id}"><c:out value="${product.name}"></c:out></a></li>
					</c:forEach>
				</ul>
			</td>
			<td>
				<ul>
					<c:forEach var="category" items="${categories}">
						<li><a href="/categories/${category.id}"><c:out value="${category.name}"></c:out></a></li>
					</c:forEach>
				</ul>
			</td>
		</tr>
    </tbody>
</table>
</body>
</html>