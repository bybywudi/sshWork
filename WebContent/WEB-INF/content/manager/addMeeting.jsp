
<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>增加会议</title>
<s:head/>
</head>
<body>
<%@include file="mgrUI.jsp"%>
<div class="layui-body" id="container">
	<table class="layui-table" lay-filter="test" id="test">
		<tr><br/></tr>
		<tr><br/></tr>
		<tr><br/></tr>
<tr>
<td>
<s:if test="actionMessages.size()>0">
<div class="error">
	<s:actionmessage/>
</div>
</s:if>
<s:form action="addMeeting">
	<s:textfield name="headline" label="会议标题"/>
	<s:textarea name="content" label="会议主要内容"/>
	<s:textarea name="studentName" label="汇报人"/>
	<tr><td colspan="2">
	<s:submit value="提交" theme="simple"/>
	<s:reset  theme="simple" value="重新输入"/>
	</td></tr>
</s:form>

</td>
</tr>
</table>
</div>
</body>
</html>
