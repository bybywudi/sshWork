<%@ page contentType="text/html; charset=gb2312" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>ע��ϵͳ</title>
<s:head/>
</head>
<body>
<%@include file="header.jsp"%>
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
<tr>
<td>
<s:if test="actionMessages.size()>0">
<div class="error">
	<s:actionmessage/>
</div>
</s:if>
<s:actionerror cssClass="error"/>
<div align="center">
<s:form action="processRegist">
	<s:textfield name="manager.name" label="�û���"/>
	<s:textfield name="manager.pass" label="����"/>
	<s:textfield name="manager.realname" label="��ʵ����"/>
	
	<s:radio name="role" label="Ҫע����������" labelposition="top" list="#{'ѧ��':'student','��ʦ':'teacher'}" listKey="value" listValue="key"></s:radio>
	<%--<s:radio name="role" label="Ҫע����������" labelposition="top" list="#{'ѧ��':'student'}" listKey="value" listValue="key"></s:radio>--%>
	
	<s:textfield name="vercode" label="��֤��"/>
	<tr><td colspan="2">
	<s:submit value="ע��" theme="simple"/><s:reset  theme="simple" value="����"/>
	</td></tr>
</s:form>
</div>
��֤�룺<img name="d" src="authImg">
</td>
</tr>
</table>
<%@include file="footer.jsp"%>
</body>
</html>
