<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>汇报</title>
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
<s:actionerror cssClass="error"/>
<div align="center">
<s:form action="managershareFile"
	enctype="multipart/form-data">
	<s:file name="upload" label="选择文件(大小不能超过9M)"/>
	<s:textarea name="description" cols="100" rows="5" label="简单描述"/>
	<s:fielderror/>
	<s:submit value="分享"/>
</s:form>
</div>
</td>
</tr>
</table>
</div>
</body>
</html>