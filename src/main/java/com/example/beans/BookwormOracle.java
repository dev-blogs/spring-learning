package com.example.beans;

import org.springframework.stereotype.Service;

@Service("oracle")
public class BookwormOracle implements Oracle {

    @Override
    public String testMethod() {
        return "test method";
    }
}
