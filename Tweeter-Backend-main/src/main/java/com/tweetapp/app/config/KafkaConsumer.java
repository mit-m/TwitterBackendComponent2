package com.tweetapp.app.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@EnableKafka
public class KafkaConsumer {
	
	private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = {"tweets"}, groupId = "kafka-tweets-consumer")
    public void onMessage(ConsumerRecord<String, String> consumerRecord){
        log.info("Consumer message: {}", consumerRecord);
    }

}
