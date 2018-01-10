<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>经理首页</title>
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
		<td><div align="center"><a href="listProjectMember.action">项目成员管理</a></div></td>
		<td><div align="center"><a href="listAchievement.action">成果综述管理</a></div></td>
		<td><div align="center"><a href="listPaper.action?currentpage=1&pagesize=10">论文成果管理</a></div></td>
		<td><div align="center"><a href="listPatent.action?currentpage=1&pagesize=10">专利成果管理</a></div></td>
		</tr>
<tr>
<td>
<s:actionerror cssClass="error"/>
<div align="center">
<s:form action="editFile">
	<s:textarea name="description" value="%{upfile.description}" label="文件标题"/>
	<s:textarea name="url" value="%{upfile.url}" label="文件连接"/>
	<s:textarea name="urlName" value="%{upfile.urlName}" label="给这个链接起个名字"/>
	<s:hidden name="id" value="%{upfile.id}"/>
	<s:submit value="修改"/>
</s:form>
</div>
</td>
</tr>
</table>
</body>
</html>