<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet prefetch" href="https://fonts.googleapis.com/css?family=Open+Sans:600">
<link rel="stylesheet" href="../css/loginstyle.css">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<c:if test="${param.error == 'true'}">
		<div style="color: red; margin: 10px 0px;">
			Login Failed!!!<br /> Reason :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
	<h3>Enter user name and password:</h3>
	<form name='f'
		action="${pageContext.request.contextPath}/j_spring_security_check"
		method='POST'>
		<div class="login-wrap">
			<div class="login-html">
				<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
					for="tab-1" class="tab">Sign In</label> <input id="tab-2"
					type="radio" name="tab" class="sign-up"><label for="tab-2"
					class="tab"></label>
				<div class="login-form">
					<div class="sign-in-htm">
						<div class="group">
							<label for="user" class="label">Username</label> <input id="user"
								type="text" class="input" name="username">
						</div>
						<div class="group">
							<label for="pass" class="label">Password</label> <input id="pass"
								type="password" class="input" data-type="password"
								name="password">
						</div>
						<div class="group">
							<input id="check" type="checkbox" class="check" checked>
							<label for="check"><span class="icon"></span> Keep me
								Signed in</label>
						</div>
						<div class="group">
							<input type="submit" class="button" value="Sign In">
						</div>
						<div class="hr"></div>
						<div class="foot-lnk">
							<a href="#forgot">Forgot Password?</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>