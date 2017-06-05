<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<section class="content">
	<div class="row">
		<div class="col-xs-12">
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">List Products</h3>
				</div>
				<div class="box-body">
					<form:form action="multiDelete" method="POST">
						<table id="example1" class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>Select</th>
									<th>Name</th>
									<th>Brand</th>
									<th>Price</th>
									<th>Year</th>
									<th>Detail</th>
									<th>Edit</th>
									<th>Delete</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${smartphoneInfos}" var="info">
									<tr>
										<td><input type=checkbox name="id"
											value="${info.id}" /></td>
										<td>${info.name}</td>
										<td>${info.brand}</td>
										<td>${info.price}</td>
										<td>${info.year}</td>
										<td>${info.detail}</td>
										<td><a href="deleteSmartphone?id=${info.id}">Delete</a></td>
										<td><a href="editSmartphone?id=${info.id}">Edit</a></td>
									</tr>
								</c:forEach>
							</tbody>
							<tfoot>
								<tr>
									<th>Select</th>
									<th>Name</th>
									<th>Brand</th>
									<th>Price</th>
									<th>Year</th>
									<th>Detail</th>
									<th>Edit</th>
									<th>Delete</th>
								</tr>
							</tfoot>
						</table>
						<input type="submit" class="btn btn-danger"
							value="Multiple Delete" />
					</form:form>
				</div>
			</div>
		</div>
	</div>
</section>