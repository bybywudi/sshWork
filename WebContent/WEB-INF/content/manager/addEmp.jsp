<%--
��վ: <a href="http://www.crazyit.org">���Java����</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2012, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html; charset=gb2312" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>������Ա��</title>
<s:head/>
</head>
<body>
<%@include file="../header.jsp"%> 
<%@include file="mgrheader.jsp"%> 
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
<tr>
<td>
����������Ա�������ϣ�<br>
<s:if test="actionMessages.size()>0">
<div class="error">
	<s:actionmessage/>
</div>
</s:if>
<div align="center">
<s:form action="processAdd">
	<s:textfield name="emp.name" label="Ա���û���"/>
	<s:textfield name="emp.pass" label="Ա������"/>
	<s:textfield name="emp.salary" label="Ա����н"/>
	<s:textfield name="emp.realname" label="Ա����ʵ����"/>
	<s:token/>
	<tr><td colspan="2">
	<s:submit value="�����Ա��" theme="simple"/>
	<s:reset  theme="simple" value="��������"/>
	</td></tr>
</s:form>
</div>
</td>
</tr>
</table>
<%@include file="../footer.jsp"%> 
</body>
</html>
