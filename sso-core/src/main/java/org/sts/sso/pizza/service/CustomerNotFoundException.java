package org.sts.sso.pizza.service;

/**
 * @author ts.Sun
 * @since 0.1
 */
public class CustomerNotFoundException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = -3421090062135589030L;

    public CustomerNotFoundException(String message)
    {
        super(message);
    }

}
