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
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>���Ӵ�</title>
</head>
<body>
<%@include file="../header.jsp"%> 
<%@include file="empheader.jsp"%> 
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
  <tr>
	<td colspan="3"><br/><br/><div class="mytitle">���Ӵ�ϵͳ</div></td>
  </tr>
  <tr>
	<td colspan="3" style="text-align : center;">
		<br/>
<!-- ��punchIsValidΪ1��3ʱ�����ϰ�� -->
<s:if test="punchIsValid==1 
	|| punchIsValid==3">
<s:form action="employeeCome" theme="simple">
	<s:submit value="�ϰ��"/>
</s:form>
</s:if>
<!-- ��punchIsValidΪ2��3ʱ�����°�� -->	
<s:if test="punchIsValid==2
	|| punchIsValid==3">
<s:form action="employeeLeave" theme="simple">
	<s:submit value="�°��"/>
</s:form>
</s:if>
<br/>
	</td>
  </tr>
</table>
<%@include file="../footer.jsp"%> 
</body>
</html>
