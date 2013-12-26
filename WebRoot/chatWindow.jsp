<%@ page language="java" import="java.util.*,com.huang.util.Massage" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'chatWindow.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <% 
  	List<Massage> list=(List<Massage>)application.getAttribute("masage");
  	if (list==null)
  	{
  		out.println("没有人发表内容");
  	}
  	else{
  		for (Massage m:list)
  		{
  		  out.println(m.getName());
  		  out.println(m.getContent());
  		}
  	}
  	
  %>
  <form action="servlet/ChatServlet" method="post">
  <label>
    <textarea name="content" id="textarea" cols="45" rows="10"></textarea>
    <br />
  </label>
  <label>
   姓名 <input name="name" id="name" />
    <br />
  </label>
  <input name="submit" type="submit" value="发表" id="submit" />
</form>
  
  </body>
</html>
