package com.example;

import org.springframework.beans.factory.BeanFactory;
import com.example.beans.MessageRenderer;
import com.example.config.Factory;

public class App {
	public static void main(String[] args) {
		BeanFactory factory = Factory.getApplicationContext("app-context-annotation.xml");
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
		mr.render();
	}
}