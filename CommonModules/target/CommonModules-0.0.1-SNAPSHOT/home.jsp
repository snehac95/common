<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title> <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

</head>
<body bgcolor="dark">


<nav class="navbar navbar-expand-sm navbar-primary bg-dark">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="#">SignUp</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="signup.jsp">SignIn</a>
    </li>
  </ul>
        
</nav>
<form>
 <div class="form-group">
    <label for="forsite">User name</label>
    <input type="text" class="form-control" name="Model" placeholder="enter userName">
    </div>
    
    <div class="form-group">
    <label for="forsite">Email</label>
    <input type="text" class="form-control" name="" placeholder="enter the EmailId">
    </div>
    <div class="form-group">
    <label for="forsite">Mobile</label>
    <input type="text" class="form-control" name="" placeholder="Enter the Mobile Number">
    </div>
    <div class="form-group">
    <label for="forsite">Password</label>
    <input type="text" class="form-control" name="" placeholder="Enter the Password">
    </div>
    <div class="form-group">
    <label for="forsite">Confirm Password</label>
    <input type="text" class="form-control" name="" placeholder="Re enter the Password ">
    </div>
         <input type="submit" value="submit">
    
    </form>
    

</body>

</html>