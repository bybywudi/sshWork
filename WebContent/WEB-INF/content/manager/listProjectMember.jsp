<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>项目成员管理</title>
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
		<td width="94"><div align="center"><a href="listAll.action">项目成员管理</a></div></td>
		<td width="139"><div align="center"><a href="viewEmp.action">成果综述管理</a></div></td>
		<td width="139"><div align="center"><a href="listPaper.action?currentpage=1&pagesize=10">论文成果管理</a></div></td>
		</tr>
		<tr>
		<td width="94"><div align="center"><a href="toaddProjectMember">增加项目成员</a></div></td>
		</tr>
		
		 <s:iterator value="pms" status="index">  

			<s:property value="pm.name"/><br/>
			<s:property value="pm.introduction"/><br/>
			<a href="download.action?id=<s:property value="upfile.id"/>"><s:property value="upfile.fileName"/></a><br/>

		</s:iterator>  
  <tr height="60">
	<td>&nbsp;</td>
  </tr>
</table>
<%@include file="../footer.jsp"%> 
</body>
</html>
