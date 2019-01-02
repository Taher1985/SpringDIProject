package com.spring._05initanddestroymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_05applicationcontainerbeans.xml");
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
