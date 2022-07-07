# Getting Started
* 說明:
- 由javafaker 自動產生輸入資料
- 將資料經由processor 拆解/處理; 
  a. 以空白字元分割
  b. group by word
  c. 計算word數量
- 提供 restful controller 產出指定word計算數值
  GET http://localhost:8080/count/{word}

### Ref. links
- [Hands On: Process Messages with KafkaStreams and Spring Boot](https://developer.confluent.io/learn-kafka/spring/hands-on-process-messages-with-kafka-streams/)
  - [git source](https://github.com/confluentinc/demo-scene/tree/master/spring-kafka-ccloud-course/spring-kafka-ccloud)
  - [ref. Process Messages with KafkaStreams and Spring Boot](https://developer.confluent.io/learn-kafka/spring/process-messages-with-kafka-streams/)
- [Spring for Apache Kafka Deep Dive – Part 2: Apache Kafka and Spring Cloud Stream](https://www.confluent.io/blog/spring-for-apache-kafka-deep-dive-part-2-apache-kafka-spring-cloud-stream/)
  – [github source](https://github.com/spring-cloud/spring-cloud-stream-samples/tree/main/kafka-streams-samples/kafka-streams-interactive-query-advanced)
  
- [Java Faker](https://github.com/DiUS/java-faker); 
  This library is a port of Ruby's faker gem (as well as Perl's Data::Faker library) that generates fake data. It's useful when you're developing a new project and need some pretty data for showcase.

### Run & Test
- IDE
  Plugins/spring-boot/spring-boot:run
- command
> mvn spring-boot:run




### TODO
- 2022/07/07
  check JDK 17 compiler



### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.1/maven-plugin/reference/html/#build-image)
* [Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/html/spring-cloud-stream.html#spring-cloud-stream-overview-introducing)
* [Apache Kafka Streams Support](https://docs.spring.io/spring-kafka/docs/current/reference/html/#streams-kafka-streams)
* [Apache Kafka Streams Binding Capabilities of Spring Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/#_kafka_streams_binding_capabilities_of_spring_cloud_stream)

### Guides

The following guides illustrate how to use some features concretely:

* [Samples for using Apache Kafka Streams with Spring Cloud stream](https://github.com/spring-cloud/spring-cloud-stream-samples/tree/master/kafka-streams-samples)




