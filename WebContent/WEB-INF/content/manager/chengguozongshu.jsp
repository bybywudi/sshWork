<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>������ҳ</title>
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
		<td><div align="center"><a href="listProjectMember.action">��Ŀ��Ա����</a></div></td>
		<td><div align="center"><a href="listAchievement.action">�ɹ���������</a></div></td>
		<td><div align="center"><a href="listPaper.action?currentpage=1&pagesize=10">���ĳɹ�����</a></div></td>
		<td><div align="center"><a href="listPatent.action?currentpage=1&pagesize=10">ר���ɹ�����</a></div></td>
		</tr>
		<tr>
		<td width="94"><div align="center"><a href="zengjiachengguomanage">���ӳɹ�</a></div></td>
		</tr>
		
		 <s:iterator value="pb.list" status="index">  
		 	<s:if test="#index.odd == true"> 
				 <tr style="background-color:#dddddd" class="pt11" height="32">
			</s:if> 
			<s:else> 
				 <tr class="pt11" height="32">
			</s:else>
			
			<td width="35%"><s:property value="description"/></td>
			<td width="20%"><s:property value="urlName"/></td>
			<td width="25%"><a href="download.action?id=<s:property value="id"/>"><s:property value="fileName"/></a></td>
			<td width="10%"><a href="toEditFile?id=<s:property value="id"/>">�༭</a></td>
			<td width="10%"><a href="deletePaperFile?id=<s:property value="id"/>">ɾ��</a></td>
		  </tr>
		</s:iterator>  
		
		<s:if test="pb.list != null">
			��<s:property value="pb.totalrecord"/>����¼,
			��<s:property value="pb.totalpage"/>ҳ,
			��ǰ��<s:property value="pb.currentpage"/>ҳ
		</s:if>
		<s:if test="pb.currentpage != 1">
			<a href="listPaper.action?currentpage=<s:property value="pb.previouspage"/>&pagesize=10">��һҳ&nbsp;</a>
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
			<a href="listPaper.action?currentpage=<s:property value="pb.nextpage"/>&pagesize=10">��һҳ&nbsp;</a>
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
			alert("������������");
			document.getElementById("pagenum").value = oldvalue;
		}else{
			if(pagenum>totalpage){
				alert("������ҳ����Χ�ڵ���");
				document.getElementById("pagenum").value = oldvalue;
			}else{
				//var pagesize = 10;			
				window.location.href = 'listPaper.action?currentpage=' + pagenum + '&pagesize=10';
			}
		}
}
</script>
</body>
</html>
