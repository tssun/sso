package org.sts.sso.ticket.proxy;

import org.sts.sso.authentication.principal.Service;
import org.sts.sso.ticket.Ticket;
import org.sts.sso.ticket.TicketFactory;

/**
 * The {@link ProxyTicketFactory} is responsible for
 * creating instances of {@link ProxyTicket}.
 *
 * @author Misagh Moayyed
 * @since 4.2
 */
public interface ProxyTicketFactory extends TicketFactory {

    /**
     * Create the ticket object.
     *
     * @param <T>                  the type parameter
     * @param ticketGrantingTicket the ticket granting ticket
     * @param service              the service
     * @return the t
     */
    <T extends Ticket> T create(ProxyGrantingTicket ticketGrantingTicket,
                                Service service);
}
