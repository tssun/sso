<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>login view</title>
</head>
<body>
<h2>登录</h2>
    <form:form>
        <input type="hidden" name="_flowExecutionKey"
               value="${flowExecutionKey}"/>
        <input type="submit" name="_eventId_cancel" value="取消" />
    </form:form>
</body>
</html>
