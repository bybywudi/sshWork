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
		<td><div align="center"><a href="listProjectMember.action">��Ŀ��Ա����</a></div></td>
		<td><div align="center"><a href="listAchievement.action">�ɹ���������</a></div></td>
		<td><div align="center"><a href="listPaper.action?currentpage=1&pagesize=10">���ĳɹ�����</a></div></td>
		<td><div align="center"><a href="listPatent.action?currentpage=1&pagesize=10">ר���ɹ�����</a></div></td>
		</tr>
<tr>
<td>
<s:actionerror cssClass="error"/>
<div align="center">

<s:form action="addPatent"
	enctype="multipart/form-data">
	<s:file name="upload" label="����ļ�"/>
	<s:textarea name="description" label="�ļ�����"/>
	<s:submit value="���"/>
</s:form>
</div>
</td>
</tr>
</table>
</body>
</html>