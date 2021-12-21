
<!doctype html>
<html lang="en" >
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">



<title>Index Page</title>
</head>
<body>

	<div class="container mt-5 jumbotron">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<div class="alert alert-danger" role="alert">
					${message}
				</div>
				<h3>Enter product details</h3>
				<form action="proceedForm" method="get">
					<div class="form-group">
						<label for="exampleInputEmail1">Product ID</label> <input
							type="text" class="form-control" aria-describedby="emailHelp"
							placeholder="Enter product id" name="pid">
					</div>

					<div class="form-group">
						<label for="exampleInputEmail1">Product Name</label> <input
							type="text" class="form-control" aria-describedby="emailHelp"
							placeholder="Enter product name" name="pname">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Product Price</label> <input
							type="text" class="form-control" aria-describedby="emailHelp"
							placeholder="Enter product price" name="pprice">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">Product Description</label> <input
							type="text" class="form-control" aria-describedby="emailHelp"
							placeholder="Enter product description" name="pdesc">
					</div>
					<button type="submit" class="btn btn-outline-primary btn-block">Submit</button>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>