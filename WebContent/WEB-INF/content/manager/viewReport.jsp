<%@ page contentType="text/html; charset=gb2312" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>�鿴����</title>
<s:head/>
</head>
<body>
<%@include file="mgrheader.jsp"%>
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
	<table width="80%" border="0" align="center" 
		cellspacing="1" bgcolor="#cccccc">
	  <tr bgcolor="#e1e1e1" >
		<td colspan="3" ><div class="mytitle">�鿴����</div></td> 
	  </tr>
	 <tr style="background-color:#dddddd" class="pt11" height="32">
	 ����:<s:property value="reportBean.report.headline"/><br/>
	 </tr>
	 <tr>

	 <p>
	 ����:<s:property value="reportBean.relacedContent" escape="false"/>
	 </p><br/>
	 </tr>
	<tr>
	����:<a href="download.action?id=<s:property value="reportBean.upfile.id"/>"><s:property value="reportBean.upfile.fileName"/></a>
	</tr>
	</tr>
	</table>
</td>
</tr>
</table>
</td>
</tr>
</table>
</body>
</html>