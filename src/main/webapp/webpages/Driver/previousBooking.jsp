<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Your Bookings</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/ViewAllBookings.css">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script>
	$(document).ready(function() {
		$('[data-toggle="tooltip"]').tooltip();
	});
</script>


<script src="https://code.jquery.com/jquery-2.2.4.min.js"
	integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
	crossorigin="anonymous"></script>

<!-- Bootstrap files (jQuery first, then Popper.js, then Bootstrap JS) -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"
	type="text/javascript"></script>


</head>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<body class="body-image">

	<div class="container">

		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<h2 class="navbar-brand" href="#">${driverData.firstName}
				${driverData.lastName}</h2>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#main_nav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="main_nav">


				<!-- main part -->
				<ul class="navbar-nav ml-auto">
					<li class="nav-item dropdown">
						<div class="collapse navbar-collapse" id="navbar-list-4">
							<ul class="navbar-nav">
								<li class="nav-item dropdown"><a
									class="nav-link dropdown-toggle" href="#"
									id="navbarDropdownMenuLink" role="button"
									data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="false"> <img src="../images/lamborghini.jpg"
										width="40" height="40" class="rounded-circle">
								</a>

									<div class="dropdown-menu"
										aria-labelledby="navbarDropdownMenuLink">
										<a class="dropdown-item" href="dashboardDriver">Dashboard</a> <a
											class="dropdown-item" href="#">Edit Profile</a> <a
											class="dropdown-item" href="loadLogin">Log Out</a>
									</div>
						</div>
					</li>
				</ul>
			</div>
	</div>
	</li>

	</ul>

	</div>
	<!-- navbar-collapse.// -->

	</nav>

	</div>

	<div class="container-xl">
		<div class="table-responsive">
			<div class="table-wrapper">
				<div class="table-title">
					<div class="row">
						<div class="col-sm-8">
							<h2>
								<b>Booking Details</b>
							</h2>
						</div>
						<div class="col-sm-4">
							<div class="search-box">
								<i class="material-icons">&#xE8B6;</i> <input type="text"
									class="form-control" placeholder="Search&hellip;">
							</div>
						</div>
					</div>
				</div>
				<table class="table table-striped table-hover table-bordered">
					<thead>
						<tr>
							<th>Serial No.</th>
							<th>Mobile Number</th>
							<th>Source Address</th>
							<th>Destination Address</th>
							<th>Status</th>
						</tr>
					</thead>
					<c:forEach var="i" items="${bookingData}" varStatus="j">
						<tbody>
							<tr>
								<td>${j.count}</td>
								<td>${i.book_M_number}</td>
								<td>${i.sourceAddress}</td>
								<td>${i.destinationAddress}</td>
								<td>${i.status}</td>
								
							</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
</body>

</html>