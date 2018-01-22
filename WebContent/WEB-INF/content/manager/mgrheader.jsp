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
	<td><div align="center"><a href="listAll.action">查看申请</a></div></td>
	<td><div align="center"><a href="viewEmp.action">管理学生</a></div></td>
	<td><div align="center"><a href="managersharedFile.action?currentpage=1&pagesize=10">文件共享</a></div></td>
	<td><div align="center"><a href="listReportByMgrId.action?currentpage=1&pagesize=10">查看报告</a></div></td>
	<td><div align="center"><a href="managerListMeetingByMgrId.action?currentpage=1&pagesize=10">会议列表</a></div></td>
	<td><div align="center"><a href="manageHtml">成果展示管理</a></div></td>
	<td><div align="center"><a href="listMessage.action?currentpage=1&pagesize=10">查看留言</a></div></td>
	<td><div align="center"><a href="logout.action">退出系统</a></div></td>
	</tr>
</table>	

