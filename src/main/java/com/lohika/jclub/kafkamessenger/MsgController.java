package com.lohika.jclub.kafkamessenger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://docs.spring.io/spring-kafka/reference/htmlsingle/
 */
@Slf4j
@RestController("/msg")
public class MsgController {

    @PostMapping
    public void post(@RequestBody String message) {
        log.info("Sending to kafka: {}", message);
    }
}
