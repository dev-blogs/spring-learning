package com.example;

import com.example.beans.CollectionInjection;
import org.springframework.beans.factory.BeanFactory;
import com.example.config.Factory;

public class App {
	public static void main(String[] args) {
		BeanFactory context = Factory.getApplicationContext("app-context-xml.xml");

		CollectionInjection collectionInjection = (CollectionInjection) context.getBean("injectCollection");
		System.out.println(collectionInjection);
	}
}