<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查看报告</title>
<s:head/>
</head>
<body>
<%@include file="empUI.jsp"%>
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
<s:actionerror cssClass="error"/>
	<table width="80%" border="0" align="center" 
		cellspacing="1" bgcolor="#cccccc">
	  <tr bgcolor="#e1e1e1" >
		<td colspan="3" ><div class="mytitle">查看报告</div></td> 
	  </tr>
	 <tr style="background-color:#dddddd" class="pt11" height="32">
	 标题:<s:property value="reportBean.report.headline"/><br/>
	 </tr>
	 <tr>

	 <p>
	 内容:<s:property value="reportBean.relacedContent" escape="false"/>
	 </p><br/>
	 </tr>
	<tr>
	附件:<a href="download.action?id=<s:property value="reportBean.upfile.id"/>"><s:property value="reportBean.upfile.fileName"/></a>
	</tr>
	</tr>
	</table>
</td>
</tr>
</table>
</td>
</tr>
</table>
</div>
</body>
</html>