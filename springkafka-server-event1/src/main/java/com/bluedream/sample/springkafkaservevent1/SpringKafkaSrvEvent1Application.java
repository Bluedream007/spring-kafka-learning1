package com.bluedream.sample.springkafkaservevent1;

import com.github.javafaker.Faker;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.stream.Stream;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import com.bluedream.sample.springkafkaservevent1.avro.Hobbit;

@SpringBootApplication
public class SpringKafkaSrvEvent1Application {


    @Value("${MyApp.topic-name.topic1}")
    private String TOPIC;
    // private static final String TOPIC = "egen-sse-test-topic";

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaSrvEvent1Application.class, args);
    }

    /*
    @Bean
    NewTopic hobbitAvro() {
        return TopicBuilder.name("egen-sse-test-topic").partitions(2).replicas(1).build();
    }
     */
    /*
    NewTopic hobbitAvro() {
        return TopicBuilder.name("hobbit-avro").partitions(6).replicas(3).build();
    }

     */

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            // kafkaTemplate.send("amigoscode", new Message("Hello From Kafka", LocalDateTime.now()));
			/*
			for (int i=0; i<=10_000_000; i++) {
				kafkaTemplate.send(topicName1, "Hello world from Kafka1Application - count time:" +i);
			}
			 */
            // kafkaTemplate.send(topicName1, "Hello world for Listener ");

            // for Message entity
            // kafkaTemplate.send(topicName1, new Message("Hello world for Listener ",  LocalDateTime.now()) );

            for (int i=0; i<=100; i++) {
                kafkaTemplate.send(TOPIC, new String("Hello world for Listener - count time:" + i) );
            }

        };
    }

}


