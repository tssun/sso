<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spizza</title>
</head>
<body>
	<h2>请为您的披萨付款</h2>
	<form:form commandName="paymentDetails">
		<input type="hidden" name="_flowExecutionKey" 
			value="${flowExecutionKey} }" />
	
		<label>支付方式：</label><br>
		<form:radiobuttons path="paymentType" items="${paymentTypeList}" 
					/><br><br>
		<input type="submit" class="button" 
				name="_eventId_paymentSubmitted" value="付款"/>
		<input type="submit" class="button"
				 name="_eventId_cancek" value="取消"/>
		</form:form>
</body>
</html>