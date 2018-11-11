<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>花卉管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="${pageContext.request.contextPath }/css/general.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/main.css"
	rel="stylesheet" type="text/css" />

<style type="text/css">
body {
	color: white;
}
</style>
</head>
<body style="background: #278296">
	<center></center>
	<form method="post"
		action="${pageContext.request.contextPath }/user/login.html"
		target="_parent" name='theForm' onsubmit="return validate()">
		<table cellspacing="0" cellpadding="0" style="margin-top: 100px"
			align="center">
			<tr>
				<td style="padding-left: 50px">
					<table>
						<tr>
							<td>账号：</td>
							<td><input type="text" name="username" /></td>
						</tr>
						<tr>
							<td>密码：</td>
							<td><input type="password" name="password" /></td>
						</tr>
						<tr>
							<td colspan="2"><span style="color: red;">${error }</span></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td><input type="submit" value="登录" class="button" /> <input
								type="button" onclick="register();" value="注册" class="button" /></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
	
</body>
<script>
		function register()
		{
			window.location.href = '${pageContext.request.contextPath}/admin/register.jsp'
		}
	</script>