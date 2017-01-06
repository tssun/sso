package org.sts.sso.web.support;


import org.sts.sso.authentication.principal.WebApplicationService;

import javax.servlet.http.HttpServletRequest;

/**
 * Strategy interface for retrieving services from the request.
 *
 * @author Scott Battatglia
 * @since 3.1
 */
public interface ArgumentExtractor {
    /**
     * Retrieve the service from the request.
     *
     * @param request the request context.
     * @return the fully formed Service or null if it could not be found.
     */
    WebApplicationService extractService(HttpServletRequest request);
}
