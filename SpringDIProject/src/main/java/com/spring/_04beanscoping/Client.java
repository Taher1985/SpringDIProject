package com.spring._04beanscoping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/_04applicationcontainerbeans.xml");

		Viewer viewer = (Viewer) context.getBean("viewer");
		System.out.println(viewer.hashCode());
		viewer.viewerTicketNumber();
		
		viewer.viewerTicketNumber(new Ticket("5678"));
		viewer.viewerTicketNumber();
		
		Viewer viewer1 = (Viewer) context.getBean("viewer");
		System.out.println(viewer1.hashCode());
		viewer1.viewerTicketNumber();

	}

}
