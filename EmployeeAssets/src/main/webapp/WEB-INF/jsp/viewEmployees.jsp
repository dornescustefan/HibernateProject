<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>       
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<script src="https://use.fontawesome.com/37d60b494a.js"></script>
		<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>View employees</title>
	</head>

<body>
<table class="table table-bordered table-hover">  
		<tr >
			<th>ID</th>
			<th>PHOTO</th>
			<th>NAME</th>
			<th>ADDRESS</th>
			<th>EMAIL</th>
			<th>ADD ASSETS</th>
			<th>EDIT</th>
			<th>ASSETS</th>
			
		</tr>  
   <c:forEach var="employees"	 items="${employeeList}"> 
    <tr>  
   		<td>${employees.id}</td> 
   		<td><img src='${employees.photo}' height="100" width="150"></td> 
   		<td>${employees.name}</td>
     	<td>${employees.address}</td>
   		<td>${employees.email}</td> 
   		<td><a href="addPhone${employees.id}"><input type="button" value = "Add phone" class="btn" /><br><br>
   		    <a href="addLaptop${employees.id}"><input type="button" value = "Add laptop" class="btn" />
   		</a></td>
   		<td><a href="delete${employees.id}"><input type="button" value = "Delete Employee" class="btn" /></a></td>
   		
   	<td>
					<table class="table table-bordered">
						<tr>
							<th>Phone Make</th><th>Phone IMEI</th><th>Remove phone</th>
						</tr>
						<c:forEach items="${employees.phones}" var="phones">
							<tr>
								<td>${phones.phoneMake}</td>
								<td>${phones.phoneImei}</td>
								<td><a href="deletePhone"><input type="button" value = "Remove phone" class="btn" /></a></td>
							</tr>
						</c:forEach>
						
						<tr>
							<th>Laptop Make</th><th>Laptop SN</th><th>Remove laptop</th>
						</tr>
						<c:forEach items="${employees.laptops}" var="laptops">
							<tr>
								<td>${laptops.make}</td>
								<td>${laptops.serialNumber}</td>
								<td><a href="deleteLaptop"><input type="button" value = "Remove laptop" class="btn" /></a></td>
							</tr>
						</c:forEach>
						
					</table>
	</td>
   	
   	</tr>	
   </c:forEach>  
 </table> 
</body>
</html>