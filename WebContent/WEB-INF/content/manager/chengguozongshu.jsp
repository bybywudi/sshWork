<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>������ҳ</title>
</head>
<body>
<%@include file="../header.jsp"%> 
<%@include file="mgrheader.jsp"%> 
<table width="960" align="center" 
	background="images/bodybg.jpg">
  <tr height="60">
	<td>&nbsp;</td>
  </tr>
  <tr>
	<td>
<s:if test="actionMessages.size()>0">
<div class="error">
	<s:actionmessage/>
</div>
</s:if>
	</td>
  </tr>
		<tr>
		<td width="94"><div align="center"><a href="listAll.action">��Ŀ��Ա����</a></div></td>
		<td width="139"><div align="center"><a href="viewEmp.action">�ɹ���������</a></div></td>
		<td width="139"><div align="center"><a href="listPaper.action?currentpage=1&pagesize=10">���ĳɹ�����</a></div></td>
		</tr>
		<tr>
		<td width="94"><div align="center"><a href="zengjiachengguomanage">���ӳɹ�</a></div></td>
		</tr>
		
		 <s:iterator value="pb.list" status="index">  
		 	<s:if test="#index.odd == true"> 
				 <tr style="background-color:#dddddd" class="pt11" height="32">
			</s:if> 
			<s:else> 
				 <tr class="pt11" height="32">
			</s:else>
			
			<td width="200"><s:property value="description"/></td>
			<td width="130"><a href="download.action?id=<s:property value="id"/>"><s:property value="fileName"/></a></td>
			<td width="50"><a href="">ɾ��</a></td>
		  </tr>
		</s:iterator>  
  <tr height="60">
	<td>&nbsp;</td>
  </tr>
</table>
<%@include file="../footer.jsp"%> 
</body>
</html>
