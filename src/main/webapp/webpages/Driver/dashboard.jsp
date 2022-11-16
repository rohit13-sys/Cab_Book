<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="keywords"
	content="htmlcss bootstrap menu, navbar, mega menu examples" />
<meta name="description"
	content="Bootstrap navbar examples for any type of project, Bootstrap 4" />

<title>Welcome User</title>

<!-- jQuery -->
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
<link rel="stylesheet" href="css/Navigation.css">


</head>
<body >

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
	<div
		style="height: 435px; width: 600px; float: left; margin: 20px 30px 0 45px; padding: 20px;">
		<div class="card bg-dark text-white">
			<img class="card-img" src="../images/cab-4.jpg" alt="Card image"  >
			<div class="card-img-overlay">
					
				<p class="card-text">
				<h1>View Your Pending Current ridess</h1>
				</p>
				<br /> <br /> <br /> <br /> <br /> <br /> <a href="notifications"
					class="btn btn-primary button">Notifications</a>
			</div>
		</div>
	</div>

	<div
		style="height: 435px; width: 600px; float: left; margin: 20px 30px 0; padding: 20px;">
		<div class="card bg-dark text-white">
			<img class="card-img" src="../images/cab-4.jpg" alt="Card image">
			<div class="card-img-overlay">
				<p class="card-text">
				<h1>Watch Your Previous Bookings</h1>
				</p>
				<br /> <br /> <br /> <br /> <br /> <br /> <a href="previousBookings"
					class="btn btn-primary button">View</a>
			</div>
		</div>
	</div>
</body>
</html>