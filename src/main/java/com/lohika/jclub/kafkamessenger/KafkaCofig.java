package com.lohika.jclub.kafkamessenger;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaCofig {
    @Value("${kafka.topic}")
    String kafkaTopik;

    @Bean
    public NewTopic newTopic() {
        return new NewTopic(kafkaTopik, 3, (short)2);
    }

//    @Bean
//    ConcurrentKafkaListenerContainerFactory<Integer, String>
//    kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<Integer, String> factory =
//                new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
//
//    @Bean
//    public ConsumerFactory<Integer, String> consumerFactory() {
//        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
//    }
//
//    @Bean
//    public Map<String, Object> consumerConfigs() {
//        Map<String, Object> props = new HashMap<>();
//        //props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, embeddedKafka.getBrokersAsString());
//        props.put(ConsumerConfig.PART, embeddedKafka.getBrokersAsString());
//
//
//        return props;
//    }
//
//
//    @Bean
//    public Map<String, Object> producerConfigs() {
//        Map<String, Object> props = new HashMap<>();
//        //props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, embeddedKafka.getBrokersAsString());
//        props.put(ProducerConfig.TOP, embeddedKafka.getBrokersAsString());
//        return props;
//    }
//

}
