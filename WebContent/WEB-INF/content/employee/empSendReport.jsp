<%@ page contentType="text/html; charset=gb2312" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>登录系统</title>
<s:head/>
</head>
<body>
<%@include file="empheader.jsp"%>
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
<s:form action="sendReport"
	enctype="multipart/form-data">
	<s:textfield name="report.headline" label="报告标题"/>
	<s:textarea name="report.content" label="报告内容"/>
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
</body>
</html>