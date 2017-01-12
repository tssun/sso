package org.sts.sso.ticket.proxy.support;

import org.springframework.stereotype.Component;
import org.sts.sso.authentication.Credential;
import org.sts.sso.ticket.TicketGrantingTicket;
import org.sts.sso.ticket.proxy.ProxyHandler;

/**
 * Dummy ProxyHandler that does nothing. Useful for Cas 1.0 compliance as CAS
 * 1.0 has no proxying capabilities.
 *
 * @author Scott Battaglia
 * @since 3.0.0
 */
@Component("proxy10Handler")
public final class Cas10ProxyHandler implements ProxyHandler {

    @Override
    public String handle(final Credential credential,
        final TicketGrantingTicket proxyGrantingTicketId) {
        return null;
    }

    @Override
    public boolean canHandle(final Credential credential) {
        return false;
    }
}
