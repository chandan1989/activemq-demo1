package com.example.activemqdemo.receive;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListenerDemo {

    @JmsListener(destination = "queue1")
    public void receiveQueue(String text) throws InterruptedException {
        System.out.println("MEssageListener waiting for 5s : " );
        Thread.sleep(5000);
        System.out.println("message received : "+ text);
    }
}
