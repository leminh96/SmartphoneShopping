<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<section class="sidebar">
	<div class="user-panel">
		<div class="pull-left image">
			<img src="${pageContext.request.contextPath}/img/leminh.jpg" class="img-circle"
				alt="User Image">
		</div>
		<div class="pull-left info">
			<p>Admin 1412320</p>
			<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
		</div>
	</div>
	<!-- search form -->
	<form action="#" method="get" class="sidebar-form">
		<div class="input-group">
			<input type="text" name="q" class="form-control"
				placeholder="Search..."> <span class="input-group-btn">
				<button type="button" name="search" id="search-btn"
					class="btn btn-flat">
					<i class="fa fa-search"></i>
				</button>
			</span>
		</div>
	</form>
	<ul class="sidebar-menu">
		<li class="header">MAIN NAVIGATION</li>
		<li class="treeview">
		<a href="${pageContext.request.contextPath}/userInfo?username=${buget.userName}"> <i class="fa fa-dashboard"></i>
				<span>User Infomation</span>
		</a></li>
		
		<li class="treeview">
          <a href="#">
            <i class="fa fa-edit"></i> <span>Products</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="${pageContext.request.contextPath}/admin"><i class="fa fa-circle-o"></i> Products List</a></li>
            <li><a href="${pageContext.request.contextPath}/createSmartphone"><i class="fa fa-circle-o"></i> Add new product</a></li>
          </ul>
        </li>
	</ul>
</section>