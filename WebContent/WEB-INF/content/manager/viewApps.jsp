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
   <title>��������</title>
</head>
<body>
<s:if test="actionMessages.size()>0">
<div class="error">
	<s:actionmessage/>
</div>
</s:if>
<%@include file="../header.jsp"%>
<%@include file="mgrheader.jsp"%>
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
<tr>
<td><br>
<table width="80%" border="0" align="center" bgcolor="#cccccc">
  <tr bgcolor="#e1e1e1" >
	<td colspan="5" ><div class="mytitle">��������</div></td> 
  </tr>
  <tr class="pt11" height="45">
	<td><b>Ա����</b></td>
	<td><b>ȱ������</b></td>
	<td><b>��������</b></td>
	<td><b>����</b></td>
	<td>&nbsp;</td>
  </tr>
<s:iterator value="apps" status="index">	
 	<s:if test="#index.odd == true"> 
		 <tr style="background-color:#cccccc" class="pt11" height="32">
	</s:if> 
	<s:else> 
		 <tr class="pt11" height="32">
	</s:else>
	<td><s:property value="emp"/></td>
	<td><s:property value="unAttend"/></td>
	<td><s:property value="toAttend"/></td>
	<td><s:property value="reason"/></td>
	<td>
	<a href='check.action?result=pass&appid=<s:property value="id"/>'>ͨ��</a>&nbsp;&nbsp;
	<a href='check.action?result=deny&appid=<s:property value="id"/>'>�ܾ�</a>
	</td>
  </tr>
</s:iterator>
</table>
</td>
</tr>
</table>
<%@include file="../footer.jsp"%>
</body>
</html>