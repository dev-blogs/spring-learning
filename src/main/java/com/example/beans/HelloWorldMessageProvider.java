package com.example.beans;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "test";
    }
}
