<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movies</title>
</head>
<body>
   <h1>Select your movies!!!!</h1>
   

<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<body>

<h3>Fill Your Movie Details</h3>

<div>
  <form action="bookingform" method="post">
  
    <label for="mname">Enter movie Name</label>
    <input type="text" id="fname" name="movieName" placeholder="Movie name..">

    <label for="lname">Enter movie Language</label>
    <input type="text" id="lname" name="movieLanguage" placeholder="Enter Movie language">

    <label for="mtype">Movie Type</label>
    <select id="mtype" name="MovieType">
      <option value="Bollywood">Bollywood</option>
      <option value="hollywood">Hollywood</option>
      <option value="Tollywood">Tollywood</option>
    </select>
  
    <input type="submit" value="Book">
  </form>
</div>





   
   
   
   
   
   
  
</body>
</html>