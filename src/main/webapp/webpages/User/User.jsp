<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
<link rel="stylesheet" href="css/L&R.css">
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
<body class="body-background">
	<div class="row">
		<div class="col-md-6 mx-auto p-0">
			<div class="card">
				<div class="login-box">
					<div class="login-snip">
						<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
							for="tab-1" class="tab">Login</label> <input id="tab-2"
							type="radio" name="tab" class="sign-up"><label
							for="tab-2" class="tab">Sign Up</label>
						<div class="login-space">
							<div class="login">
								<f:form action="loginUser" method="post" class="box"
									modelAttribute="user">
									<div class="group">
										<label for="email" class="label">Email</label>
										<f:input id="email" type="email" class="input"
											placeholder="Enter your Email" path="userLogin.email"
											required="true" />
									</div>
									<div class="group">
										<label for="password" class="label">Password</label>
										<f:input id="password" type="password" class="input"
											data-type="password" placeholder="Enter your password"
											path="userLogin.password" />
									</div>
									<f:hidden path="userLogin.loginId" />
									<div class="group">
										<input id="check" type="checkbox" class="check" checked>
										<label for="check"><span class="icon"></span> Keep me
											Signed in</label>
									</div>
									<div class="group">
										<input type="submit" class="button" value="Sign In">
									</div>
								</f:form>
								
								<div class="foot">
									<a href="#">Forgot Password?</a>
								</div>
							</div>
							<f:form action="registerUser" method="post"
								modelAttribute="user">
								<div class="sign-up-form">
									<div class="group">
										<label for="firstname" class="label">Firstname</label>
										<f:input id="firstname" type="text" class="input"
											placeholder="Input your Firstname" path="firstName"
											required="true" />
									</div>
									<div class="group">
										<label for="lastname" class="label">LastName</label>
										<f:input id="lastname" type="text" class="input"
											placeholder="Input your Lastname" path="lastName" />
									</div>
									<div class="group">
										<label for="email" class="label">Email</label>
										<f:input id="email" type="email" class="input"
											path="userLogin.email" placeholder="Enter your Email" />
									</div>
									<div class="group">
										<label for="password" class="label">Passowrd</label>
										<f:input id="password" type="password" class="input"
											data-type="password" placeholder="Create your Password"
											path="userLogin.password" />
									</div>
									<div class="group">
										<label for="number" class="label">Mobile Number</label>
										<f:input id="number" type="number" class="input"
											placeholder="Enter your M No." path="m_number" />
									</div>
									<f:hidden path="userLogin.role" value="user"/>
									<div class="group">
										<input type="submit" class="button" value="Sign Up">
									</div>
							</f:form>
							<div class="hr"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>