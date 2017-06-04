<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${formTitle}</title>
<style>
.error-message {
	color: red;
	font-size: 90%;
	font-style: italic;
}
</style>
</head>
<body>
	<form:form action="saveSmartphone" method="POST"
		modelAttribute="smartphoneForm">
		<form:hidden path="id" />
		<section class="content">
			<div class="row">
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">${formTitle}</h3>
					</div>
					<div class="box-body">
						<div class="form-group">
							<label>Name</label>
							<form:input path="name" name="" type="text" class="form-control"
								placeholder="Enter device's name" />
							<form:errors path="name" class="error-message" />
						</div>
						<div class="form-group">
							<label>Brand</label>
							<form:input path="brand" type="text" class="form-control"
								placeholder="Enter device's brand" />
							<form:errors path="brand" class="error-message" />
						</div>
						<div class="form-group">
							<label>Price</label>
							<form:input path="price" type="text" class="form-control"
								placeholder="Enter device's price" />
							<form:errors path="price" class="error-message" />
						</div>
						<div class="form-group">
							<label>Year</label>
							<form:input path="year" type="text" class="form-control"
								placeholder="Enter year of manufacture" />
							<form:errors path="year" class="error-message" />
						</div>
						<div class="form-group">
							<label>Detail</label>
							<form:input path="detail" type="text" class="form-control"
								placeholder="Enter description" />
							<form:errors path="detail" class="error-message" />
						</div>
						<div class="form-group">
							<label>Image</label>
							<form:input path="image" type="text" class="form-control"
								placeholder="Enter image link" />
							<form:errors path="image" class="error-message" />
						</div>
					</div>
					<div class="box-footer">
						<input type="submit" value="Submit" class="btn btn-primary" />
						&nbsp; &nbsp; <a
							href="${pageContext.request.contextPath}/smartphoneList">Cancel</a>
					</div>
				</div>
			</div>
		</section>
	</form:form>
</body>
</html>