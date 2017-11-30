package com.lohika.jclub.kafkamessenger;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumers {
    @KafkaListener(topics = "messagesTopic2")
    public void listen(ConsumerRecord<?, ?> cr) throws Exception {
        log.info(cr.toString());
    }
}
