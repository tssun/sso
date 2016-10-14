package org.sts.sso.pizza.model;

import java.io.Serializable;

/**
 * @author ts.Sun
 * @since 0.1
 */
public class PaymentDetails implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private PaymentType paymentType;

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }


}