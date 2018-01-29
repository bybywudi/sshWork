<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>老师首页</title>
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
<td>
<s:actionerror cssClass="error"/>
<div align="center">
<s:form action="editMeeting">
	<s:textarea name="headline" value="%{meeting.headline}" label="会议标题"/>
	<s:textarea name="content" value="%{meeting.content}" label="会议内容"/>
	<s:textarea name="studentName" value="%{meeting.studentName}" label="报告人"/>
	<s:hidden name="id" value="%{meeting.id}"/>
	<s:submit value="修改"/>
</s:form>
</div>
</td>
</tr>
</table>
</body>
</html>