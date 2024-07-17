package com.js.kafkaTraining;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {
    @KafkaListener(topics = "my_topic",groupId = "my-group")
    public void listen(String message){
        System.out.println("Received message: "+message);
    }
}
