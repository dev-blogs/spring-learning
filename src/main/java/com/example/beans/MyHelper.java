package com.example.beans;

public class MyHelper {
    private int count = 1;

    public void doIt(String message) {
        System.out.println(String.format("%s: %s instance", message, count++));
    }
}
