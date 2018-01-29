<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>老师首页</title>
</head>
<body>
<%@include file="../header.jsp"%> 
<%@include file="empheader.jsp"%>
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
<td>
<s:actionerror cssClass="error"/>
<div align="center">
<s:form action="empeditFile">
	<s:textarea name="description" value="%{upfile.description}" label="文件描述"/>
	<s:textarea name="url" value="%{upfile.url}" label="文件标题"/>
    <s:textarea name="fileName" value="%{upfile.fileName}" label="文件名（必须加后缀，如.txt）"/>
	<s:hidden name="id" value="%{upfile.id}"/>
	<s:submit value="修改"/>
</s:form>
</div>
</td>
</tr>
</table>
</body>
</html>