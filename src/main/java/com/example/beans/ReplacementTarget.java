package com.example.beans;

public class ReplacementTarget {
    public String message(String msg) {
        return String.format("Message is : %s", msg);
    }

    public String message(Object msg) {
        return String.format("Message is : %s", msg);
    }
}
