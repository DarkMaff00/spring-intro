package com.example;

import java.util.Random;

public class RandomMessageService implements MessageService {

    private final String[] messageArray = {"Message1", "Message2", "Message3", "Message4", "Message5", "Message6", "Message7", "Message8", "Message9", "Message10"};

    @Override
    public String getMessage() {
        int rnd = new Random().nextInt(messageArray.length);
        return messageArray[rnd];
    }
}
