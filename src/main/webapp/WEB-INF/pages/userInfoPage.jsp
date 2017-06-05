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
	<section class="content">
		<div class="row">
			<div class="box box-primary">
				<div class="box-header with-border">
					<h3 class="box-title">${formTitle}</h3>
				</div>
				<div class="box-body">
					<div class="form-group">
						<label>Full Name</label> <input type="text" class="form-control"
							value="${buget.name}" readonly/>
					</div>
					<div class="form-group">
						<label>Address</label> <input type="text" class="form-control"
							value="${buget.address}" readonly/>
					</div>
					<div class="form-group">
						<label>Birthday</label> <input type="text" class="form-control"
							value="${buget.birthday}" readonly/>
					</div>
					<div class="form-group">
						<label>Sex</label> <input type="text" class="form-control"
							value="${buget.sex}" readonly/>
					</div>
					<div class="form-group">
						<label>Email</label> <input type="text" class="form-control"
							value="${buget.email}" readonly/>
					</div>
					<div class="form-group">
						<label>Phone</label> <input type="text" class="form-control"
							value="${buget.phone}" readonly/>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>