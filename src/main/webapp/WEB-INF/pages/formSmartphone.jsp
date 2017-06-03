<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Smartphone</title>
<style>
.error-message {
	color: red;
	font-size: 90%;
	font-style: italic;
}
</style>
</head>
<body>
	<h3>${formTitle}</h3>
	<form:form action="saveSmartphone" method="POST"
		modelAttribute="smartphoneForm">
		<form:hidden path="id" />
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" name="" /></td>
				<td><form:errors path="name" class="error-message" /></td>
			</tr>
			<tr>
				<td>Brand</td>
				<td><form:input path="brand" /></td>
				<td><form:errors path="brand" class="error-message" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><form:input path="price" /></td>
				<td><form:errors path="price" class="error-message" /></td>
			</tr>
			<tr>
				<td>Year</td>
				<td><form:input path="year" /></td>
				<td><form:errors path="year" class="error-message" /></td>
			</tr>

			<tr>
				<td>Detail</td>
				<td><form:input path="detail" /></td>
				<td><form:errors path="detail" class="error-message" /></td>
			</tr>

			<tr>
				<td>Image</td>
				<td><form:input path="image" /></td>
				<td><form:errors path="image" class="error-message" /></td>
			</tr>

			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Submit" /> <a
					href="${pageContext.request.contextPath}/smartphoneList">Cancel</a>
				</td>
				<td>&nbsp;</td>
			</tr>
		</table>
	</form:form>
</body>
</html>