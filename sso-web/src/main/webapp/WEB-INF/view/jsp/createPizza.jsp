<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spizza</title>
</head>
<body>
	<h2>制作披萨</h2>
	<form:form commandName="pizza">
		<input type="hidden" name="_flowExecutionKey" 
			value="${flowExecutionKey} }" />
		<label>尺寸：</label><br>
		<form:radiobutton path="size" label="小（12英尺）" value="SMALL"/>
		<form:radiobutton path="size" label="中等（14英尺）" value="MEDIUM"/>	
		<form:radiobutton path="size" label="大（16英尺） " value="LARGE"/>	
		<form:radiobutton path="size" label="巨无霸（20英尺）" value="GINORMOUS"/>		
		
		<br>
		<br>
		<label>馅料：</label><br>
		<form:checkboxes path="topping" items="${toppingList}" 
					delimiter="<br/>"/><br><br>
		<input type="submit" class="button" 
				name="_eventId_addPizza" value="继续"/>
		<input type="submit" class="button"
				 name="_eventId_cancek" value="取消"/>
		</form:form>
</body>
</html>