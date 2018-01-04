<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>AddLaptop</title>
</head>
<body>
<div class="container" >
<div class="col-sm-4"></div>
<div class="col-sm-4">
<h3>Add laptop for<br>
${id} ${name}</h3>
<form:form action="saveLaptop" modelAttribute="saveLaptopForm" method="POST" >
        <div class="form-group"> 
       		<label  >Laptop make:</label>
         	<form:select path="make" id="make" type="text" class="form-control">
         	<option selected disabled >--Please select a laptop make--</option>
         	<option>Asus</option>
         	<option>Apple</option>
         	<option>Dell</option>
         	<option>Samsung</option>
         	<option>Sony Vaio</option>
         	</form:select>
		</div>
		<div class="form-group"> 
       		<label >Laptop serial number:</label>
         	<form:input path="serialNumber" id="serialNumber" type="text" class="form-control"/>
		</div>
		<div class="form-group"> 
       		<button type="submit" class="btn btn-default">Add laptop</button>
		</div>
</form:form>           
</div>
<div class="col-sm-4"></div>
</div>
</body>
</html>