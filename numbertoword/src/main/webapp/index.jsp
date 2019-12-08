<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div {
  width: 300px;
  border: 10px solid green;
  padding: 50px;
  margin: 20px;
}
</style>
</head>
<body>
<center>
<div>
<h3>Convert Number To Word</h3>
<form action="getValue">
  Enter number:<br>
  <input type="text" name="number" value="${userNumber.number}" pattern="[0-9]+" title="Please enter valid number" required><br><br>
  <input type="submit" value="Submit">
</form>
<h4>${Words}</h4>
</div>
</center>
</body>
</html>