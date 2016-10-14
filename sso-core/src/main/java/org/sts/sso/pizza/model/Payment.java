package org.sts.sso.pizza.model;

/**
 * @author ts.Sun
 * @since 0.1
 */
import java.io.Serializable;

public class Payment implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private String finished;


    public String getFinished() {
        return finished;
    }


    public void setFinished(String finished) {
        this.finished = finished;
    }



}
