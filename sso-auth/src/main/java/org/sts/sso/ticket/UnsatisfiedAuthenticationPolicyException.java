package org.sts.sso.ticket;

import org.springframework.util.Assert;
import org.sts.sso.authentication.ContextualAuthenticationPolicy;

/**
 * Error condition arising at ticket creation or validation time when a ticketing operation relying on authentication
 * cannot proceed due to unsatisfied authentication security policy.
 *
 * @author Marvin S. Addison
 * @since 4.0.0
 */
public class UnsatisfiedAuthenticationPolicyException extends AbstractTicketException {

    /** Serializable ID for unique id. */
    private static final long serialVersionUID = -827432780367197133L;

    /** Code description. */
    private static final String CODE = "UNSATISFIED_AUTHN_POLICY";

    /** Unfulfilled policy that caused this exception. */
    private final ContextualAuthenticationPolicy<?> policy;

    /**
     * Creates a new instance with no cause.
     *
     * @param policy Non-null unfulfilled security policy that caused exception.
     */
    public UnsatisfiedAuthenticationPolicyException(final ContextualAuthenticationPolicy<?> policy) {
        super(CODE);
        Assert.notNull(policy, "ContextualAuthenticationPolicy cannot be null");
        this.policy = policy;
    }

    /**
     * Gets the unsatisfied policy that caused this exception.
     *
     * @return Non-null unsatisfied policy cause.
     */
    public ContextualAuthenticationPolicy<?> getPolicy() {
        return policy;
    }
}
