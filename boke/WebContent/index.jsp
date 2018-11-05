<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Classic Forms Responsive Widget Template :: guoyue</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Classic Forms Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Meta tag Keywords -->
<!-- css files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all">
<link rel="stylesheet" href="css/font-awesome.css"> <!-- Font-Awesome-Icons-CSS -->
<!-- //css files -->
<!-- Web-Fonts -->
<link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
<!-- //Web-Fonts -->
</head>
<body>
<h1>Welcome </h1>
<div class="main">
	<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
		<div class="img-w3l-agile">
		<img src="images/1.jpg" alt=" ">
		</div>
		<ul class="resp-tabs-list">
				<li class="resp-tab-item"><span>登录</span></li>
			<li class="resp-tab-item"><h2><span>注册</span></h2></li>
		</ul>			
		<div class="resp-tabs-container">
			<div class="tab-1 resp-tab-content">
				<div class="login-top">
					<form action="Login.do" method="post">
						<input type="email" name="email" class="email" placeholder="邮箱" required=""/>
						<input type="password" name="password" class="password" placeholder="密码" required=""/>	
					
						<div class="login-bottom">
							<ul>
								<li>
									<input type="checkbox" id="brand" value="">
									<label for="brand"><span></span> 记住密码?</label>
								</li>
								<li>
									<a href="#">忘记密码?</a>
								</li>
							</ul>
							<div class="clear"></div>
						</div>	
						<input type="submit" value="登录">
					</form>
				</div>
			</div>
			<div class="tab-1 resp-tab-content">
				<div class="login-top sign-top">
					<form action="Register.do" method="post">
						<input type="text" name="name" class="name" placeholder="姓名" required=""/>
						<input type="password" name="password" class="password" placeholder="密码" required=""/>	
						<input type="email" name="email" class="email" placeholder="邮箱" required=""/>
						<input type="text" name="phone" class="phone" placeholder="电话" required=""/>
							
						<div class="login-bottom">
							<ul>
								<li>
									<input type="checkbox" id="brand1" value="">
									<label for="brand1"><span></span>记住密码?</label>
								</li>
								<li>
									<a href="#">忘记密码?</a>
								</li>
							</ul>
							<div class="clear"></div>
						</div>
						<input type="submit" value="注册">							
					</form>
				</div>
			</div>
		</div>	
	</div>
	<div class="clear"> </div>
</div>
<div class="footer">
	<p> &copy; 2018 Classic Forms. All Rights Reserved | Design by <a href="http://w3layouts.com">guoyue</a></p>
</div>

<!-- js-scripts -->			
<!-- js -->
	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!-- //js -->
<!-- tabs -->
<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function () {
		$('#horizontalTab').easyResponsiveTabs({
			type: 'default', //Types: default, vertical, accordion           
			width: 'auto', //auto or any width like 600px
			fit: true   // 100% fit in a container
		});
	});
</script>
<!-- //tabs -->
<!-- //js-scripts -->	
</body>
</html>
