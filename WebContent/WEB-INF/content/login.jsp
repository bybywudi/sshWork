<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录系统</title>
<s:head/>
</head>
<body>
<%@include file="header.jsp"%>
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
<tr>
<td>
<s:if test="actionMessages.size()>0">
<div class="error">
	<s:actionmessage/>
</div>
</s:if>
<s:actionerror cssClass="error"/>
<div align="center">
<s:form action="processLogin">
	<s:textfield name="manager.name" label="用户名"/>
	<s:textfield name="manager.pass" label="密码"/>
	<!--<s:textfield name="vercode" label="验证码"/>-->
	<tr><td colspan="2">
	<s:submit value="登录" theme="simple"/><s:reset  theme="simple" value="重填"/>
	</td></tr>
</s:form>
</div>
<!--  验证码：<img name="d" src="authImg">-->
</td>
</tr>
</table>
<%@include file="footer.jsp"%>
</body>
</html>
