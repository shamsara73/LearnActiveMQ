package com.maybank.learnactivemq.consumer.component;

import com.maybank.learnactivemq.model.MQMessage;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class MessageConsumer {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "QLearnActiveMQ")
    public void messageListener(MQMessage message){
        LOGGER.info(message.getMessage());
    }
}
