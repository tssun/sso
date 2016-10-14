<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spizza</title>
</head>
<body>
	<h2>客户注册</h2>
	<form:form commandName="customers">
		<input type="hidden" name="_flowExecutorKey" 
				value="${flowExecutionKey}"/>
		<label>电话号码:</label>
		<form:input type="text" path="phoneNumber"/><br/><br/>
		<label>名字  ：</label>&nbsp;
		<form:input type="text" path="name"/><br/><br/>
		<label>地址  ：</label>&nbsp;
		<form:input path="address" /><br/><br/>
		<label>城市  ：</label>&nbsp;
		<form:input path="city" /><br/><br/>
		<label>状态  ：</label>&nbsp;
		<form:input path="state" /><br/><br/>
		<label>邮政编码：</label>
		<form:input path="zipCode" /><br/><br/>
		<input type="submit" name="_eventId_submit"
				value="注册"/>
		<input type="submit" name="_eventId_cancel"
				value="取消"/>
	</form:form>
</body>
</html>