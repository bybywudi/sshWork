<%--
网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2012, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html; charset=gb2312"%>
<table width="960" border="0" align="center"
	background="${pageContext.request.contextPath}/images/bodybg.jpg">
	<tr>
	<!-- 
		<td><div align="center"><a href="employeePunch.action">打卡</a></div></td>
		<td><div align="center"><a href="viewUnPunch.action">查看打卡异动</a></div></td>
		<td><div align="center"><a href="viewemployeeSalary.action">查看历史工资</a></div></td>
	-->
		<s:if test="#session.userbean.manager==null">
		<td><div align="center"><a href="viewMgr.action">查看所有老师</a></div></td>
		您必须先申请成为一个老师的学生才能开始使用系统！！！老师申请后不能变更，请慎重！！
		</s:if>
		<s:else>
		<td><div align="center"><a href="employeesharedFile.action?currentpage=1&pagesize=10">文件共享</a></div></td>
		<td><div align="center"><a href="listReportByEmpId.action?currentpage=1&pagesize=10">查看报告</a></div></td>
		<td><div align="center"><a href="employeeListMeetingByMgrId.action?currentpage=1&pagesize=10">会议列表</a></div></td>
		<td><div align="center"><a href="http://39.106.194.129:8080/sshWork/realistic/index.action?mgrId=1">实验室成果展示</a></div></td>
		<td><div align="center"><a href="logout.action">退出系统</a></div></td>
		</s:else>
	</tr>
</table>	

