<%@ page contentType="text/html; charset=gb2312" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>汇报</title>
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
<s:form action="reportToMeeting"
	enctype="multipart/form-data">
	<s:hidden name="id" value="%{mid}"/>
	<s:textarea name="url" label="汇报标题"/>
	<s:textarea name="description" cols="100" rows="5" label="简单叙述"/>
	<s:file name="upload" label="选择文件"/>
	<s:fielderror/>
	<s:submit value="发送报告"/>
</s:form>
</div>
</td>
</tr>
</table>
</body>
</html>