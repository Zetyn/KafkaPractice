package com.example.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@ComponentScan("com.example.producer")
public class Config {

    @Bean
    public NewTopic user() {
        return TopicBuilder.name("user").build();
    }

    @Bean
    public NewTopic news() {
        return TopicBuilder.name("news").build();
    }
}
