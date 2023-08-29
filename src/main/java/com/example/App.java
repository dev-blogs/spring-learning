package com.example;

import com.example.beans.DemoBean;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(String.format("classpath:%s", "app-context-xml.xml"));
		ctx.refresh();

		DemoBean demoBean1 = (DemoBean) ctx.getBean("abstractLookupBean");
		DemoBean demoBean2 = (DemoBean) ctx.getBean("standardLookupBean");

		demoBean1.someOperation();
		demoBean1.someOperation();
		demoBean1.someOperation();

		System.out.println("---------------------");

		demoBean2.someOperation();
		demoBean2.someOperation();
		demoBean2.someOperation();
	}
}