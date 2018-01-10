<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">

<html>
 <head>
  
  <title>最简单的轮播广告</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
  <style>
    #frame{height:700px;width: 350px; overflow:hidden;}
    #photos img{float:left;width:350px;height:300px;}
    #photos {z-index:9;  width: calc(350px * 10);/*---修改图片数量的话需要修改下面的动画参数*/}
    .play{ animation: ma 20s ease-out infinite alternate;}
    @keyframes ma {
        0%,10% {        margin-left: 0px;       }
        10%,20% {       margin-left: -350px;    }
        20%,30% {       margin-left: -700px;    }
        30%,40% {       margin-left: -1050px;    }
		40%,50% {       margin-left: -1400px;    }
		50%,60% {       margin-left: -1750px;    }
		60%,70% {       margin-left: -2100px;    }
		70%,80% {       margin-left: -2450px;    }
		80%,90% {       margin-left: -2800px;    }
		90%,100% {       margin-left: -3150px;    }

    }
</style>
 </head>
 <body>
<div id="frame">
    <div id="photos" class="play">
        <img src="images/大寒.jpg" >
        <img src="images/白露.jpg" >
        <img src="images/春分.jpg" >
        <img src="images/处暑.jpg" >
		<img src="images/大暑.jpg" >
        <img src="images/谷雨.jpg" >
        <img src="images/寒露.jpg" >
        <img src="images/惊蛰.jpg" >
		<img src="images/立春.jpg" >
        <img src="images/立秋.jpg" >
    </div>
</div>
 </body>
 </html>