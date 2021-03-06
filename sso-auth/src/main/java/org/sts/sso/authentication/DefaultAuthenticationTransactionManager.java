package org.sts.sso.authentication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * This is {@link DefaultAuthenticationTransactionManager}.
 *
 * @author Misagh Moayyed
 * @since 4.2.0
 */
@Component("defaultAuthenticationTransactionManager")
public class DefaultAuthenticationTransactionManager implements AuthenticationTransactionManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultAuthenticationTransactionManager.class);

    @Autowired
    @Qualifier("authenticationManager")
    private AuthenticationManager authenticationManager;

    @Override
    public AuthenticationTransactionManager handle(final AuthenticationTransaction authenticationTransaction,
                                                   final AuthenticationContextBuilder authenticationContext)
            throws AuthenticationException {
        if (!authenticationTransaction.getCredentials().isEmpty()) {
            final Authentication authentication = this.authenticationManager.authenticate(authenticationTransaction);
            LOGGER.debug("Successful authentication; Collecting authentication result [{}]", authentication);
            authenticationContext.collect(authentication);
        }
        LOGGER.debug("Transaction ignored since there are no credentials to authenticate");
        return this;
    }

    /**
     * Sets authentication manager.
     *
     * @param authenticationManager the authentication manager
     */
    @Override
    public void setAuthenticationManager(final AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

}
