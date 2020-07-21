package com.example.demo.controller;

import com.example.demo.domain.Message;
import com.example.demo.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

    MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("addMessage")
    public ResponseEntity<Message> addMessage(){
       return ResponseEntity.ok(messageService.addMessage());
    }
}
