<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ʵ���ҳɹ�չʾ</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
</head>
<body id="top">
<div class="wrapper">
  <div id="header">
    <h1><a href="index.html">MCCʵ����</a></h1>
    <p>��Ȼ��ѧ����ɹ�չʾ</p>
  </div>
</div>

<!-- ####################################################################################################### -->
<div class="wrapper">
  <div id="topbar">
    <div class="fl_left">Tel: xxxxx xxxxxxxxxx | Mail: info@domain.com</div>
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
<!-- ####################################################################################################### -->
<div class="wrapper">
  <div id="topnav">
    <ul class="nav">
      <li class="active"><a href="index.jsp">��ҳ</a></li>
      <li><a href="style-demo.html">��Ŀ��Ա</a></li>
      <li><a href="full-width.html">�ɹ�����</a></li>
      <li><a href="viewListPaper.action?currentpage=1&pagesize=10&mgrId=4">���ĳɹ�</a></li>
      <li class="last"><a href="gallery.html">��ϵ����</a></li>
    </ul>
    <div class="clear"></div>
  </div>
</div>
<!-- ####################################################################################################### -->
    <div id="hpage_latest">
      <ul>
        <li>
          <div class="imgholder"><a href="#"><img src="images/1.jpg" width="260" height="180" alt="" /></a></div>
          <p><strong>Lorum ipsum dolor</strong></p>
          <p>Orciint erdum condimen terdum nulla mcorper elit nam curabitur laoreet met prae senean et iac ulum. Metridiculis cons eque quis iaculum aenean nunc aenean.</p>
        </li>
        <li>
          <div class="imgholder"><a href="#"><img src="images/2.jpg" width="260" height="180" alt="" /></a></div>
          <p><strong>Lorum ipsum dolor</strong></p>
          <p>Orciint erdum condimen terdum nulla mcorper elit nam curabitur laoreet met prae senean et iac ulum. Metridiculis cons eque quis iaculum aenean nunc aenean.</p>
        </li>
        <li class="last">
          <div class="imgholder"><a href="#"><img src="images/3.jpg" width="260" height="180" alt="" /></a></div>
          <p><strong>Lorum ipsum dolor</strong></p>
          <p>Orciint erdum condimen terdum nulla mcorper elit nam curabitur laoreet met prae senean et iac ulum. Metridiculis cons eque quis iaculum aenean nunc aenean.</p>
        </li>
      </ul>
      <br class="clear" />
    </div>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper">
  <div id="footer">
    <div class="latestgallery">
      <h2>Latest Projects</h2>
      <ul>
        <li><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>
        <li><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>
        <li><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>
        <li class="last"><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>
        <li><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>
        <li><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>
        <li><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>
        <li class="last"><a href="#"><img src="images/demo/80x80.gif" alt="" /></a></li>
      </ul>
    </div>
    <div class="footbox">
      <h2>Latest From The Blog</h2>
      <ul>
        <li><a href="#">Lorem ipsum dolor</a></li>
        <li><a href="#">Suspendisse in neque</a></li>
        <li><a href="#">Praesent et eros</a></li>
        <li><a href="#">Lorem ipsum dolor</a></li>
        <li><a href="#">Suspendisse in neque</a></li>
        <li class="last"><a href="#">Praesent et eros</a></li>
      </ul>
    </div>
    <div class="footbox last">
      <h2>Keep In Touch</h2>
      <ul>
        <li><a href="#">Lorem ipsum dolor</a></li>
        <li><a href="#">Suspendisse in neque</a></li>
        <li><a href="#">Praesent et eros</a></li>
        <li><a href="#">Lorem ipsum dolor</a></li>
        <li><a href="#">Suspendisse in neque</a></li>
        <li class="last"><a href="#">Praesent et eros</a></li>
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->

<script type="text/javascript" src="scripts/superfish.js"></script>
<script type="text/javascript">
jQuery(function () {
    jQuery('ul.nav').superfish();
});
</script>
</body>
</html>