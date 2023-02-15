<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<script type="text/javascript" src="boostrap/js/bootstrap.js">
</script>
<style type="text/css">
h1 {
	margin-top: 30px;
	text-align: center;
	color: orange;
}
</style>

</head>
<body>
	<nav class="navbar navbar-dark bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand"> <img src="images/xworkz.png" alt=" "
				width="50" height="30" class="d-inline-block align-text-top">
				Egg Application
			</a>
			
			<div class="d-flex">
			<a href="Cm.jsp" class="form-control me-2">CM Profile</a>
			</div>
		</div>
	</nav>

        <h1>Welcome To Hotel</h1>
        
        <form action="egg" method="post" class="form-control-lg">
        
        <div class="mb-3">
			<label for="hotelName"class="form-label">Hotel Name</label> <input type="text"
				class="form-control" id="hotelName" name="hotelName" placeholder="Enter The Hotel Name"/>
		</div>
		
       <div class="mb-3">
		<label class="form-lable">Dishes</label>
		<select class="form-select" aria-label="Default select example" name="dish">
               <option selected value="">Select Dishes</option>
               <option value="eggMasala">Egg Masala</option>
               <option value="eggFiry">Egg Friy</option>
               <option value="eggRice">eggRice</option>
               <option value="boildEgg">Boild Egg</option>
              <option value="eggBurge">Egg Burge</option>
              <option value="eggBiryani">Egg Biryani</option>
              <option value="eggPakoda">Egg Pakoda</option>
               
         </select>
       </div>
       
       <div class="mb-3">
		<label class="form-lable">Egg Type</label>
		<select class="form-select" aria-label="Default select example" name="type">
               <option selected value="">Select</option>
               <option value="nati">Nati</option>
               <option value="faram">Faram</option>
               <option value="brolier">Brolier</option>      
         </select>
       </div>
       
       <div>
			<label for="customRange2" class="form-label">Quantity</label> <input
				type="range" class="form-range" min="0" max="5" id="customRange2" name="quantity"/>
		</div>
       
       <div class="mb-3">
			<label for="price"class="form-label">Price</label> <input type="text"
				class="form-control" id="price" name="price" placeholder="Enter The Price"/>
		</div>
		
		<div class="d-grid gap-2">
      	<button type="submit" class="btn btn-info" value="order">Order</button>
      	</div>
        </form>
</body>
</html>