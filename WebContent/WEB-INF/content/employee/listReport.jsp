<%@ page contentType="text/html; charset=gb2312" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>��¼ϵͳ</title>
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
	<table width="80%" border="0" align="center" 
		cellspacing="1" bgcolor="#cccccc">
	  <tr bgcolor="#e1e1e1" >
		<td colspan="3" ><div class="mytitle">�����ڲ鿴ȫ������</div></td> 
	  </tr>
	  <tr class="pt11" height="45">
		<td><b>����</b></td>
		<td><b>����ʱ��</b></td>
	  </tr>
	<s:iterator value="pb.list" status="index">  
	 	<s:if test="#index.odd == true"> 
			 <tr style="background-color:#dddddd" class="pt11" height="32">
		</s:if> 
		<s:else> 
			 <tr class="pt11" height="32">
		</s:else>
		<td><s:property value="headline"/></td>
		<td><s:property value="reportTime"/></td>
		<td><a href="empViewReport.action?id=<s:property value="id"/>">�鿴</a></td>
	  </tr>
	</s:iterator>  
	
	
	</table>
</td>
</tr>
</table>
</td>
</tr>
</table>
</body>
</html>