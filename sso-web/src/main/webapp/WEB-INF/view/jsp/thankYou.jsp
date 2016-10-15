<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head><title>Spring Pizza</title></head>

<h2>Thank you for your order!</h2>

<form:form>
    <input type="hidden" name="_flowExecutionKey"
           value="${flowExecutionKey}"/>
    <input type="submit" name="_eventId_finished" value="完成"/>
</form:form>
</body>
</html>
