package org.sts.sso.authentication;

import org.springframework.stereotype.Component;
import org.sts.sso.services.ServiceContext;

/**
 * Produces authentication policies that passively satisfy any given {@link Authentication}.
 *
 * @author Marvin S. Addison
 * @since 4.0.0
 */
@Component("acceptAnyAuthenticationPolicyFactory")
public class AcceptAnyAuthenticationPolicyFactory implements ContextualAuthenticationPolicyFactory<ServiceContext> {

    @Override
    public ContextualAuthenticationPolicy<ServiceContext> createPolicy(final ServiceContext context) {
        return new ContextualAuthenticationPolicy<ServiceContext>() {

            @Override
            public ServiceContext getContext() {
                return context;
            }

            @Override
            public boolean isSatisfiedBy(final Authentication authentication) {
                return true;
            }
        };
    }
}
