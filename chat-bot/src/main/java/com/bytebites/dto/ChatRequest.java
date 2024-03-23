package com.bytebites.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ChatRequest {
    private String model;
    private List<Message> messages;

    public ChatRequest(String model, String prompt) {
        this.model = model;
        messages = new ArrayList<>();
        messages.add(new Message("user", prompt));
    }
}
