<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <title>������ʾҳ</title>
	<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body>
<%@include file="header.jsp"%> 
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
<tr> 
<td height="39"><br>
<div align="center"><font color="#FF0000" size="+1"><b>ϵͳ��������з�����һ��������Ϣ���£�</b></font></div>
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
�����Ⱥ˶����룬����ٴγ��ָô������¼<a href="http//www.crazyit.org">http//www.crazyit.org</a>Ѱ��𰸣�лл��
</div><br></td>
</tr>
</table>
<%@include file="footer.jsp"%> 
</body>
</html>

