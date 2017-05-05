
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE HTML>
<html>
<head>
<title>Online Petshop -${title}</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Fashionpress Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<link href="${css}/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="${css}/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!--webfont-->
<link
	href='http://fonts.googleapis.com/css?family=Lato:100,200,300,400,500,600,700,800,900'
	rel='stylesheet' type='text/css'>
<script type="text/javascript" src="${js}/jquery-1.11.1.min.js"></script>
<script src="${js}/responsiveslides.min.js"></script>
<script>
	$(function() {
		$("#slider").responsiveSlides({
			auto : true,
			nav : true,
			speed : 500,
			namespace : "callbacks",
			pager : true,
		});
	});
</script>
<script type="text/javascript" src="${js}/hover_pack.js"></script>
</head>
<body>

	<!-- Header -->
	<%@include file="./shared/header.jsp"%>

	<!-- Content  -->
	<!-- Load when user clicks home -->
	<c:if test="${userCilckHome == true}">
		<%@include file="home.jsp"%>
	</c:if>
	
		<!-- Load when user clicks sell section -->
		<c:if test="${userCilckSell == true}">
		<%@include file="sellyourpet.jsp"%>
	</c:if>
	
	<!-- Load when user clicks categories -->
	<c:if test="${userCilckCategories == true}">
		<%@include file="categories.jsp"%>
	</c:if>
	
	<!-- Load when user clicks food -->
	<c:if test="${userCilckFood == true}">
		<%@include file="petfood.jsp"%>
	</c:if>
	
	<!-- Load when user clicks Accessories -->
	<c:if test="${userCilckAccessories == true}">
		<%@include file="accessories.jsp"%>
	</c:if>
	
	<!-- Load when user clicks wishlist-->
	<c:if test="${userCilckWishlist == true}">
		<%@include file="wishlist.jsp"%>
	</c:if>
	
	<!-- Load when user clicks About Us-->
	<c:if test="${userCilckAboutUs == true}">
		<%@include file="aboutus.jsp"%>
	</c:if>
	
	<!-- Load when user clicks About Us-->
	<c:if test="${userCilckContactUs == true}">
		<%@include file="contactus.jsp"%>
	</c:if>
	
	<!-- Load when user clicks create account-->
	<c:if test="${userCilckRegister == true}">
		<%@include file="register.jsp"%>
	</c:if>

	<!-- Load when user clicks Login-->
	<c:if test="${userCilckLogin == true}">
		<%@include file="login.jsp"%>
	</c:if>
		
	<!--  FOOTER   -->
	<%@include file="./shared/footer.jsp"%>
</body>
</html>
