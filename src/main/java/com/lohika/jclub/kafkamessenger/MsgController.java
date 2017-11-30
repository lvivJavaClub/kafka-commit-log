package com.lohika.jclub.kafkamessenger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://docs.spring.io/spring-kafka/reference/htmlsingle/
 */
@Slf4j
@RestController("/msg")
public class MsgController {
    @Value("${kafka.topic}")
    private String kafkaTopic;

    @Autowired
    private KafkaTemplate<String, String> template;

    @PostMapping
    public void post(@RequestBody String message) {
        log.info("Sending to kafka: {}", message);
        for (int i = 0; i<1000; i++ ) {
            template.send(kafkaTopic, message + " - " + i);
        }
    }
}
