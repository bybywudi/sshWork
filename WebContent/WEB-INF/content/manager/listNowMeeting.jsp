<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
   <title>查看会议</title>
</head>
<body>
<%@include file="../header.jsp"%>
<%@include file="mgrheader.jsp"%>
<table width="960" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
<tr>
<td>
<br>
<s:if test="actionMessages.size()>0">
<div class="error">
	<s:actionmessage/>
</div>
</s:if>
<table width="80%" border="0" align="center" 
	cellspacing="1" bgcolor="#cccccc">
  <tr bgcolor="#e1e1e1" >
	<td colspan="3" ><div class="mytitle">您正在查看会议</div></td> 
  </tr>
  <tr class="pt11" height="45">
	<td><b><a href="toaddMeeting">创建会议</a></b></td>
  </tr>
   <tr class="pt11" height="45">
	<td><b><a href="managerListMeetingByMgrId.action?currentpage=1&pagesize=10">历史会议</a></b></td>
	<td><b><a href="managerListMeetingBefore.action?currentpage=1&pagesize=10">进行中的会议</a></b></td>
  </tr>
  <tr class="pt11" height="45">
	<td><b>会议标题</b></td>
	<td><b>报告人</b></td>
	<td><b>开始时间</b></td>
	<td><b>结束时间</b></td>
	<td><b>操作</b></td>
  </tr>
<s:iterator value="pb.list" status="index">  
 	<s:if test="#index.odd == true"> 
		 <tr style="background-color:#dddddd" class="pt11" height="32">
	</s:if> 
	<s:else> 
		 <tr class="pt11" height="32">
	</s:else>
	<td><s:property value="headline"/></td>
	<td><s:property value="studentName"/></td>
	<td><s:date format="yyyy-MM-dd HH:mm:ss" name="meetingStartTime"/></td>
	<td><s:date format="yyyy-MM-dd HH:mm:ss" name="meetingEndTime"/></td>
	<td><a href="mgrViewMeeting?id=<s:property value="id"/>">查看</a></td>
  </tr>
</s:iterator>  
<s:if test="pb.list != null">
			共<s:property value="pb.totalrecord"/>条记录,
			共<s:property value="pb.totalpage"/>页,
			当前第<s:property value="pb.currentpage"/>页
		</s:if>
		<s:if test="pb.currentpage != 1">
			<a href="managerListMeetingBefore.action?currentpage=<s:property value="pb.previouspage"/>&pagesize=10">上一页&nbsp;</a>
		</s:if>
<%-- 		<s:iterator value="pb.pagebar" id="pagenum" status="st">   --%>
<%-- 		 	<s:if test="pagenum == pb.currentpage">  --%>
<%-- 				<font color="red"><s:property value="pagenum"/>&nbsp;</font> --%>
<%-- 			</s:if> --%>
<%-- 			<s:else> --%>
<%-- 				<a href="listPatent.action?currentpage=<s:property value="pagenum"/>&pagesize=10"><s:property value="pagenum"/>&nbsp;</a> --%>
<%-- 			</s:else> --%>
<%-- 		<s:property value="pb.pagebar[st]"/> --%>
<%-- 		</s:iterator> --%>
		
			<s:if test="pb.currentpage!=pb.totalpage && pb.totalrecord!=0">
			<a href="managerListMeetingBefore.action?currentpage=<s:property value="pb.nextpage"/>&pagesize=10">下一页&nbsp;</a>
			</s:if>
 				
			<input type="text" id="pagenum" style="width: 30px">
			<input type="button" value="GO"
				onclick="gotopage(document.getElementById('pagenum').value,<s:property value="pb.currentpage"/>,<s:property value="pb.totalpage"/>)">
</table>
</td>
</tr>
</table>
<%@include file="../footer.jsp"%>
<script type="text/javascript">
	
	function gotopage(pagenum,oldvalue,totalpage){
		if(pagenum<=0 || pagenum!=parseInt(pagenum)){
			alert("请输入正整数");
			document.getElementById("pagenum").value = oldvalue;
		}else{
			if(pagenum>totalpage){
				alert("请输入页数范围内的数");
				document.getElementById("pagenum").value = oldvalue;
			}else{
				//var pagesize = 10;			
				window.location.href = 'managerListMeetingBefore.action?currentpage=' + pagenum + '&pagesize=10';
			}
		}
}
</script>
</body>
</html>