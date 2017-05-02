<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot"  value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="header">
	<div class="header_top">
		<div class="container">
			<div class="logo">
				<a href="index.html"> <h1><span style="color:red;">P</span><span style="color:green;">ETSHO</span><span style="color:red">P</span></h1></a>
			</div>
			<ul class="shopping_grid">
			      <a href="#"><li>Join</li></a>
			      <a href="login.html"><li>Sign In</li></a>
			      <a href="#"><li><span class="m_1">Shopping Bag</span>&nbsp;&nbsp;(0) &nbsp;<img src="${images}/bag.png" alt=""/></li></a>
			      <div class="clearfix"> </div>
			</ul>
		    <div class="clearfix"> </div>
		</div>
	</div>
	<div class="h_menu4"><!-- start h_menu4 -->
		<div class="container">
				<a class="toggleMenu" href="#">Menu</a>
				<ul class="nav">
					<li class="active"><a href="${contextRoot}/home" data-hover="Home">Home</a></li>
					<li><a href="${contextRoot}/sell" data-hover="About Us">Sell your pet</a></li>
					<li><a href="${contextRoot}/categories" data-hover="Careers">Categories</a></li>
					<li><a href="${contextRoot}/food" data-hover="Contact Us">Pet Food</a></li>
					<li><a href="${contextRoot}/accessories" data-hover="Company Profile">Pet Animal Accessories</a></li>
					<li><a href="${contextRoot}/aboutus"  data-hover="Company Registration">About Us</a></li>
					<li><a href="${contextRoot}/wishlist" data-hover="Wish List">Wish List</a></li>
				 </ul>
				 <script type="text/javascript" src="${js}/nav.js"></script>
	      </div><!-- end h_menu4 -->
     </div>
</div>

</body>
</html>