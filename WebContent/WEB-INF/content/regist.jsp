<%@ page contentType="text/html; charset=gb2312" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>注册系统</title>
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
<s:form action="processRegist">
	<s:textfield name="manager.name" label="用户名"/>
	<s:textfield name="manager.pass" label="密码"/>
	<s:textfield name="manager.realname" label="真实姓名"/>
	
	<s:radio name="role" label="要注册的身份类型" labelposition="top" list="#{'学生':'student','老师':'teacher'}" listKey="value" listValue="key"></s:radio>
	<%--<s:radio name="role" label="要注册的身份类型" labelposition="top" list="#{'学生':'student'}" listKey="value" listValue="key"></s:radio>--%>
	
	<s:textfield name="vercode" label="验证码"/>
	<tr><td colspan="2">
	<s:submit value="注册" theme="simple"/><s:reset  theme="simple" value="重填"/>
	</td></tr>
</s:form>
</div>
验证码：<img name="d" src="authImg">
</td>
</tr>
</table>
<%@include file="footer.jsp"%>
</body>
</html>
