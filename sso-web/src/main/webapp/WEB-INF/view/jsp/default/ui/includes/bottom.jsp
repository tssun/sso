<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

</div> <!-- END #content -->

<footer>
  <div id="copyright" class="container">
    <p><spring:message code="copyright" /></p>
        <p>Powered by <a href="http://www.apereo.org/cas">
            Apereo Central Authentication Service <%=org.sts.sso.SsoVersion.getVersion()%></a>
            <%=org.sts.sso.SsoVersion.getDateTime()%></p>
  </div>
</footer>

</div> <!-- END #container -->

<script src="https://cdnjs.cloudflare.com/ajax/libs/headjs/1.0.3/head.min.js"></script>
<script src="http://cdn.bootcss.com/jquery/3.1.1/jquery.js"></script>
<spring:theme code="cas.javascript.file" var="casJavascriptFile" text="" />
<script type="text/javascript" src="<c:url value="${casJavascriptFile}" />"></script>

</body>
</html>

