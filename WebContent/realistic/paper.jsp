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
<div class="wrapper">

        <h2>���ĳɹ�</h2>
        <table summary="Summary Here" cellpadding="0" cellspacing="0">
          <thead>
            <tr>
              <th width="75%">����</th>
              <th width="25%">�ļ�����</th>
            </tr>
          </thead>
          <tbody>
	      	 <s:iterator value="pb.list" status="index">  
			  <tr class="light">
				<td width="75%"><s:property value="description"/></td>
				<td width="25%"><a href="download.action?id=<s:property value="id"/>"><s:property value="fileName"/></a></td>
			  </tr>
			 </s:iterator>  
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