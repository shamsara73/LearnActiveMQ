package com.maybank.learnactivemq.model;

import java.io.Serializable;


public class MQMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    public String source;
    public String message;

    public String getMessage(){
        return "Source : "+source+"Your Message "+message;
    }

}
