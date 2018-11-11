<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>首页</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/CSSInit.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/top.css"/>
	</head>
	<body>
		<div class="top">
			<div class="top-page">
				<div class="top-page-l fl" >
					<font color="white">
						您好！欢迎来到花卉网
					</font>
				</div>
				 <div class="fr top-page-r ">
						<ul>
							<li><a href="${pageContext.request.contextPath }/admin/index.jsp">登录</a></li>
							<li><a href="${pageContext.request.contextPath }/admin/register.jsp">注册</a></li>
						</ul>
					</div>
				
			</div>	
		</div>
		<!--分界-->
		<div class="logo">
			<h1 class="logo-l fl">花卉商贸</h1>
			<div class="fr logo-r ">
				<div class="logo-r-content">
					<input type="input" class="logo-r-searche fl" value="请输入关键字" />
				<input type="button" onclick="login()" value="搜索" class="logo-r-btn fl" />
				</div>
			</div>
		</div>
		<!--导航-->
		<!--次级导航及广告-->
		<div class="banner ">
			<div class="subnav fl">
				<h2>花卉市场</h2>
				<ul>
					<li><a href="${pageContext.request.contextPath }/admin/index.jsp">郁金香</a></li>
					<li><a href="${pageContext.request.contextPath }/admin/index.jsp">康乃馨</a></li>
					<li><a href="${pageContext.request.contextPath }/admin/index.jsp">玫瑰</a></li>
					<li><a href="${pageContext.request.contextPath }/admin/index.jsp">玫瑰</a></li>
					<li><a href="${pageContext.request.contextPath }/admin/index.jsp">玫瑰</a></li>
					<li><a href="${pageContext.request.contextPath }/admin/index.jsp">玫瑰</a></li>
				</ul>
			</div>
			<div class="ad fl">
				
			</div>
		</div>
	<!--......fenjie......-->	
	
		<div class="metrial">
			精心挑选
		</div>
		<!--页面主要内容-->
		<div class="product">
			<div id="product-l" class="fl">
				<div class="product-l ">
					<div class="product-l-top">
						<div class="product-l-product1 fl">
							<div class="buy fl">
								<div class="img gg1">
									<s></s>
								</div>
								<input type="button" onclick="login();" value="立即购买" class="btn" />
							</div>
							<div class="explain fl">
								<p class="goodwife" >情人节玫瑰&nbsp;
								赠人玫瑰&nbsp;手有余香
								</p>
								<p class="auto">情人节特价&nbsp;新鲜摘取<br />香气扑鼻&nbsp;祝表白成功</p>
								<p class="money"><span>￥239.00</span>	&nbsp;&nbsp; <s >￥386.00</s >	</p>
								<p class="buyed">库存99朵，已购20朵</p>	
							</div>
						</div>
						<div class="product-l-product1 fl">
							<div class="buy fl">
								<div class="img gg2">
									<s></s>
								</div>
								<input type="button" onclick="login();" value="立即购买" class="btn" />
							</div>
							<div class="explain fl">
								<p class="goodwife" >情人节玫瑰&nbsp;
								赠人玫瑰&nbsp;手有余香
								</p>
								<p class="auto">情人节特价&nbsp;新鲜摘取<br />香气扑鼻&nbsp;祝表白成功</p>
								<p class="money"><span>￥239.00</span>	&nbsp;&nbsp; <s >￥386.00</s >	</p>
								<p class="buyed">库存99朵，已购20朵</p>	
							</div>
						</div>
						
						
					</div>	
						
				</div>	
				<div class="product-l ">
					<div class="product-l-top">
						<div class="product-l-product1 fl">
							<div class="buy fl">
								<div class="img gg3">
									<s></s>
								</div>
								<input type="button" onclick="login();" value="立即购买" class="btn" />
							</div>
							<div class="explain fl">
								<p class="goodwife" >香水百合</p>
								<p class="auto">买买买<br />买买买</p>
								<p class="money"><span>￥99.00</span>	&nbsp;&nbsp; <s >￥477.00</s >	</p>
								<p class="buyed">库存100朵，已购51朵</p>	
							</div>
						</div>
						<div class="product-l-product1 fl">
							<div class="buy fl">
								<div class="img gg4">
									<s></s>
								</div>
								<input type="button" onclick="login();" value="立即购买" class="btn" />
							</div>
							<div class="explain fl">
								<p class="goodwife" >香水百合</p>
								<p class="auto">买买买<br />买买买</p>
								<p class="money"><span>￥99.00</span>	&nbsp;&nbsp; <s >￥477.00</s >	</p>
								<p class="buyed">库存100朵，已购51朵</p>	
							</div>
						</div>
					
					</div>	
				</div>		
			</div>		
		</div>	
	
<!--友情链接-->
		
		<div class="flink">
		</div>
		<!--关于我们-->
		<div class="aboutus">
			<p>关于我们 | 关于他们 | 关于你们 | 关于花卉商贸</p>
			<p>本站网络实名： 花卉商贸</p>
		</div>
	</body>
	<script type="text/javascript">
		function login() {
			window.location.href="${pageContext.request.contextPath }/admin/index.jsp"
		}
	</script>
</html>
