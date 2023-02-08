<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<script type="text/javascript" src="boostrap/js/bootstrap.js"></script>
<style type="text/css">
h1{
    margin-top: 30px;
     text-align:center;
    color:orange;
}
</style>
</head>
<body>
<nav class="navbar navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand">
    <img src="images/xworkz.png" alt=" " width="50" height="30"  class="d-inline-block align-text-top">
     Bakery Details
    </a>
  </div>
</nav>

	<h1>Save Details of Bakery</h1>
	
	<form action="bakery" method="post" class="form-control-lg">
	
	<div class="mb-3">
			<label for="bakeryName"class="form-label">Bakery Name</label> <input type="text"
				class="form-control" id="bakeryName" name="bakeryName" placeholder="Enter the Bakery Name"/>
		</div>
		
		<div class="mb-3">
			<label for="bakeryOwnerName"class="form-label">Bakery Owner Name</label> <input type="text"
				class="form-control" id="bakeryOwnerName" name="bakeryOwnerName" placeholder="Enter The Bakery Owner Name"/>
		</div>
		
		<label for="ownerMarried"class="form-label">Bakery Owner Married</label>
		<div class="form-check form-check-inline">
		 <label class="form-check-label" for="flexRadioDefault1">Yes</label>
         <input class="form-check-input" type="radio" name="isMarried" id="flexRadioDefault1" value="true" />
       </div>
       <div class="form-check form-check-inline">
		 <label class="form-check-label" for="flexRadioDefault">No</label>
         <input class="form-check-input" type="radio" name="isMarried" id="flexRadioDefault" value="false" />
        </div>
       
    
		<div class="mb-3">
			<label for="bakeryOwnerWifeName"class="form-label">Bakery Owner Wife Name</label> <input type="text"
				class="form-control" id="bakeryOwnerWifeName" name="bakeryOwnerWifeName" placeholder="Enter The Bakery Owner Wife Name"/>
		</div>
		
		<div class="form-floating">
		
  <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea" name="famouseFor"></textarea>
  <label for="floatingTextarea">Bakery Famous For</label>
</div> 
		
		<div class="mb-3">
			<label for="bakerySince"class="form-label">Bakery Since</label> <input type="text"
				class="form-control" id="bakerySince" name="since" placeholder="Enter The Bakery since"/>
		</div>
		
		<div>
      	<input type="submit" class="btn btn-primary" value="submit"/>
      	</div>
	</form>

</body>
</html>