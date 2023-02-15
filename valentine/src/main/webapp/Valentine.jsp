<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
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
	color:aqua;
}
</style>
</head>
<body>

<nav class="navbar navbar-dark bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand"> <img src="images/xworkz.png" alt=" "
				width="50" height="30" class="d-inline-block align-text-top">
				Valentine Application
			</a>
			
			<div class="d-flex">
			<a href="index.jsp" class="form-control me-2">Home</a>
			</div>
		</div>
	</nav>

        <h1>Enter The Details To Save</h1>
        
        <c:forEach items="${error}" var="e">
       <span style='color:red;'>${e.message}</span></br>

        </c:forEach>
    
    <form action="valentine" method="post" class="form-control-lg" >
    <div>
    <label for="name" class="form-label">Name</label>
    <input type="text" class="form-control" id="name" value="${dto.name }" name="name" placeholder="Enter The Name"/>
  </div>
  
  <div>
    <label for="valentineName" class="form-label">Valentine Name</label>
    <input type="text" class="form-control" id="valentineName" value="${dto.valentineName }" name="valentineName" placeholder="Enter The Valentine Name"/>
  </div>
  
  <div>
    <label for="meetingPalce" class="form-label">Meeting Place</label>
    <select id="meetingPalce" class="form-select" name="place">
      <option selected value="">Choose...</option>
      <c:forEach items="${place }" var="p">
      <option value="${p }">${p }</option>
      </c:forEach>
    </select>
  </div>
  
  <div>
    <label for="gift" class="form-label">Gift</label>
    <select id="gift" class="form-select" name="gift">
      <option selected value="">Choose...</option>
      <c:forEach items="${gift }" var="g"> 
      <option value="${g }">${g }</option>
      </c:forEach>
    </select>
  </div></br>
  
  <div>
    <button type="submit" class="btn btn-success" value="save">Save</button>
  </div>
    </form>
</body>
</html>