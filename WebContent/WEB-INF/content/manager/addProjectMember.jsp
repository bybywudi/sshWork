<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>经理首页</title>
</head>
<body>
<%@include file="mgrUI.jsp"%>
<div class="layui-body" id="container">
	<table class="layui-table" lay-filter="test" id="test">
		<tr><br/></tr>
		<tr><br/></tr>
		<tr><br/></tr>
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

<s:form action="addProjectMember"
	enctype="multipart/form-data">
	<s:textfield name="pmName" label="成员姓名"/>
	<s:textarea name="pmIntroduction" label="成员介绍"/>
	<s:file name="upload" label="添加照片"/>
	<s:submit value="添加"/>
</s:form>
</div>
</td>
</tr>
</table>
</div>
</body>
</html>