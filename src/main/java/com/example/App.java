package com.example;

import com.example.beans.ReplacementTarget;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(String.format("classpath:%s", "app-context-xml.xml"));
		ctx.refresh();

		ReplacementTarget replacementTarget = (ReplacementTarget) ctx.getBean("replacementTarget");
		ReplacementTarget standardTarget = (ReplacementTarget) ctx.getBean("standardTarget");

		System.out.println(replacementTarget.message("test replacement"));
		System.out.println(standardTarget.message("test standard replacement"));
	}
}