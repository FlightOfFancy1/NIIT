<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="slider">
	  <div class="callbacks_container">
	      <ul class="rslides" id="slider">
	        <li><img src="${images}/dog1.jpg" class="img-responsive" alt=""/>
	        <div class="banner_desc">
				<h1>Take your Favourite Pet to your home.</h1>
				<h2>Petshop is the place where you can find your favourite pet and also can sell.</h2>
			</div>
	        </li>
	        <li><img src="${images}/dog2.jpg" class="img-responsive" alt=""/>
	         <div class="banner_desc">
				<h1>Put your pet info and give them a new buyer.</h1>
				<h2>A dog is the only thing on earth that loves you, more than you love yourself</h2>
			 </div>
	        </li>
	        <li><img src="${images}/cat2.jpg" class="img-responsive" alt=""/>
	          <div class="banner_desc">
				<h1>Cats are connoisseurs of comfort</h1>
				<h2></h2>
			  </div>
	        </li>
	         <li><img src="${images}/cat1.jpg" class="img-responsive" alt=""/>
	          <div class="banner_desc">
				<h1>Just watching my cats can make me happy</h1>
				<h2></h2>
			  </div>
	        </li>
	      </ul>
	  </div>
</div>
<div class="column_center">
  <div class="container">
	<div class="search">
	  <div class="stay">Search Product</div>
	  <div class="stay_right">
		  <input type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">
		  <input type="submit" value="">
	  </div>
	  <div class="clearfix"> </div>
	</div>
    <div class="clearfix"> </div>
  </div>
</div>
<div class="main">
  <div class="content_top">
  	<div class="container">
	   <div class="col-md-3 sidebar_box">
	   	 <div class="sidebar">
			<div class="menu_box">
		    <h3 class="menu_head">Products Menu</h3>
			  <ul class="menu">
			  <c:forEach items="${categories}" var="cat">
				<li class="item1"><a href="#"><img class="arrow-img" src="${images}/f_menu.png" alt=""/>${cat.catname}</a>
					<ul class="cute">
						<li class="subitem1"><a href="#">Labrador </a></li>
						<li class="subitem2"><a href="#">Great Dane </a></li>
						<li class="subitem3"><a href="#">Bull Dog </a></li>
						<li class="subitem3"><a href="#">Doberman </a></li>
						<li class="subitem3"><a href="#">German Sheperd </a></li>
						<li class="subitem3"><a href="#"> Boxer </a></li>
					</ul>
				</li>
				</c:forEach>
				<li class="item2"><a href="#"><img class="arrow-img" src="${images}/f_menu.png" alt=""/>Cat</a>
					<ul class="cute">
						<li class="subitem1"><a href="#">Persian </a></li>
						<li class="subitem2"><a href="#">Mumbai Cat </a></li>
						<li class="subitem3"><a href="#">Himalayan Cat </a></li>
						<li class="subitem3"><a href="#">Siamese Cat </a></li>
						<li class="subitem3"><a href="#">spotted Cat </a></li>
					</ul>
				</li>
				<li class="item3"><a href="#"><img class="arrow-img" src="${images}/f_menu.png" alt=""/>Birds</a>
					<ul class="cute">
						<li class="subitem1"><a href="#">Cute Kittens </a></li>
						<li class="subitem2"><a href="#">Strange Stuff </a></li>
						<li class="subitem3"><a href="#">Automatic Fails</a></li>
					</ul>
				</li>
				<li class="item4"><a href="#"><img class="arrow-img" src="${images}/f_menu.png" alt=""/>Fish</a>
					<ul class="cute">
						<li class="subitem1"><a href="#">Cute Kittens </a></li>
						<li class="subitem2"><a href="#">Strange Stuff </a></li>
						<li class="subitem3"><a href="#">Automatic Fails </a></li>
					</ul>
				</li>
				<li class="item5"><a href="#"><img class="arrow-img" src="${images}/f_menu.png" alt=""/>Tortoise</a>
					<ul class="cute">
						<li class="subitem1"><a href="#">Cute Kittens </a></li>
						<li class="subitem2"><a href="#">Strange Stuff </a></li>
						<li class="subitem3"><a href="#">Automatic Fails </a></li>
					</ul>
				</li>
				<li class="item6"><a href="#"><img class="arrow-img" src="${images}/f_menu.png" alt=""/>Rabbit</a>
					<ul class="cute">
						<li class="subitem1"><a href="#">Cute Kittens </a></li>
						<li class="subitem2"><a href="#">Strange Stuff </a></li>
						<li class="subitem3"><a href="#">Automatic Fails </a></li>
					</ul>
				</li>
<%-- 				<li class="item7"><a href="#"><img class="arrow-img" src="${images}/f_menu.png" alt=""/>Top Fashion</a> --%>
<!-- 					<ul class="cute"> -->
<!-- 						<li class="subitem1"><a href="#">Cute Kittens </a></li> -->
<!-- 						<li class="subitem2"><a href="#">Strange Stuff </a></li> -->
<!-- 						<li class="subitem3"><a href="#">Automatic Fails </a></li> -->
<!-- 					</ul> -->
<!-- 				</li> -->
<%-- 				<li class="item8"><a href="#"><img class="arrow-img" src="${images}/f_menu.png" alt=""/>Summer Collection</a> --%>
<!-- 					<ul class="cute"> -->
<!-- 						<li class="subitem1"><a href="#">Cute Kittens </a></li> -->
<!-- 						<li class="subitem2"><a href="#">Strange Stuff </a></li> -->
<!-- 						<li class="subitem3"><a href="#">Automatic Fails </a></li> -->
<!-- 					</ul> -->
<!-- 				</li> -->
<%-- 				<li class="item9"><a href="#"><img class="arrow-img" src="${images}/f_menu.png" alt=""/>Special Offer</a> --%>
<!-- 					<ul class="cute"> -->
<!-- 						<li class="subitem1"><a href="#">Cute Kittens </a></li> -->
<!-- 						<li class="subitem2"><a href="#">Strange Stuff </a></li> -->
<!-- 						<li class="subitem3"><a href="#">Automatic Fails </a></li> -->
<!-- 					</ul> -->
<!-- 				</li> -->
			</ul>
		</div>
				<!--initiate accordion-->
		<script type="text/javascript">
			$(function() {
			    var menu_ul = $('.menu > li > ul'),
			           menu_a  = $('.menu > li > a');
			    menu_ul.hide();
			    menu_a.click(function(e) {
			        e.preventDefault();
			        if(!$(this).hasClass('active')) {
			            menu_a.removeClass('active');
			            menu_ul.filter(':visible').slideUp('normal');
			            $(this).addClass('active').next().stop(true,true).slideDown('normal');
			        } else {
			            $(this).removeClass('active');
			            $(this).next().stop(true,true).slideUp('normal');
			        }
			    });
			
			});
		</script>
       </div>
		    <div class="delivery">
				<img src="${images}/delivery.jpg" class="img-responsive" alt=""/>
				<h3>Delivering</h3>
				<h4>World Wide</h4>
			</div>
<!-- 			<div class="twitter"> -->
<!-- 			   <h3>Latest From Twitter</h3> -->
<!-- 			   <ul class="twt1"> -->
<!-- 			   	  <i class="twt"> </i> -->
<!-- 			   	  <li class="twt1_desc"><span class="m_1">@Contrary</span> to popular belief, Lorem Ipsum is<span class="m_1"> not simply</span></li> -->
<!-- 			   	  <div class="clearfix"> </div> -->
<!-- 			   </ul> -->
<!-- 			   <ul class="twt1"> -->
<!-- 			   	  <i class="twt"> </i> -->
<!-- 			   	  <li class="twt1_desc"><span class="m_1">There are many</span> variations of passages of Lorem Ipsum available, but the majority <span class="m_1">have suffered</span></li> -->
<!-- 			   	  <div class="clearfix"> </div> -->
<!-- 			   </ul> -->
<!-- 			   <ul class="twt1"> -->
<!-- 			   	  <i class="twt"> </i> -->
<!-- 			   	  <li class="twt1_desc"><span class="m_1">Lorem Ipsum</span> is simply dummy text of the printing and typesetting industry. Lorem Ipsum has <span class="m_1">been the industry's standard dummy text ever</span></li> -->
<!-- 			   	  <div class="clearfix"> </div> -->
<!-- 			   </ul> -->
<!-- 			</div> -->
			<div class="clients">
				<h3>Our Happy Clients</h3>
				<h4>This is the best place to take your favourite pet to your home</h4>
			   <ul class="user">
			   	<i class="user_icon"></i>
			  <!--  	<li class="user_desc"><a href="#"><p>John Doe, Company Info</p></a></li> -->
			   	<div class="clearfix"> </div>
			   </ul>
			</div>
	   </div> 
	   <div class="col-md-9 content_right">
	   	<div class="top_grid1">
	     <div class="col-md-4 box_2">
	     	<div class="grid_1"><a href="single.html">
	     		<div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p1.jpg" class="img-responsive" alt=""/></div>
	     	   <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	   </div>
	     	</div>
	     </a></div>
	     <div class="col-md-8 box_1"><a href="single.html">
	       <div class="grid_1">
	     	  <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p2.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	     </a></div>
	     <div class="clearfix"> </div>
	    </div> 
	    <div class="top_grid2">
	      <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	  <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p3.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	     </a></div>
	     <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	  <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p4.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	     </a></div>
	     <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	  <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p5.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	    </a> </div>
	     <div class="clearfix"> </div>
	    </div> 
	    <div class="top_grid2">
	     <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	 <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p6.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	     </a></div>
	    <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	  <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p7.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	     </a></div>
	     <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	  <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p8.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	     </a></div>
	     <div class="clearfix"> </div>
	    </div> 
	    <h4 class="head"><span class="m_2">Popular</span> Products Now</h4>
	    <div class="top_grid2">
	     <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	  <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p9.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	    </a> </div>
	    <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	 <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p10.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	     </a></div>
	     <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	  <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p11.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	     </a></div>
	     <div class="clearfix"> </div>
	    </div> 
	    <div class="top_grid2">
	     <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	  <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p12.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	     </a></div>
	    <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	  <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p13.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	     </a></div>
	     <div class="col-md-4 top_grid1-box1"><a href="single.html">
	     	<div class="grid_1">
	     	  <div class="b-link-stroke b-animate-go  thickbox">
		        <img src="${images}/p14.jpg" class="img-responsive" alt=""/> </div>
	     	  <div class="grid_2">
	     	  	<p>There are many variations in a pet breed</p>
	     	  	<ul class="grid_2-bottom">
	     	  		<li class="grid_2-left"><p>$99<small>.33</small></p></li>
	     	  		<li class="grid_2-right"><div class="btn btn-primary btn-normal btn-inline " target="_self" title="Get It">Get It</div></li>
	     	  		<div class="clearfix"> </div>
	     	  	</ul>
	     	  </div>
	     	</div>
	     </a></div>
	     <div class="clearfix"> </div>
	    </div> 
       </div>
	  </div>  	    
	</div>
</div>
<div class="footer_bg">
</div>
</body>
</html>