<%@ page contentType="text/html; charset=gb2312" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>��¼ϵͳ</title>
<s:head/>
</head>
<body>
<%@include file="empheader.jsp"%>
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
		<td colspan="3" ><div class="mytitle">�����ڲ鿴ȫ������</div></td>
	  </tr>
		<tr bgcolor="#e1e1e1" >
			<td colspan="3" ><div class="mytitle"><a href="empSendReport">�ύ��������</a></div></td>
		</tr>
	  <tr class="pt11" height="45">
		<td><b>����</b></td>
		<td><b>����ʱ��</b></td>
	  </tr>
	<s:iterator value="pb.list" status="index">  
	 	<s:if test="#index.odd == true"> 
			 <tr style="background-color:#dddddd" class="pt11" height="32">
		</s:if> 
		<s:else> 
			 <tr class="pt11" height="32">
		</s:else>
		<td><s:property value="headline"/></td>
		<td><s:property value="reportTime"/></td>
		<td><a href="empViewReport.action?id=<s:property value="id"/>">�鿴</a></td>
	  </tr>
	</s:iterator>  
	
	<s:if test="pb.list != null">
			��<s:property value="pb.totalrecord"/>����¼,
			��<s:property value="pb.totalpage"/>ҳ,
			��ǰ��<s:property value="pb.currentpage"/>ҳ
		</s:if>
		<s:if test="pb.currentpage != 1">
			<a href="listReportByEmpId.action?currentpage=<s:property value="pb.previouspage"/>&pagesize=10">��һҳ&nbsp;</a>
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
			<a href="listReportByEmpId.action?currentpage=<s:property value="pb.nextpage"/>&pagesize=10">��һҳ&nbsp;</a>
			</s:if>
 				
			<input type="text" id="pagenum" style="width: 30px">
			<input type="button" value="GO"
				onclick="gotopage(document.getElementById('pagenum').value,<s:property value="pb.currentpage"/>,<s:property value="pb.totalpage"/>)">
	</div>
	
	</table>
</td>
</tr>
</table>
</td>
</tr>
</table>
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
				window.location.href = 'listReportByEmpId.action?currentpage=' + pagenum + '&pagesize=10';
			}
		}
}
</script>
</body>
</html>