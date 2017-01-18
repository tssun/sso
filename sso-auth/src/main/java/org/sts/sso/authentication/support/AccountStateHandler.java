package org.sts.sso.authentication.support;

import org.ldaptive.auth.AuthenticationResponse;
import org.sts.sso.authentication.MessageDescriptor;

import javax.security.auth.login.LoginException;
import java.util.List;

/**
 * Strategy pattern for handling directory-specific account state data.
 *
 * @author Marvin S. Addison
 * @since 4.0.0
 */
public interface AccountStateHandler {
    /**
     * Handles the account state producing an error or warning messages as appropriate to the state.
     *
     * @param response LDAP authentication response containing attributes, response controls, and account state that
     *                 can be used to determine user account state.
     * @param configuration Password policy configuration.
     *
     * @return  List of warning messages.
     *
     * @throws LoginException When account state causes authentication failure.
     */
    List<MessageDescriptor> handle(AuthenticationResponse response, LdapPasswordPolicyConfiguration configuration)
            throws LoginException;
}
