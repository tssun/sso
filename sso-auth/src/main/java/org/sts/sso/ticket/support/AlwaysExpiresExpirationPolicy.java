package org.sts.sso.ticket.support;

import org.springframework.stereotype.Component;
import org.sts.sso.ticket.TicketState;

/**
 * AlwaysExpiresExpirationPolicy always answers true when asked if a Ticket is
 * expired.
 *
 * @author Misagh Moayyed
 * @since 4.2
 */
@Component("alwaysExpiresExpirationPolicy")
public final class AlwaysExpiresExpirationPolicy extends AbstractCasExpirationPolicy {

    /** Serializable Unique ID. */
    private static final long serialVersionUID = 3836547698242303540L;


    /**
     * Instantiates a new Always expires expiration policy.
     */
    public AlwaysExpiresExpirationPolicy() {}

    @Override
    public boolean isExpired(final TicketState ticketState) {
        return true;
    }
}
