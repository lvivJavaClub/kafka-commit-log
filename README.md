
### Command samples
#### start Zookeeper:
    zookeeper-server-start.sh $KAFKA_HOME/bin/kafka_2.11-1.0.0/config/zookeeper.properties

#### Start Kafka
    kafka-server-start.sh $KAFKA_HOME/config/server.properties

#### Start Kafka Consumer
    kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic messagesTopic --from-beginning
#### Start Kafka Producer
    kafka-console-producer.sh --broker-list localhost:9092 --topic test

### Start service from CLI via gradle
    export SERVER_PORT=9999
    export SPRING_KAFKA_CONSUMER_CLIENT_ID=terminal_boot_app
    export SPRING_KAFKA_PRODUCER_CLIENT_ID=terminal_boot_producer_app
    export SPRING_KAFKA_CONSUMER_CLIENT_ID=terminal_boot_consumer_app
    export SPRING_KAFKA_CONSUMER_GROUP_ID=terminal_boot_consumer_group

    gradle bootrun

## Resources
1. Spring Kafka: https://docs.spring.io/spring-kafka/reference/htmlsingle/
1. Event Sourcing: https://martinfowler.com/eaaDev/EventSourcing.html
