package com.example.demo.service;

import com.example.demo.domain.Message;
import com.example.demo.domain.Topic;
import com.example.demo.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MessageService {

    MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message addMessage(){
        Message message = Message.builder()
                .date("Test")
                .id(UUID.randomUUID().toString())
                .text("test")
                .handTopics(List.of(Topic.builder().name("Test").rating(0.0).build()))
                .predictionTopics(List.of(Topic.builder().name("Test").rating(0.0).build()))
                .valorization(0).build();
        return messageRepository.save(message);
    }
}
