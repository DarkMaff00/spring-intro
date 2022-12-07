package com.example;

import org.springframework.context.annotation.*;

@Configuration
public class MessageConfig {
    @Bean
    public MessageService messageService(){
        return new MyNameMessageService() {
        };
    }
}
