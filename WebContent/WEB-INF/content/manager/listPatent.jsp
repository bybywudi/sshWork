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
		<td><a href="listProjectMember.action">项目成员管理</a></td>
		<td><a href="listAchievement.action">成果综述管理</a></td>
		<td><a href="listPaper.action?currentpage=1&pagesize=10">论文成果管理</a></td>
		<td><a href="listPatent.action?currentpage=1&pagesize=10">专利成果管理</a></td>
		</tr>
		<tr>
		<td><div align="center"><a href="addPatentmanage">增加专利成果</a></div></td>
		</tr>
		
		 <s:iterator value="pb.list" status="index">  
		 	<s:if test="#index.odd == true"> 
				 <tr style="background-color:#dddddd" class="pt11" height="32">
			</s:if> 
			<s:else> 
				 <tr class="pt11" height="32">
			</s:else>
			
			<td width="80%"><s:property value="description"/></td>
			<td width="10%"><a href="toEditFile?id=<s:property value="id"/>">编辑</a></td>
			<td width="10%"><a href="deletePaperFile?id=<s:property value="id"/>">删除</a></td>
		  </tr>
		</s:iterator>  
  <tr height="60">
	<td>&nbsp;</td>
  </tr>
</table>
<%@include file="../footer.jsp"%> 
</body>
</html>