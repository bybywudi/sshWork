<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>项目成员管理</title>
</head>
<body>
<%@include file="mgrUI.jsp"%>
<div class="layui-body" id="container">
	<table class="layui-table" lay-filter="test" id="test">
		<tr><br/></tr>
		<tr><br/></tr>
		<tr><br/></tr>

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
		<td width="94"><div align="center"><a href="toaddProjectMember">增加项目成员</a></div></td>
		</tr>
		
		 <s:iterator value="pms" status="index">  

			<s:property value="pm.name"/><br/>
			<s:property value="pmIntroduction" escape="false"/><br/>
			<img src="<s:property value="fsavePath"/>"/><br/>
			<a href="deleteProjectMember?id=<s:property value="pm.id"/>">删除</a><br/>

		</s:iterator>  
  <tr height="60">
	<td>&nbsp;</td>
  </tr>
</table>
</div>
</body>
</html>
