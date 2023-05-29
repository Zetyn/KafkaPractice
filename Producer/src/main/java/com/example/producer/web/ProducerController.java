package com.example.producer.web;


import com.example.producer.dto.NewsDto;
import com.example.producer.dto.UserDto;
import com.example.producer.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.producer.service.UserService;

@RestController
@RequestMapping(value = "/api/producer")
@RequiredArgsConstructor
public class ProducerController {

    private final UserService userService;
    private final NewsService newsService;

    @PostMapping("/news")
    public void sendUser(@RequestParam String topic, @RequestBody UserDto user) {
        userService.sendMessage(topic,user);
    }
    @PostMapping("/user")
    public void sendNews(@RequestParam String topic, @RequestBody NewsDto news) {
        newsService.sendMessage(topic,news);
    }
}
