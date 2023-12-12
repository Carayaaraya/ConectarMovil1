package com.example.conectarmovil;

public class MessageModel {
    private String messageText;
    private boolean isSentByUser;

    public MessageModel(String messageText, boolean isSentByUser) {
        this.messageText = messageText;
        this.isSentByUser = isSentByUser;
    }

    public String getMessageText() {
        return messageText;
    }

    public boolean isSentByUser() {
        return isSentByUser;
    }
}

