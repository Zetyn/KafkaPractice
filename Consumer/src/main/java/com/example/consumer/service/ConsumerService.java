package com.example.consumer.service;

import com.example.consumer.dto.NewsDto;
import com.example.consumer.dto.UserDto;
import com.example.consumer.repository.NewsRepository;
import com.example.consumer.repository.UserRepository;
import com.example.consumer.repository.entity.News;
import com.example.consumer.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsumerService {

    private final UserRepository userRepository;
    private final NewsRepository newsRepository;
    private final ModelMapper modelMapper;

    @KafkaListener(topics = "user", groupId = "1")
    public void userSave(UserDto user) {
        userRepository.save(modelMapper.map(user, User.class));
    }

    @KafkaListener(topics = "news", groupId = "1")
    public void newsSave(NewsDto news) {
        newsRepository.save(modelMapper.map(news, News.class));
    }
}
