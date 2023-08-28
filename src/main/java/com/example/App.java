package com.example;

import com.example.beans.CollectionInjection;
import org.springframework.beans.factory.BeanFactory;
import com.example.config.Factory;

public class App {
	public static void main(String[] args) {
		BeanFactory factory = Factory.getBeanFactory("app-context-annotation.xml");
		CollectionInjection collectionInjection = (CollectionInjection) factory.getBean("injectCollection");
		System.out.println(collectionInjection);
	}
}