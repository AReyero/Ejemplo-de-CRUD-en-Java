<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GestorVideojuegos</title>
<%@ include file="includes/IncludeHead.jsp" %>
</head>
<body>
	<%@ include file="includes/IncludeBody.jsp" %>
	<h1>Bienvenido a GestorVideojuegos</h1>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="https://static1.squarespace.com/static/58b3cae5d1758e0132a008c6/t/5a8235f74192020a2d71e3ca/1518482938945/ab4dbebf6a6e4f4ba57bfed438b97b4b.jpg?format=750w" style="width:100%">
      <div class="carousel-caption">
        <h3>Los Angeles</h3>
        <p>LA is always so much fun!</p>
      </div>
    </div>

    <div class="item">
      <img src="https://i.blogs.es/cc4e24/ss_b923ac3082d777893dfd5594f338b2c7dada5133/2560_3000.jpg" style="width:100%">
      <div class="carousel-caption">
        <h3>Chicago</h3>
        <p>Thank you, Chicago!</p>
      </div>
    </div>

    <div class="item">
      <img src="http://lordskunk.com/wp-content/uploads/2016/05/swgoh-1024x640.jpg" style="width:100%">
      <div class="carousel-caption">
        <h3>New York</h3>
        <p>We love the Big Apple!</p>
      </div>
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<%@ include file="includes/IncludeFoot.jsp" %>
</body>

</html>