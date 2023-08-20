package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {
	private final String message;
	
	@Autowired
	public ConfigurableMessageProvider(@Value("This is a configurable message") String message) {
		this.message = message;
	}
	
    @Override
    public String getMessage() {
        return message;
    }
}
