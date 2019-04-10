package com.slmanju.dockerdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public Message home() {
        return new Message("Hello World");
    }

    @Getter @Setter @AllArgsConstructor
    public class Message {
        private String message;
    }

}
