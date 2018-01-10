<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>实验室成果展示</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
</head>
<body id="top">
<div class="wrapper">
	
 <div id="header">
 
  	<div class="imgholder"><img src="images/xidian.png" width="100" height="100" alt="" /></div>
  	
    <h1>国家自然科学基金项目成果展示</h1>
    <p>项目名称（编号）：非凸二次规划问题的低秩半定规划处理方法研究及其在信号处理中的应用（61372135）</p>
  </div>
<!-- ####################################################################################################### -->
<!--  
<div class="wrapper">
  <div id="topbar">
    <div class="fl_left">Tel:029-88202816 | Mail: ychwang@mail.xidian.edu.cn</div>
    <div class="fl_right">
      <form action="#" method="post">
        <fieldset>
          <legend>Site Search</legend>
          <input type="text" value="Search Our Website&hellip;"  onfocus="this.value=(this.value=='Search Our Website&hellip;')? '' : this.value ;" />
          <input type="submit" name="go" id="go" value="Search" />
        </fieldset>
      </form>
    </div>
    <br class="clear" />
  </div>
</div>
-->
<!-- ####################################################################################################### -->
<div class="wrapper">
  <div id="topnav">
    <ul class="nav">
      <li class="active"><a href="index.action?mgrId=1">首页</a></li>
      <li><a href="viewListProjectMember.action?mgrId=1">项目成员</a></li>
      <li><a href="viewListAchievement.action?mgrId=1">成果综述</a></li>
      <li><a href="viewListPaper.action?currentpage=1&pagesize=100&mgrId=1">论文成果</a></li>
      <li><a href="viewListPatent.action?currentpage=1&pagesize=100&mgrId=1">专利成果</a></li>
      <li class="last"><a href="communication">国内外学术合作交流</a></li>
      <li class="last"><a href="talents">人才培养</a></li>
    </ul>
    <div class="clear"></div>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper2">

        <h2></h2>
        <table summary="Summary Here" cellpadding="0" cellspacing="0">
          <thead>
            <tr>
              <th width="10%">姓名</th>
			  <th width="20%">学位</th>
			  <th width="18%">入学时间</th>
			  <th width="18%">毕业时间</th>
			  <th width="34%">毕业去向</th>
            </tr>
          </thead>
          <tbody>
          	<tr class="light">
			 	<td>董蕾</td>
				<td>博士研究生</td>
				<td>2010.9</td>
				<td>2015.9</td>
				<td>华为（上海）2012实验室</td>
			</tr>
			<tr class="light">
			 	<td>薛瑄</td>
				<td>博士研究生</td>
				<td>2012.2</td>
				<td>2017.9</td>
				<td>西安电子科技大学</td>
			</tr>
          	<tr class="light">
			 	<td width="12%">陈冉</td>
				<td width="18%">硕士研究生</td>
				<td width="20%">2012.9</td>
				<td width="20%">2014.12</td>
				<td width="30%">北京兴唐通信科技有限公司</td>
			</tr>
          	<tr class="light">
			 	<td width="12%">陈光明</td>
				<td width="18%">硕士研究生</td>
				<td width="20%">2013.9</td>
				<td width="20%">2015.12</td>
				<td width="30%">中兴（西安）</td>
			</tr>
          	<tr class="light">
			 	<td width="12%">程帅</td>
				<td width="18%">硕士研究生</td>
				<td width="20%">2013.9</td>
				<td width="20%">2015.12</td>
				<td width="30%">中国电子科技集团28研究所</td>
			</tr>
          	<tr class="light">
			 	<td width="12%">王林强</td>
				<td width="18%">硕士研究生</td>
				<td width="20%">2013.9</td>
				<td width="20%">2015.12</td>
				<td width="30%">腾讯（深圳）</td>
			</tr>
          	<tr class="light">
			 	<td width="12%">寇辰光</td>
				<td width="18%">硕士研究生</td>
				<td width="20%">2014.9</td>
				<td width="20%">2017.6</td>
				<td width="30%">中国电子科技集团54研究所</td>
			</tr>
          	<tr class="light">
			 	<td width="12%">杜婷</td>
				<td width="18%">硕士研究生</td>
				<td width="20%">2014.9</td>
				<td width="20%">2017.6</td>
				<td width="30%">深圳海能达</td>
			</tr>
			<tr class="light">
			 	<td width="12%">万新杰</td>
				<td width="18%">硕士研究生</td>
				<td width="20%">2014.9</td>
				<td width="20%">2017.6</td>
				<td width="30%">中兴（西安）</td>
			</tr>
			<tr class="light">
			 	<td width="12%">余毅</td>
				<td width="18%">硕士研究生</td>
				<td width="20%">2014.9</td>
				<td width="20%">2017.6</td>
				<td width="30%">华为（西安）</td>
			</tr>
          </tbody>
        </table>
      </div>
 
<script type="text/javascript" src="scripts/superfish.js"></script>
<script type="text/javascript">
jQuery(function () {
    jQuery('ul.nav').superfish();
});
</script>
</body>
</html>