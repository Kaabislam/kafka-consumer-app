package com.kaab.consumer;

import com.kaab.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "kaab-topic-class",groupId = "kaab-topic-class")
    public void consumeCustomer(Customer customer){
        logger.info("Consumer consume the event {}",customer.toString());

    }

//    @KafkaListener(topics = "kaab-topic-2",groupId = "kaab-group-2")
//    public void consume1(String message){
//        logger.info("Consumer [1] consume the message {}",message);
//
//    }
//
//    @KafkaListener(topics = "kaab-topic-2",groupId = "kaab-group-2")
//    public void consume2(String message){
//        logger.info("Consumer [2] consume the message {}",message);
//
//    }
//
//    @KafkaListener(topics = "kaab-topic-2",groupId = "kaab-group-2")
//    public void consum3(String message){
//        logger.info("Consumer [3] consume the message {}",message);
//
//    }
//
//    @KafkaListener(topics = "kaab-topic-2",groupId = "kaab-group-2")
//    public void consume4(String message){
//        logger.info("Consumer [4] consume the message {}",message);
//
//    }
}
