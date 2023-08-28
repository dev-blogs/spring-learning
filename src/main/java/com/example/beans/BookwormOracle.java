package com.example.beans;

import org.springframework.stereotype.Service;

@Service("oracle")
public class BookwormOracle {
    public String testMethod() {
        return "test method";
    }
}
