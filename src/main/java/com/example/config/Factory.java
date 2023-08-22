package com.example.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Factory {
	/**
	 * spel doesn't work for DefaultListableBeanFactory
	 * @param contextPath
	 * @return
	 */
	public static BeanFactory getBeanFactory(String contextPath) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
		rdr.loadBeanDefinitions(new FileSystemResource(contextPath));
		return factory;
	}
	
	/**
	 * spel works
	 * @param contextPath
	 * @return
	 */
	public static BeanFactory getXmlApplicationContext(String contextPath) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(String.format("classpath:%s", contextPath));
		ctx.refresh();
		return ctx;
	}
	
	public static BeanFactory getApplicationContext(String contextPath) {
		return new ClassPathXmlApplicationContext(contextPath);
	}
}
