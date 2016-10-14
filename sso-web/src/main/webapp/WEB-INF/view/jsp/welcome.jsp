<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spizza</title>
</head>
<body>
	<h2>欢迎来到Spizza！</h2>
	<form:form>
		<input type="hidden" name="_flowExecutorKey" 
				value="${flowExecutionKey}"/>
		<label>电话号码:</label>
		<input type="text" name="phoneNumber"/><br/>
		<br>
		<input type="submit" name="_eventId_phoneEntered"
				value="查找"/>
	</form:form>
</body>
</html>