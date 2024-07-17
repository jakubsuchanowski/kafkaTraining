package com.js.kafkaTraining;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private MessageProducer producer;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message){
        producer.sendMessage(message);
        return "message sent to Kafka: "+message;
    }
}
