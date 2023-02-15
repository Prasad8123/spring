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
</head>
<body>

<nav class="navbar navbar-dark bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand"> <img src="images/xworkz.png" alt=" "
				width="50" height="30" class="d-inline-block align-text-top">
				CM Application
			</a>
			<div class="d-flex" >
			<a href="index.jsp"  class="form-control me-2">Home</a>
			</div>
		</div>
	</nav>
	
    <form action="cm" method="post" class="form-control-lg">
    
     <div class="mb-3">
			<label for="cmName"class="form-label">CM Name</label> <input type="text"
				class="form-control" id="cmName" name="cmName" placeholder="Enter The CM Name"/>
		</div>
		
		<div class="mb-3">
		<label class="form-lable">Party</label>
		<select class="form-select" aria-label="Default select example" name="party">
               <option selected value="">Select Party</option>
               <option value="BJP">BJP</option>
               <option value="Congres">Congres</option>
               <option value="JDS">JDS</option>
               <option value="AAP">AAP</option>
               
         </select>
       </div>
       
       <div class="mb-3">
		<label class="form-lable">State</label>
		<select class="form-select" aria-label="Default select example" name="state">
               <option selected value="">Select State</option>
               <option value="Karnatak">Karnataka</option>
               <option value="Andra Pradesh">Andra Pradesh</option>
               <option value="Telangana">Telangana</option>
               <option value="TamilNadu">TamilNadu</option>
               <option value="Kerala">Kerala</option>    
               
         </select>
       </div>
       
       <div class="mb-3">
		<label class="form-lable">Tenure</label>
		<select class="form-select" aria-label="Default select example" name="tenure">
               <option selected value="">Select Tenure</option>
               <option value="1">1</option>
               <option value="2">2</option>
               <option value="3">3</option>
               <option value="4">4</option>
               <option value="5">5</option>    
               
         </select>
       </div>
       
       <label class="form-lable">Portflio</label>
		<div class="form-floating">
		
           <textarea class="form-control" placeholder="Enter Portfolio" id="floatingTextarea" name="portfolio">
           </textarea>
  </div>
  
  
   <div class="d-grid gap-2">
      	<button type="submit" class="btn btn-info" value="register" >Register</button>
      	</div>
    </form>
    
   

</body>
</html>