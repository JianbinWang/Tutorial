<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>
  </head>
  
  <body>
    HelloWorld!
    <s:form action="/login.action" >
	<!--
	<s:textfield name="operand1" label="A new User"/>
	<s:select list="#{1:'男',2:'女'}" listKey="key" listValue="value" value="2" />
	-->
	<s:radio list="#{'newUser':'A new user','oldUser':'An old user'}" label="User Type" name="userType" value="'newUser'"/>
	<s:submit value="确定" />
	</s:form>
  </body>
</html>
