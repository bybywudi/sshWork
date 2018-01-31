<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
   <title>查看全部加入申请</title>
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
<br>
<table class="layui-table">
  <tr bgcolor="#e1e1e1" >
	<td colspan="3" ><div class="mytitle">您正在查看全部加入申请</div></td> 
  </tr>
  <tr class="pt11" height="45">
	<td><b>真实姓名</b></td>
	<td><b>申请备注</b></td>
	<td><b>申请时间</b></td>
  </tr>
<s:iterator value="setMgrApps" status="index">  
 	<s:if test="#index.odd == true"> 
		 <tr style="background-color:#dddddd" class="pt11" height="32">
	</s:if>  
	<s:else> 
		 <tr class="pt11" height="32">
	</s:else>
	<td><s:property value="empRealName"/></td>
	<td><s:property value="comment"/></td>
	<td><s:property value="appTime"/></td>
	<td><a href="manageSetMgr.action?empId=<s:property value="empId"/>&method=agree"><input type="button" value="同意"></a></td>
	<td><a href="manageSetMgr.action?empId=<s:property value="empId"/>&method=disagree"><input type="button" value="拒绝"></a></td>
  </tr>
</s:iterator>  
</table>
</td>
</tr>
</table>
</div>
</body>
</html>