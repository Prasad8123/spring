<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<script type="text/javascript" src="boostrap/js/bootstrap.bundle.js"> </script>
<style type="text/css">
h1{
    margin-top: 30px;
     text-align:center;
    color:purple;
}
</style>
</head>
<body>
<nav class="navbar navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand">
    <img src="images/xworkz.png" alt=" " width="30" height="24"  class="d-inline-block align-text-top"> Beach
    </a>
    
    <div class="d-flex">
				<a class="form-control me-2" href="index.jsp">Home</a>
			</div>
		</div>
	</nav>
	<h2>Enter the details of Beach</h2>
	<form  action="beaches" class="form-control-lg"  method="post" >
		
		<div class="mb-3">
			<label for="name"class="form-label">Name</label> <input type="text"
				class="form-control" id="name" name="name" placeholder="Enter the Beach Name"/>
		</div>
		
		<div class="mb-3">
			<label for="location"class="form-label">Location</label> <input type="text"
				class="form-control" id="location" name="location" placeholder="Enter the Beach location"/>
		</div>
		<label for="clean"class="form-label">Clean</label>
		<div class="form-check">
		
    <input class="form-check-input" type="radio" name="isClean" id="flexRadioDefault1" value="true" />
           <label class="form-check-label" for="flexRadioDefault1">
          Yes
      </label>
     </div>
     
     <div class="form-check">
         <input class="form-check-input" type="radio" name="isClean" id="flexRadioDefault2" value="false" />
           <label class="form-check-label" for="flexRadioDefault2">
           No
      </label>
     </div>
		
		<div class="mb-3">
			<label for="game"class="form-label">Game</label> <input type="text"
				class="form-control" id="game" name="game" placeholder="Enter the Beach Game"/>
		</div>
		<div>
      	<input type="submit" class="btn btn-primary" value="submit"/>
      	</div>
      	</form>
</body>
</html>