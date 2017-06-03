<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Smartphone List</title>
<style>
table {
	margin-top: 10px;
	border: solid black 1px;
}

table  td {
	padding: 5px;
}

.message {
	font-size: 90%;
	color: blue;
	font-style: italic;
	margin-top: 30px;
}
</style>
</head>
<body>
	<br />
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Brand</th>
			<th>Price</th>
			<th>Year</th>
			<th>Detail</th>
		</tr>
		<c:forEach items="${smartphoneInfos}" var="info">

			<tr>
				<td>${info.name}</td>
				<td>${info.brand}</td>
				<td>${info.price}</td>
				<td>${info.year}</td>
				<td>${info.detail}</td>
			</tr>

		</c:forEach>
	</table>
	<c:if test="${not empty message}">

		<div class="message">${message}</div>
	</c:if>

</body>
</html>