<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="<%=path %>/css/base.css" type="text/css" />
	<link rel="stylesheet" href="<%=path %>/css/dtree.css" type="text/css" />
	<style type="text/css">
	    div {
			padding:0px;
			margin:0px;
		}
		
		body {
		 scrollbar-base-color:#bae87c;
		 scrollbar-arrow-color:#FFFFFF;
		 scrollbar-shadow-color:#c1ea8b;
		 padding:0px;
		 margin:auto;
		 text-align:center;
		 background-color:#ffffff;
		 background:url(images/bg.gif);
		}
		
		.bitem {
		  background:url(images/side_snow.gif);
		  height:26px;
		  line-height:26px;
		  text-align:center;
		  cursor:pointer;
		  background-repeat: no-repeat;
		  margin-top:0px;
			
		}
		.title{
			margin-left:2px;
			background:url(images/menubg.gif);
			background-repeat:no-repeat;
			text-align:center;
			cursor:pointer;
			height:26px;
		  	line-height:26px;
	</style>
	<script language='javascript'>var curopenItem = '1';</script>
	<script language="javascript" type="text/javascript" src="js/menu.js"></script>
	<base target="main" />
  </head>
  <body target="main">
  	
  	
  	
  	    <div class='title'>ѧ����Ϣ</div><br>
    	<div class='bitem'>
  		   <a href='<%=path %>/studentInfo.do' target='main'>ѧ����Ϣ����</a>
  	    </div><br>
  
  	
  		<div class='title'>ѧ���ɼ�</div><br>
  		<div class='bitem'>
  		   <a href='<%=path %>/StudentgradeInfo.do' target='main'>ѧ���ɼ�����</a>
  		</div><br>
  		<div class='bitem'>
  	       <a href='<%=path %>/StudentGradeAdd.do' target='main'>ѧ���ɼ�¼��</a>
        </div><br>
  	
  
  		<div class='title'>�γ�</div><br/>
  		<div class='bitem'>
  		    <a href='<%=path %>/FindAllCourseInfo' target='main'>�γ̹���</a>
  		</div><br>
  		<div class='bitem'>
  	        <a href='<%=path %>/courseAdd' target='main'>�γ�¼��</a>
     	</div><br>
  	
  	
  		<div class='title'>ͨ��</div><br>
  		<div class='bitem'>
  		   <a href='<%=path %>/NoticeInfo' target='main'>ͨ����Ϣ����</a>
  		</div><br>
  		<div class='bitem'>
  		   <a href='<%=path %>/ForwardAddNotice' target='main'>���ͨ��</a>
     	</div><br>
     	
  
  		<div class='title'>����Ա�˺�</div><br>
  		<div class='bitem'>
  		   <a href='<%=path %>/AdminInfo' target='main'>����Ա�˺Ź���</a>
  		</div><br>
  		<div class='bitem'>
  		<a href='<%=path %>/UpdataAdmin' target='main'>�޸�����</a>		
     	</div><br>
     	
  </body>
</html>