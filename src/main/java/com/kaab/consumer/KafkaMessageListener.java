package com.kaab.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "kaab-topic-2",groupId = "kaab-group-2")
    public void consume(String message){
        logger.info("Consume consume the message {}",message);

    }
}
