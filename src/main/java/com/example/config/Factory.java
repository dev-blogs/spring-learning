package com.example.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Factory {
	public static BeanFactory getApplicationContext(String path) {
		return new ClassPathXmlApplicationContext(path);
	}
}
