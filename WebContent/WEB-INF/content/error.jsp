<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <title>出错提示页</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<%@include file="header.jsp"%> 
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
<tr> 
<td height="39"><br>
<div align="center"><font color="#FF0000" size="+1"><b>系统处理过程中发生了一个错误，信息如下：</b></font></div>
</td>
</tr>
<tr>
<td height="315">
<div class="pt11" style="color:red;width:600px;height:300px;
	border:1px solid black;border-radius:10px">
<s:property value="exception.message"/>
</td>
</tr>
<tr>
<td><div align="center" style="font:large;color:#333333">
如果再次出现该错误，请联系baiyangwd@163.com，谢谢。
</div><br></td>
</tr>
</table>
<%@include file="footer.jsp"%> 
</body>
</html>

