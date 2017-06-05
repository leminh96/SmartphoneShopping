<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/dataTables.bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/AdminLTE.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/_all-skins.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/style.css">
<!-- jQuery 2.2.3-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<!-- DataTables-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/dataTables.bootstrap.min.js"></script>
<!-- SlimScroll-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.slimscroll.min.js"></script>
<!-- FastClick-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/fastclick.js"></script>
<!-- AdminLTE App-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/app.min.js"></script>
<!-- AdminLTE for demo purposes-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/demo.js"></script>
<!-- page script-->
<script>
	$(function() {
		$("#example1").DataTable();
		$('#example2').DataTable({
			"paging" : true,
			"lengthChange" : false,
			"searching" : false,
			"ordering" : true,
			"info" : true,
			"autoWidth" : false
		});
	});
</script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
		<header class="main-header"> <tiles:insertAttribute
			name="header" /> </header>

		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar"> <tiles:insertAttribute
			name="menu" /> </aside>

		<div class="content-wrapper">
			<tiles:insertAttribute name="body" />
		</div>

		<footer class="main-footer"> <tiles:insertAttribute
			name="footer" /> </footer>
	</div>

</body>
</html>