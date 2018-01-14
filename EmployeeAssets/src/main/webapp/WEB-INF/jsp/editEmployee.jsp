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

<title>AddEmployee</title>
</head>
<body>
<div class="container" >
<div class="col-sm-4"></div>
<div class="col-sm-4">


<h3>Edit employee:</h3><br>
<form:form action="saveEditedEmployee" modelAttribute="editEmployeeForm" method="POST" >
		<form:input path="id"  id="id"  type="hidden"/>
        <div class="form-group"> 
       		<label  for="name" >Employee name:</label>
         	<form:input path="name" id="name" type="text" class="form-control" placeholder="FirstName LastName"/>
		</div>
            
        <div class="form-group"> 
       		<label  for="address" >Employee address:</label>
         	<form:input type="text" path="address" id="address" class="form-control" placeholder="Employee Address" />
		</div>    
        
        <div class="form-group"> 
       		<label  for="email" >Employee email:</label>
         	<form:input type="text" path="email" id="email" class="form-control"  placeholder="address@email.com" />
		</div>
		
		 <div class="form-group"> 
       		<label  for="email" >Employee photo URL:</label>
         	<form:input type="text" path="photo" id="photo" class="form-control"  placeholder="Employee Photo URL" />
		</div>        
        <button type="submit" class="btn btn-default">Save employee</button>
 </form:form>
</div>
<div class="col-sm-4"></div>
</div>
</body>
</html>