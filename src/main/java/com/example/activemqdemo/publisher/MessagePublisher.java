package com.example.activemqdemo.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class MessagePublisher implements CommandLineRunner {

    @Autowired
    private JmsMessagingTemplate template;

//    @Autowired
//    private JmsTemplate template;

    @Autowired
    private Queue queue;

    public void run(String... arg){
        for (int i = 1; i < 10 ; i++) {
            template.convertAndSend(this.queue,"message-" + i);
            System.out.println("message---"+i +" published");

        }
        System.out.println("message published successfully to queue");

    }
}
