<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
   <title>�鿴ȫ����������</title>
</head>
<body>
<%@include file="../header.jsp"%>
<%@include file="mgrheader.jsp"%>
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
<tr>
<td>
<br>
<table width="80%" border="0" align="center" 
	cellspacing="1" bgcolor="#cccccc">
  <tr bgcolor="#e1e1e1" >
	<td colspan="3" ><div class="mytitle">�����ڲ鿴ȫ����������</div></td> 
  </tr>
  <tr class="pt11" height="45">
	<td><b>��ʵ����</b></td>
	<td><b>���뱸ע</b></td>
	<td><b>����ʱ��</b></td>
  </tr>
<s:iterator value="setMgrApps" status="index">  
 	<s:if test="#index.odd == true"> 
		 <tr style="background-color:#dddddd" class="pt11" height="32">
	</s:if>  
	<s:else> 
		 <tr class="pt11" height="32">
	</s:else>
	<td><s:property value="empRealName"/></td>
	<td><s:property value="comment"/></td>
	<td><s:property value="appTime"/></td>
	<td><a href="manageSetMgr.action?empId=<s:property value="empId"/>&method=agree">ͬ��</a></td>
	<td><a href="manageSetMgr.action?empId=<s:property value="empId"/>&method=disagree">�ܾ�</a></td>
  </tr>
</s:iterator>  
</table>
</td>
</tr>
</table>
<%@include file="../footer.jsp"%>
</body>
</html>