<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${formTitle}</title>
</head>
<body>
	<form:form action="loadUser" method="GET"
		modelAttribute="userForm">
		<section class="content">
			<div class="row">
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">${formTitle}</h3>
					</div>
					<div class="box-body">
						<div class="form-group">
							<label>Full Name</label>
							<form:input path="name" name="" type="text" class="form-control"/>
						</div>
						<div class="form-group">
							<label>Address</label>
							<form:input path="address" type="text" class="form-control" />							
						</div>
						<div class="form-group">
							<label>Birthday</label>
							<form:input path="birthday" type="text" class="form-control"/>							
						</div>
						<div class="form-group">
							<label>Sex</label>
							<form:input path="sex" type="text" class="form-control"/>							
						</div>
						<div class="form-group">
							<label>Email</label>
							<form:input path="email" type="text" class="form-control"/>							
						</div>
						<div class="form-group">
							<label>Phone</label>
							<form:input path="phone" type="text" class="form-control"/>							
						</div>
					</div>
				</div>
			</div>
		</section>
	</form:form>
</body>
</html>