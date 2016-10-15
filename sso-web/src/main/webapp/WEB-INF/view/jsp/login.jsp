<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login view</title>
</head>
<body>
<h2>you will login</h2>
<form:form>
    <input type="hidden" name="_flowExecutionKey"
           value="${flowExecutionKey}"/>
    <input type="text" name="phoneNumber"/><br/>
    <input type="submit" name="_eventId_cancel" value="取消" />
</form:form>
</body>
</html>
