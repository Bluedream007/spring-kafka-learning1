package com.bluedream.sample.springcloudkafkastream1.controller;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StoreQueryParameters;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.springframework.kafka.config.StreamsBuilderFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class processWordController {
    private final StreamsBuilderFactoryBean factoryBean;

    @GetMapping("/count/{word}")
    public String getCount(@PathVariable String word) {
        final KafkaStreams kafkaStreams = factoryBean.getKafkaStreams();

        final ReadOnlyKeyValueStore<String, Long> counts = kafkaStreams.store(StoreQueryParameters.fromNameAndType("counts", QueryableStoreTypes.keyValueStore()));
        long intCount = counts.get(word);
        String strRet = "The number of word: " + intCount;
        return (strRet);
    }
}
