package com.example.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Factory {
	
	public static BeanFactory getBeanFactory(String contextPath) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(String.format("classpath:%s", contextPath));
		ctx.refresh();
		return ctx;
	}
	
	public static BeanFactory getApplicationContext(String contextPath) {
		return new ClassPathXmlApplicationContext(contextPath);
	}
}
