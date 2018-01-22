<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>实验室成果展示</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="imagetoolbar" content="no" />
     <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
      <script src="https://code.jquery.com/jquery.js"></script>
      <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body id="top">
<div class="wrapper">
	
  <div id="header">
  	<div class="imgholder"><img src="images/xidian.png" width="100" height="100" alt="" /></div>
  	
    <h1>国家自然科学基金项目成果展示</h1>
    <p>项目名称（编号）：非凸二次规划问题的低秩半定规划处理方法研究及其在信号处理中的应用（61372135）</p>
  </div>
</div>

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

<!--  
<div class="wrapper">
  <div id="footer">
    <div class="latestgallery">
      <h2>西安电子科技大学</h2>
      <ul>  
        	<li><img src="images/xidianp1.jpg" width="100" height="100" alt="" /></li>
      </ul>
    </div>
    <div class="footbox last">
	   <h2>项目介绍</h2>
		 <p>普通半定松弛技术存在的主要缺点是没有对矩阵变量的秩进行约束，当半定规划中包含大量的限定条件时，其最优解往往为高秩矩阵。而矩阵的高秩特征使得在获得原非凸二次规划问题的有效解时困难重重。在本项目中我们重点研究了基于矩阵秩函数启发式策略和直接对矩阵变量秩进行限制的两种低秩半定松弛方法。此外，中/小规模的半定规划可以由经典的内点算法有效求解。然而对于大规模半定规划，内点算法的计算复杂度在工程中将变得难以应用。以低秩分解为代表的一阶算法虽然对于低秩半定规划可以快速求解，然而对于包含不等式限定条件的低秩半定规划，它会破坏原半定规划的低秩结构，算法效率大打折扣。而在处理信号处理问题中，应用低秩松弛技术得到的半定规划中往往包含大量的不等式限定条件，这使得常规半定规划一阶算法效能极为低下。因而在本项目研究内容中，我们研究了能够保持半定规划低秩结构，并基于拟牛顿迭代和增广拉格朗日函数方法相结合的低复杂度求解方法。</p>
    </div>-->
   <!--  
    <div class="footbox">
      <h2>论文成果</h2>
      	 <s:iterator value="pbpaper.list">  
			<div class="zxx_text_overflow">
			     <s:property value="description"/><br/>
			</div>
		</s:iterator> 
    </div>
    <div class="footbox last">
	   <h2>专利成果</h2>
		    <s:iterator value="pbpatent.list">  
			   <div class="zxx_text_overflow">
			        <s:property value="description"/><br/>
			   </div>
			</s:iterator>
    </div>

    <br class="clear" />
  </div>
</div>

 
<div class="wrapper">
  <div class="container">
    <div class="whitebox">
     
      <h1>成果综述</h1>
     
      <p>${requestScope.content}</p>
      

      <div class="clear"></div>
    </div>
  </div>
</div>

-->
<div id="templatemo_content_wrapper">

	<div id="templatemo_sidebar">
    
    	<div class="sidebar_box">
        	
            <h2>最近的成果</h2>
            <s:iterator value="pbpaper.list" status="index"> 
	             <div class="news_box">
	                <a href="<s:property value="url"/>"><div class="zxx_text_overflow"><s:property value="description"/></div></a>
	                <p class="post_info"><span>管理员</span>上传于<span><s:property value="upTime"/></span></p>
	            </div> 
			 </s:iterator>  

        
        </div><div class="sidebar_box_bottom"></div>
    
        <div class="sidebar_box">
			
            <h2>给我们留言</h2>
         
            <div id="show">
              	 请留言并留下您的联系方式
			</div>
             <!--  
            <form action="#" method="get">
            <label>请您在下方输入框留言并输入您的联系方式</label>
            <input type="text" value="" name="username" size="10" id="input_field" title="usernmae" />
            <input type="submit" name="login" value="Subscribe" alt="login" id="submit_btn" title="Login" />
            </form>-->
            
		<s:form id="form1">
			<s:textarea name="mcontent" cssStyle="border:hidden; size:50px; width:200px;height:50px"/>
			<tr><td colspan="2">
			<input type="button" value="提交" onclick="gotClick();"/>
			</td></tr>
		</s:form>

            <div class="cleaner"></div>
        
        </div><div class="sidebar_box_bottom"></div>
    
    </div> <!-- end of sidebar -->
    
    <div id="templatemo_content">
    
    	<div class="content_box">
        
        	<h2>项目介绍</h2>
            
            <p>普通半定松弛技术存在的主要缺点是没有对矩阵变量的秩进行约束，当半定规划中包含大量的限定条件时，其最优解往往为高秩矩阵。而矩阵的高秩特征使得在获得原非凸二次规划问题的有效解时困难重重。在本项目中我们重点研究了基于矩阵秩函数启发式策略和直接对矩阵变量秩进行限制的两种低秩半定松弛方法。此外，中/小规模的半定规划可以由经典的内点算法有效求解。然而对于大规模半定规划，内点算法的计算复杂度在工程中将变得难以应用。以低秩分解为代表的一阶算法虽然对于低秩半定规划可以快速求解，然而对于包含不等式限定条件的低秩半定规划，它会破坏原半定规划的低秩结构，算法效率大打折扣。而在处理信号处理问题中，应用低秩松弛技术得到的半定规划中往往包含大量的不等式限定条件，这使得常规半定规划一阶算法效能极为低下。因而在本项目研究内容中，我们研究了能够保持半定规划低秩结构，并基于拟牛顿迭代和增广拉格朗日函数方法相结合的低复杂度求解方法。</p>
            
 <div class="cleaner_h20"></div>

<div class="image_fl">  
       
  <div id="myCarousel" class="carousel slide" style="width:330px">
    <!-- 轮播（Carousel）指标 -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
		<li data-target="#myCarousel" data-slide-to="3"></li>
		<li data-target="#myCarousel" data-slide-to="4"></li>
        <li data-target="#myCarousel" data-slide-to="5"></li>
        <li data-target="#myCarousel" data-slide-to="6"></li>
		<li data-target="#myCarousel" data-slide-to="7"></li>
		<li data-target="#myCarousel" data-slide-to="8"></li>
		<li data-target="#myCarousel" data-slide-to="9"></li>
    </ol>   
    <!-- 轮播（Carousel）项目 -->
    <div class="carousel-inner">
        <div class="item active">
            <img src="images/白露.jpg" alt="First slide">
        </div>
        <div class="item">
            <img src="images/处暑.jpg" alt="Second slide">
        </div>
        <div class="item">
            <img src="images/春分.jpg" alt="Third slide">
        </div>
		<div class="item">
            <img src="images/大寒.jpg" alt="Forth slide">
        </div>
		<div class="item">
            <img src="images/大暑.jpg" alt="Forth slide">
        </div>
		<div class="item">
            <img src="images/谷雨.jpg" alt="Forth slide">
        </div>
		<div class="item">
            <img src="images/寒露.jpg" alt="Third slide">
        </div>
		<div class="item">
            <img src="images/惊蛰.jpg" alt="Forth slide">
        </div>
		<div class="item">
            <img src="images/立春.jpg" alt="Forth slide">
        </div>
		<div class="item">
            <img src="images/立秋.jpg" alt="Forth slide">
        </div>
    </div>
</div>
</div>         

						
	      
          
           
            
            <div class="section_w250 float_r">
            	<div class="section_w250 float_l">
				<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们的研究<br/></h3>    
            	</div>	
            	<ul class="list_01">
                   	  <li>·大规模MIMO信源与中继联合预编码优化建模与低复杂度求解方法</li>
                      <li>·大规模干扰对齐优化问题的低复杂度求解方法</li>
                      <li>·大规模MIMO信号检测优化建模与低复杂度求解方法</li>
                      <li>·OFDM信号峰平比优化问题建模与低秩求解方法</li>
                      <li>·MIMO雷达恒模探测波形优化问题及求解方法</li>
                      <li>·DF中继网络中的机会信道接入优化方法和策略研究</li>
              </ul>
            
            </div>
        
        	<div class="cleaner"></div>
        </div><div class="content_box_bottom"></div>
        
        <div class="content_box">
        
        	<h2>联系我们</h2>
            
            <div class="section_w250 float_l">
				<h3></h3>            
				<p>Tel:029-88202816<br/>email:ychwang@mail.xidian.edu.cn<br/></p>
            
            </div>  
            
            <div class="section_w250 float_r">
				<h3></h3>            
				<p>地址：西安市太白南路2号西安电子科技大学主楼1区325</p>
            
            </div>            
           
        
        	<div class="cleaner"></div>
        </div><div class="content_box_bottom"></div>
    
    </div> <!-- end of content -->
    
    <div class="cleaner"></div>

</div>


<script type="text/javascript" src="scripts/superfish.js"></script>

<script type="text/javascript">
$(function(){

    $('#myCarousel').carousel({
       interval: 3000
    })
   // 初始化轮播
    $("#myCarousel").carousel('cycle');

});

jQuery(function () {
    jQuery('ul.nav').superfish();
});



$(".zxx_text_overflow").each(function(){
	  var maxwidth=160;
	  if($(this).text().length > maxwidth){
	    $(this).text($(this).text().substring(0,maxwidth));
	    $(this).html($(this).html()+'...');
	  }
	});


function gotClick()
{
	$("#show").hide();
	$("#show").html("");  
	// 指定向JSONExample发送请求，将id为form1的表单所包含的表单控件转换为请求参数
	$.post("addMessage" , $("#form1").serializeArray() , 
		// 指定回调函数
		function(data , statusText)
		{
			// 遍历JavaScript对象的各属性
			for(var propName in data)
			{
				
				$("#show").append(data[propName] + "<br />");
			}
			$("#show").show(600);
			
		},
		// 指定服务器响应为JSON数据
		"json");
}


</script>
</body>
</html>