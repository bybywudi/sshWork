<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>table模块快速使用</title>
	<link rel="stylesheet" href="./plugins/layui/css/layui.css" media="all">
</head>

<body>
<%@include file="index.1.jsp"%>
<div class="layui-body" id="container">
	<table class="layui-table" lay-filter="test" id="test">
		<thead>
		<th>
			查看会议
		</th>
		<tr>
			<td>会议标题</td>
			<td>报告人</td>
			<td>开始时间</td>
			<td>结束时间</td>
			<td>操作</td>
		</tr>
		<s:iterator value="pb.list" status="index">
			<tr>
				<td><s:property value="headline"/></td>
				<td><s:property value="studentName"/></td>
				<td><s:date format="yyyy-MM-dd HH:mm:ss" name="meetingStartTime"/></td>
				<td><s:date format="yyyy-MM-dd HH:mm:ss" name="meetingEndTime"/></td>
				<td><a href="empViewMeeting?id=<s:property value="id"/>">查看</a></td>
			</tr>
		</s:iterator>
		</thead>
	</table>
</div>
<script src="./plugins/layui/layui.js"></script>
<script>
    layui.use('table', function() {
        var table = layui.table;
    });
</script>
</body>

</html>