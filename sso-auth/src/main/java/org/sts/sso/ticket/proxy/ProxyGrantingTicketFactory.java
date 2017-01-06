package org.sts.sso.ticket.proxy;

import org.sts.sso.authentication.Authentication;
import org.sts.sso.ticket.ServiceTicket;
import org.sts.sso.ticket.TicketFactory;

/**
 * The {@link ProxyGrantingTicketFactory} is responsible for
 * creating instances of {@link ProxyGrantingTicket}.
 *
 * @author Misagh Moayyed
 * @since 4.2
 */
public interface ProxyGrantingTicketFactory extends TicketFactory {

    /**
     * Create the ticket object.
     *
     * @param <T>            the type parameter
     * @param ticket         the ticket
     * @param authentication the authentication
     * @return the t
     */
    <T extends ProxyGrantingTicket> T create(ServiceTicket ticket, Authentication authentication);
}
