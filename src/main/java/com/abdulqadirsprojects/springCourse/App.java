package com.abdulqadirsprojects.springCourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		

		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/abdulqadirsprojects/springCourse/beans/beans.xml");
		
		Person person1 = (Person)context.getBean("person");
		Person person2 = (Person)context.getBean("person");
		
		person1.setTaxId(666);
		
		System.out.println(person2);
		
		
		((FileSystemXmlApplicationContext)context).close();


	}

}
