<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>login page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">
  ${message}
  <h2>Login form</h2>
  <img src="images/loginImage.jpg" style="height:160px">
  <form action="loginValidate" method="post">
    <div class="form-group">
      <label for="emailAdd">User Name:</label>
      <input type="text" class="form-control" placeholder="Enter email address" name="emailId">
    </div>
    
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="text" class="form-control" placeholder="Enter password" name="password">
    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-danger">Reset</button>
    
  </form>
</div>












</body>
</html>