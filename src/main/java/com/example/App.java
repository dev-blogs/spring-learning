package com.example;

import org.springframework.beans.factory.BeanFactory;
import com.example.config.Factory;
import com.example.spel.InjectSimpleSpel;

public class App {
	public static void main(String[] args) {
		BeanFactory factory = Factory.getXmlApplicationContext("app-context-xml.xml");
		InjectSimpleSpel simple = (InjectSimpleSpel) factory.getBean("injectSimpleSpel");
		System.out.println(simple);
	}
}