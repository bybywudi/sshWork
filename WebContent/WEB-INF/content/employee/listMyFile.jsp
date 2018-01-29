<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>经理首页</title>
</head>
<body>
<%@include file="../header.jsp"%> 
<%@include file="empheader.jsp"%>
<table width="80%" border="0" align="center"
       cellspacing="1" bgcolor="#cccccc">
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
			 <tr class="pt11" height="45">
				 <td><a href="employeetoaddSharedFile.action">分享文件</a></td>
			 </tr>
			 <tr class="pt11" height="45">
				 <td><a href="employeeuserFile.action?currentpage=1&pagesize=10">我的文件</a></td>
				 <td><a href="employeesharedFile.action?currentpage=1&pagesize=10">所有文件</a></td>
			 </tr>

			 <tr class="pt11" height="45">
				 <td><b>文件来源</b></td>
				 <td><b>文件名</b></td>
				 <td><b>操作</b></td>
			 </tr>
		<s:iterator value="pb.list" status="index">
			<s:if test="#index.odd == true">
				<tr style="background-color:#dddddd" class="pt11" height="32">
			</s:if>
			<s:else>
				<tr class="pt11" height="32">
			</s:else>
			<td width="10%"><s:property value="source"/></td>
			<td width="75%"><s:property value="file.fileName"/></td>
			<td width="15%"><a href="download.action?id=<s:property value="file.id"/>">下载</a>
				<a href="emptoEditFile?id=<s:property value="file.id"/>">编辑</a>
				<a href="empdeleteFile?id=<s:property value="file.id"/>">删除</a></td>
		  </tr>
		</s:iterator>  
		
		<s:if test="pb.list != null">
			共<s:property value="pb.totalrecord"/>条记录,
			共<s:property value="pb.totalpage"/>页,
			当前第<s:property value="pb.currentpage"/>页
		</s:if>
		<s:if test="pb.currentpage != 1">
			<a href="employeeuserFile.action?currentpage=<s:property value="pb.previouspage"/>&pagesize=10">上一页&nbsp;</a>
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
			<a href="employeeuserFile.action?currentpage=<s:property value="pb.nextpage"/>&pagesize=10">下一页&nbsp;</a>
			</s:if>
 				
			<input type="text" id="pagenum" style="width: 30px">
			<input type="button" value="GO"
				onclick="gotopage(document.getElementById('pagenum').value,<s:property value="pb.currentpage"/>,<s:property value="pb.totalpage"/>)">
  <tr height="60">
	<td>&nbsp;</td>
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
				window.location.href = 'employeeuserFile.action?currentpage=' + pagenum + '&pagesize=10';
			}
		}
}
</script>
</body>
</html>
