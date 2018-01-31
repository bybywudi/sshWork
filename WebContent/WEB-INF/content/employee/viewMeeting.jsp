<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查看会议</title>
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
		<td colspan="3" ><div class="mytitle">查看会议</div></td> 
	  </tr>
	 <tr style="background-color:#dddddd" class="pt11" height="32">
	 标题:<s:property value="lmb.meeting.headline"/><br/>
	 </tr>
	 <tr>
	 <p>
	 内容:<s:property value="lmb.meeting.content" escape="false"/>
	 </p><br/>
	 </tr>
	 
	  <tr>
	 	<a href="toreportToMeeting?id=<s:property value="lmb.meeting.id"/>"><input type="button" value="我要汇报"></a>
	 </tr>
	<tr class="pt11" height="45">
		<th width="75%"><b>标题</b></th>
		<th width="20%"><b>汇报人</b></th>
		<th width="5%"><b>操作</b></th>
    </tr>
	<s:iterator value="lmb.files" status="index">  
	 	<s:if test="#index.odd == true"> 
			 <tr style="background-color:#dddddd" class="pt11" height="32">
		</s:if> 
		<s:else> 
			 <tr class="pt11" height="32">
		</s:else>
		<td><s:property value="file.url"/></td>
		<td><s:property value="userName"/></td>
		<td><a href="empViewFile?id=<s:property value="file.id"/>"><input type="button" value="查看"></a></td>
	  </tr>
	</s:iterator>  
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