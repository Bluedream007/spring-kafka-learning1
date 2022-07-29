package com.bluedream.sample.springkafkaservevent1.controller;

import com.bluedream.sample.springkafkaservevent1.avro.Hobbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.kafka.receiver.KafkaReceiver;
import reactor.kafka.receiver.ReceiverRecord;

@RestController
@RequestMapping(path = "/sse")
public class ReceiveSrvMesgController {

    @Autowired
    KafkaReceiver<String, Hobbit> kafkaReceiver;
    //KafkaReceiver<String,String> kafkaReceiver;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux getEventsFlux(){
        Flux<ReceiverRecord<String,Hobbit>> kafkaFlux = kafkaReceiver.receive();
        //Flux<ReceiverRecord<String,String>> kafkaFlux = kafkaReceiver.receive();
        //System.out.println("received = " + record.value() + " with key " + record.key());

        //return kafkaFlux.checkpoint("Messages are started being consumed").log().doOnNext(r -> r.receiverOffset().acknowledge()).map(ReceiverRecord::value).checkpoint("Messages are done consumed");
        return kafkaFlux.checkpoint("Messages are started being consumed")
                .log()
                .doOnNext(r -> {
                    System.out.println("Received: " + r.value());
                    r.receiverOffset().acknowledge();})
                .map(ReceiverRecord::value)
                .checkpoint("Messages are done consumed");
    }

}
