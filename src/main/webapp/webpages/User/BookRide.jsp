<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<title>Booking Ride</title>

<!-- Google font -->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet">

<!-- Bootstrap -->
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

<!-- Custom stlylesheet -->
<link type="text/css" rel="stylesheet" href="css/style.css" />

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>
	<div id="booking" class="section">
		<div class="section-center">
			<div class="container">
				<div class="row">
					<div class="booking-form">
						<div class="form-header">
							<h1>Book your Ride</h1>
						</div>
						<f:form action="userBookRide" method="post" modelAttribute="ride">
							<div class="row">
								<div class="col-sm-6"></div>
							</div>
							<div class="form-group">
								<span class="form-label">Phone</span>
								<f:input class="form-control" type="number"
									placeholder="Enter your phone number" path="book_M_number" required="true" value="${userData.m_number }" />
							</div>
							<div class="form-group">
								<span class="form-label">Pickup Location</span>
								<f:input class="form-control" type="text"
									placeholder="Enter ZIP/Location" path="sourceAddress"
									required="true" />
							</div>
							<div class="form-group">
								<span class="form-label">Destination</span> <f:input
									class="form-control" type="text"
									placeholder="Enter ZIP/Location" path="destinationAddress" required="true"/>
							</div>
							<f:hidden path="login.loginId" value="${bookLoginId}"/>
							<f:hidden path="status" value="pending"/>
							<div class="form-btn">
								<button class="submit-btn">Book Now</button>
							</div>
							</f:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>