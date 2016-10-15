<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <title>结束</title>
</head>
<body>
<h2>结束</h2>
    <form:form>
        <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
        <input type="submit" name="_eventId_finished" value="结束"/>
    </form:form>
</body>
</html>
