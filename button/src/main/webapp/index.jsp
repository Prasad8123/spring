<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>
<form action="email" method="get">
<h2>Display Email : ${email }</h2>
<input type="submit" value="Email">
</form>

<form action="mobile" method="get">
<h2>Display Mobile Number : ${mobile }</h2>
<input type="submit" value="mobile"/>
</form>

<form action="Aadher" method="get">

<h2>Display Aadher Number : ${Aadher }</h2>
<input type="submit" value="Aadher"/>
</form>

<form action="age" method="get">
<h2>Display age : ${age }</h2>
<input type="submit" value="age"/>
</form>

<form action="dob" method="get">
<h2>Display DOB :${date }</h2>
<input type="submit" value="DOB"/>
</form>

<form action="salary" method="get">
<h2>Display Salary :${salary }</h2>
<input type="submit" value="salary"/>
</form>
<form action="friend" method="get">
<h2>Display Friends :</h2>
<ul>
<c:forEach items="${friend }" var="friend">
<li>${friend }</li>
</c:forEach>
</ul>
<input type="submit" value="friend"/>
</form>

<form action="place" method="get">
<h2>Display Most Visited places :</h2>
<ul>
<c:forEach items="${place }"  var="place">
<li>${place }</li>
</c:forEach>
</ul>

<input type="submit" value="place"/>
</form>

<form action="skill" method="get">
<h2>Display Skill Set : </h2>
<ul>
<c:forEach items="${skill }" var="skill">
<li>${skill }</li>
</c:forEach>
</ul>
<input type="submit" value="skillSet"/>
</form>

<form action="edu" method="get">
<h2>Display Education Dto : </h2>
<label>courceName : ${dto.courceName }</label></br>
<label>Duartion : ${dto.duartion }</label></br>
<label>branch :${dto.branch }</label></br>
<label>semister : ${dto.semister }</label></br>
<label>firstYearFees : ${dto.firstYearFees }</label></br>
<label>secondYearFees : ${dto.secondYearFees }</label></br>
<label>thiredYearFees : ${dto.thiredYearFees }</label></br>
<label>fourthYearFees : ${dto.fourthYearFees }</label></br>


<input type="submit" value="education"/>
</form>

<form action="mob" method="get">
<h2>Display Mobile Dto :</h2>
<ul>
<c:forEach items="${mob }" var="mob">
<li>${mob }</li>
</c:forEach>
</ul>

<input type="submit" value="mobileDto"/>
</form>


<form action="beverage" method="get">
<h2>Display Beverage Dto :</h2>
<ul>
<c:forEach items="${beve }" var="bev">
<li>${bev }</li>
</c:forEach>
</ul>

<input type="submit" value="BeverageDto"/>
</form>

<form action="chat" method="get">
<h2>Display Chat Dto :</h2>
<ul>
<c:forEach items="${chat }" var="chat">
<li>${chat }</li>
</c:forEach>
</ul>

<input type="submit" value="ChatDto"/>
</form>
</body>
</html>