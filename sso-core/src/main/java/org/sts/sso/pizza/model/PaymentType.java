package org.sts.sso.pizza.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author ts.Sun
 * @since 0.1
 */
public enum PaymentType {

    CASH,CHECK,CREDIT_CARD;

    public static List<PaymentType> asList(){
        PaymentType[]  all = PaymentType.values();
        System.out.println("size:"+all.length);
        return Arrays.asList(all);
    }

    @Override
    public String toString(){
        if (this == CASH) {
            return "ÏÖ½ð";
        }else if(this == CHECK)
            return "Ö§Æ±";
        else {
            return "ÐÅÓÃ¿¨";
        }
    }
}
