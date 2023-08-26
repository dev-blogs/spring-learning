package com.example;

import org.springframework.beans.factory.BeanFactory;
import com.example.beans.MessageRenderer;
import com.example.config.Factory;

public class App {
	public static void main(String[] args) {
		BeanFactory context = Factory.getBeanFactory("src/main/resources/context.xml");
		MessageRenderer mr = (MessageRenderer) context.getBean("renderer");
		mr.render();
	}
}