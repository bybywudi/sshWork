<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>报告</title>
<s:head/>
</head>
<body>
<%@include file="empUI.jsp"%>
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
<s:form action="sendReport"
	enctype="multipart/form-data">
	<s:textfield name="report.headline" label="报告标题"/>
	<s:textarea name="report.content" cols="100" rows="10" label="报告内容"/>
	添加文件（可选）：<br/>
	<s:file name="upload" label="选择文件"/>
	<s:fielderror/>
	<s:textarea name="description" label="文件描述"/>
	<s:submit value="发送报告"/>
</s:form>
</div>
</td>
</tr>
</table>
</div>
</body>
</html>