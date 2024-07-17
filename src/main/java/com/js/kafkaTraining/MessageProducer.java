package com.js.kafkaTraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "my_topic";

    public void sendMessage(String message){
        kafkaTemplate.send(TOPIC,message);
    }
}
