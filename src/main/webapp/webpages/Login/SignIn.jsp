<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
<link rel="stylesheet" href="css/SignUp.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
	crossorigin="anonymous"></script>
<link
	href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>
<script
	src='https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js'></script>
<script
	src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>

</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>
	<div class="container-fluid">
		<div class="row no-gutter">
			<!-- The image half -->
			<div class="col-md-6 d-none d-md-flex bg-image"></div>


			<!-- The content half -->
			<div class="col-md-6 bg-light">
				<div class="login d-flex align-items-center py-5">

					<!-- Demo content-->
					<div class="container">
						<div class="row">
							<div class="col-lg-10 col-xl-7 mx-auto">
								<h1 class="display-4">Login</h1><br/><br/>
								<f:form action="dashboard" method="post" class="box"
									modelAttribute="login">
									<div class="form-group mb-3">
										<f:input id="inputEmail" type="email"
											placeholder="Email address" required="true" autofocus=""
											class="form-control rounded-pill border-0 shadow-sm px-4"
											path="email" />
									</div>
									<div class="form-group mb-3">
										<f:input id="inputPassword" type="password"
											placeholder="Password" required="true"
											class=" form-control
											rounded-pill border-0 shadow-sm px-4
											text-primary"
											path="password" />
										<f:hidden path="loginId" />
									</div>
									<button type="submit"
										class="btn btn-primary btn-block text-uppercase mb-2 rounded-pill shadow-sm">Sign
										in</button>
								</f:form><br/><br/>
								<div style="text-align:center">Don't have Account??<a href="signUpOptions">Sign Up</a></div>
							</div>
						</div>
					</div>
					<!-- End -->

				</div>
			</div>
			<!-- End -->

		</div>
	</div>

</body>
</html>