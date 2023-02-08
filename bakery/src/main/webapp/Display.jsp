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
    color:fuchsia;
}
h3{
color:navy;
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
    <div class="d-flex">
    <a class="form-control me-2" href="index.jsp">Home</a>
    </div>
  </div>
</nav>

<h1>Saved Details Are </h1>
<h3>Bakery Name           : ${bakeryName }</h3>
<h3>Bakery Owner Name     : ${bakeryOwnerName }</h3>
<h3>Bakery Owner Married  : ${isMarried }</h3>
<h3>Bakery OwnerWife Name : ${bakeryOwnerWifeName }</h3>
<h3>Bakery Since          : ${bakerySince }</h3>
<h3>Bakery Famous For     : ${bakeryFamousFor }</h3>

</body>
</html>