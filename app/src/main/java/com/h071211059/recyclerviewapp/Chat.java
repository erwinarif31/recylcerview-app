package com.h071211059.recyclerviewapp;

public class Chat {
    private String name;
    private String messages;
    private String time;
    private int image;

    public Chat(String name, String messages, String time, int image) {
        this.name = name;
        this.messages = messages;
        this.time = time;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
