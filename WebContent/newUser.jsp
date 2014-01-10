<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>newUser.jsp</title>
  </head>
  
  <body>
    <s:form action="newUser.action" method="post">
    <table>
      <tr>
        <td><img src="img/dixinyinli.jpg"></td>
        <td><img src="img/jieyouxi.jpg"></td>
        <td><img src="img/leishen2.jpg"></td>
        <td><img src="img/saodu.jpg"></td>
        <td><img src="img/wurenqu.jpg"></td>
      </tr>
      <tr>
        <s:iterator value="movieList">
		  <td><s:property value="name"/></td>
		</s:iterator>
      </tr>
      <tr>
        <s:iterator status="stat" value="movieList">
          <!-- Movie name -->
          <input type="hidden" name="movieList[<s:property value='#stat.index'/>].name" value="<s:property value='name'/>"/>
          
          <td><s:radio list="#{'1':'1','2':'2','3':'3','4':'4','5':'5'}" name="movieList[%{#stat.index}].score"/></td>
        </s:iterator>
      </tr>
    </table>
    <s:submit value="确定" />
	</s:form>
	
  </body>
</html>
