
<%@page import="com.paner.pizza.domain.Pizza"%>
<%@page import="java.util.List"%>
<%@page import="com.paner.pizza.domain.Order"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spizza</title>
</head>
<body>
	<h2>${order.getCustomer().getName()},请开启您的披萨订单</h2>	
	<%
		Order order = (Order)request.getAttribute("order");
	    if(order.getPizzas().size()>0)
	    {
	 %>  
	  <p>  你已经选择的披萨种类：</p>
	 <%
	    }
		for(Pizza pizza : order.getPizzas())
		{
	%>
		<p>尺寸：<%=pizza.getSize() %></p>
		<p>馅料：<%=pizza.getTopping().toString() %></p>     
	<%	
		}
	
	%>
	<form:form>
		<input type="hidden" name="_flowExecutorKey" 
				value="${flowExecutionKey}"/>
		<input type="submit" name="_eventId_createPizza"
				value="请选择订购的披萨"/>
		<input type="submit" name="_eventId_checkout"
				value="付钱"/>
		<input type="submit" name="_eventId_cancel"
				value="取消订单"/>
	</form:form>
</body>
</html>