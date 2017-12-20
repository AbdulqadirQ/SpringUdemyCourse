package com.abdulqadirsprojects.springCourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		

		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/abdulqadirsprojects/springCourse/beans/beans.xml");
		
		Person person = (Person)context.getBean("person");
		person.speak();		
		System.out.println(person);
		
		Address address = (Address)context.getBean("address");
		System.out.println(address);
		
		((FileSystemXmlApplicationContext)context).close();


	}

}
