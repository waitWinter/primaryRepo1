<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>

	<meta charset="UTF-8" http-equiv="Content-Type" content="text/html;charset=utf-8" />

	<title>404-对不起！您访问的页面不存在</title>

	<style type="text/css">

		.head404{ width:580px; height:234px; margin:50px auto 0 auto; background:url(https://www.daixiaorui.com/Public/images/head404.png) no-repeat; }

		.txtbg404{ width:499px; height:169px; margin:10px auto 0 auto; background:url(https://www.daixiaorui.com/Public/images/txtbg404.png) no-repeat;}

		.txtbg404 .txtbox{ width:390px; position:relative; top:30px; left:60px;color:#eee; font-size:13px;}

		.txtbg404 .txtbox p {margin:5px 0; line-height:18px;}

		.txtbg404 .txtbox .paddingbox { padding-top:15px;}

		.txtbg404 .txtbox p a { color:#eee; text-decoration:none;}

		.txtbg404 .txtbox p a:hover { color:#FC9D1D; text-decoration:underline;}

	</style>

</head>



<body bgcolor="#494949">

<div class="head404"></div>

<div class="txtbg404">

	<div class="txtbox">

		<div><p><a style="cursor:pointer" onclick="history.back()">返回上一页面</a></p></div>

		<div><p><a href="${pageContext.request.contextPath}/login.jsp">返回登录首页</a></p></div>

	</div>

</div>

</body>

</html>
</html>