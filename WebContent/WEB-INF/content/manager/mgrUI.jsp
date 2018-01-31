<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>KIT ADMIN</title>
    <link rel="stylesheet" href="/myhtml/plugins/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="http://cdn.bootcss.com/font-awesome/4.6.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/myhtml/build/css/app.css" media="all">
    <link rel="stylesheet" href="/myhtml/build/css/themes/light.css" media="all">
</head>
<body>
    <div class="layui-layout layui-layout-admin kit-layout-admin ">
        <div class="layui-header">
            <div class="layui-logo">MCC实验室</div>
            <div class="layui-logo kit-logo-mobile">K</div>
            <ul class="layui-nav layui-layout-left kit-nav" kit-one-level>
                <li class="layui-nav-item"><a href="javascript:;">学生列表</a></li>
                <li class="layui-nav-item"><a href="javascript:;">实验室成果展示</a></li>
            </ul>
            <ul class="layui-nav layui-layout-right kit-nav">
                <li class="layui-nav-item">
                    <a href="javascript:;">
                        <img src="" class="layui-nav-img"> <s:property value="#session.userbean.realname"/>
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">基本资料</a></dd>
                        <dd><a href="javascript:;">安全设置</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="logout.action"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a></li>
            </ul>
        </div>

        <div class="layui-side layui-bg-black kit-side">
            <div class="layui-side-scroll">
                <div class="kit-side-fold"><i class="fa fa-navicon" aria-hidden="true"></i></div>
                <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
                <ul class="layui-nav layui-nav-tree" lay-filter="kitNavbar" kit-navbar>
                    <li class="layui-nav-item layui-nav-itemed">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 会议</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="managerListMeetingByMgrId.action?currentpage=1&pagesize=10" kit-target data-options="{url:'test.html',icon:'&#xe6c6;',title:'表格',id:'1'}">
                                    <i class="layui-icon">&#xe6c6;</i><span> 历史会议</span></a>
                            </dd>
                            <dd>
                                <a href="managerListMeetingBefore.action?currentpage=1&pagesize=10" data-url="form.html" data-icon="fa-user" data-title="表单" kit-target data-id='2'><i class="fa fa-user" aria-hidden="true"></i><span> 进行中的会议</span></a>
                            </dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item layui-nav-itemed">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 学生报告</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="listReportByMgrId.action?currentpage=1&pagesize=10" kit-target data-options="{url:'test.html',icon:'&#xe6c6;',title:'表格',id:'1'}">
                                    <i class="layui-icon">&#xe6c6;</i><span> 报告列表</span></a>
                            </dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item layui-nav-itemed">
                        <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 文件共享</span></a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="managertoaddSharedFile.action" kit-target data-options="{url:'test.html',icon:'&#xe6c6;',title:'表格',id:'1'}">
                                    <i class="layui-icon">&#xe6c6;</i><span> 分享文件</span></a>
                            </dd>
                            <dd>
                                <a href="manageruserFile.action?currentpage=1&pagesize=10" data-url="form.html" data-icon="fa-user" data-title="表单" kit-target data-id='2'>
                                    <i class="fa fa-user" aria-hidden="true"></i><span>我的文件</span></a>
                            </dd>
                            <dd>
                                <a href="managersharedFile.action?currentpage=1&pagesize=10" data-url="form.html" data-icon="fa-user" data-title="表单" kit-target data-id='2'>
                                    <i class="fa fa-user" aria-hidden="true"></i><span>所有文件</span></a>
                            </dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item layui-nav-itemed">
                        <a href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 实验室管理</span></a>
                        <dl class="layui-nav-child">
                            <dd><a href="listAll.action" kit-target data-options=""><i class="layui-icon">&#xe658;</i><span> 查看申请</span></a></dd>
                            <dd><a href="viewEmp.action" kit-target data-options=""><i class="layui-icon">&#xe658;</i><span> 管理学生</span></a></dd>
                            <dd><a href="listMessage.action?currentpage=1&pagesize=10" kit-target data-options=""><i class="layui-icon">&#xe658;</i><span> 查看留言</span></a></dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item layui-nav-itemed">
                        <a href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 项目展示网站管理</span></a>
                        <dl class="layui-nav-child">
                            <dd><a href="listProjectMember.action" kit-target data-options=""><i class="layui-icon">&#xe658;</i><span> 项目成员管理</span></a></dd>
                            <dd><a href="listAchievement.action" kit-target data-options=""><i class="layui-icon">&#xe658;</i><span> 成果综述管理</span></a></dd>
                            <dd><a href="listPaper.action?currentpage=1&pagesize=10" kit-target data-options=""><i class="layui-icon">&#xe658;</i><span> 论文成果管理</span></a></dd>
                            <dd><a href="listPatent.action?currentpage=1&pagesize=10" kit-target data-options=""><i class="layui-icon">&#xe658;</i><span> 专利成果管理</span></a></dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item layui-nav-itemed">
                        <a href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 其他工具</span></a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:;" kit-target data-options="{url:'navbar.html',icon:'&#xe658;',title:'Navbar',id:'6'}"><i class="layui-icon">&#xe658;</i><span> github</span></a></dd>
                            <dd><a href="javascript:;" kit-target data-options="{url:'tab.html',icon:'&#xe658;',title:'TAB',id:'7'}"><i class="layui-icon">&#xe658;</i><span> 百度一下</span></a></dd>
                            <dd><a href="javascript:;" kit-target data-options="{url:'onelevel.html',icon:'&#xe658;',title:'OneLevel',id:'50'}"><i class="layui-icon">&#xe658;</i><span> 谷歌翻译</span></a></dd>
                            <dd><a href="javascript:;" kit-target data-options="{url:'app.html',icon:'&#xe658;',title:'App',id:'8'}"><i class="layui-icon">&#xe658;</i><span>谷歌学术</span></a></dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;" data-url="/components/table/table.html" data-name="table" kit-loader><i class="fa fa-plug" aria-hidden="true"></i><span>使用帮助</span></a>
                    </li>
                </ul>
            </div>
        </div>

        <div class="layui-body" id="container">
            <!-- 内容主体区域 -->
            <%--<div style="padding: 15px;"></div>--%>
        </div>

        <div class="layui-footer">
            <!-- 底部固定区域 -->
            2018 &copy;
            <a href="">MCClib</a>

        </div>
    </div>

    <script src="/myhtml/plugins/layui/layui.js"></script>
    <script>
        var message;
        layui.config({
            base: '/myhtml/build/js/'
        }).use(['app', 'message'], function() {
            var app = layui.app,
                $ = layui.jquery,
                layer = layui.layer;
            //将message设置为全局以便子页面调用
            message = layui.message;
            //主入口
            app.set({
                type: 'iframe'
            }).init();
            $('#pay').on('click', function() {
                layer.open({
                    title: false,
                    type: 1,
                    content: '<img src="/myhtml/build/images/pay.png" />',
                    area: ['500px', '250px'],
                    shadeClose: true
                });
            });
        });
    </script>
</body>

</html>