package com.slmanju.springdocker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@RestController
public class MessageController {

    @GetMapping("/")
    public ResponseEntity<Message> home() {
        return ResponseEntity.ok(new Message("Hello docker world"));
    }
    
    @GetMapping("/echo")
    public ResponseEntity<Message> echo() {
        return ResponseEntity.ok(new Message("echo... hello docker..."));
    }
    
    
    @Getter @Setter @AllArgsConstructor
    private static class Message {
        private String message;
    }
    
}
