<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>首页</title>
	<link rel="stylesheet" href="./plugins/layui/css/layui.css" media="all">
</head>
<body>
<%--<%@include file="../header.jsp"%> --%>
<s:if test="#session.level == 'emp'">
    <%@include file="empUI.jsp"%>
</s:if>
<s:if test="#session.level == 'mgr'">
    <%@include file="mgrUI.jsp"%>
</s:if>
<div class="layui-body" id="container">
<table width="960" align="center" 
	 background="${pageContext.request.contextPath}/images/bodybg.jpg">
  <tr height="60">
	<td>&nbsp;</td>
  </tr>
  <tr>
	<td>
		<s:if test="actionMessages.size()>0">
		<div class="error">
			<s:actionmessage/>
		</div>
		</s:if>
	</td>
  </tr>
  <tr height="80">
	<td>&nbsp;</td>
  </tr>
  <tr>
	<td>
	<s:property value="#session.userbean.realname"/>
	，欢迎您，您是学生</td>
  </tr>
  <tr height="60">
	<td>&nbsp;</td>
  </tr>
</table>
</div>
<script src="./plugins/layui/layui.js"></script>
<script>
    layui.use('table', function() {
        var table = layui.table;
    });
</script>
</body>
</html>
