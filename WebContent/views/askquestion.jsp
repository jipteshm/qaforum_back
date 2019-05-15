<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

    <script src="script/ckeditor/ckeditor.js"></script> 
    
	<div class="ask-question-container">

	<%
	if(request.getParameter("registerStatus") != null){
	%>
		<div class="alert success">
		 Hello <strong><%= request.getParameter("firstName") %>!</strong> you have registered successfully. Please login with the same email/mobile and password.
		</div>
	<%
	}
	%>
	<h2 class="align-center">Ask Your Question Here</h2>
	<form action="">
	
	  <div class="login-form">
	    <label for="uname"><b>Question Title</b></label>
	    <input type="text" placeholder="Enter the Title of the Question" name="uname" required>
	
	    <label for="psw" class="marginBottom20"><b>Description</b></label>
		<textarea name="description" id="ckeditor"></textarea>
	        
	    <button type="submit" class="green-button">Post Question</button>
	  </div>

	</form>
</div>
<script> CKEDITOR.replace( 'ckeditor' );</script>