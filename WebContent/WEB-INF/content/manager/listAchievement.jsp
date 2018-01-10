<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>成果综述</title>
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
			<a href="toEditAchievement.action">编辑</a><br/>
			标题：${requestScope.articleBean.aTitle}<br/>
			内容：${requestScope.articleBean.aContent}<br/>
		</tr>

</table>
<%@include file="../footer.jsp"%> 
</body>
</html>
