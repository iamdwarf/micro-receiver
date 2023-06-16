package com.micro.microreceiver.component;

import com.micro.microreceiver.model.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class Receiver {
    private static final Logger logger = LogManager.getLogger(Receiver.class);
    @RabbitListener(queues = Constants.QUEUE )
    public void consumeMessageFromQueue(String message) {
        System.out.println("Message Received from queue: " + message );
    }
}
