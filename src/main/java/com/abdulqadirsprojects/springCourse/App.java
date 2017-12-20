package com.abdulqadirsprojects.springCourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// ApplicationContext is a bean container and is a class that can instantiate beans
		// This line creates a bean container. The the file which contains all beans for this project
		// is located within the root directory, so /beans.xml
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/abdulqadirsprojects/springCourse/beans/beans.xml");
		
		// The bean attribute name in 'beans.xml' is called 'person'
		// context is caste using the correct class, 'Person'
		Person person = (Person)context.getBean("person");
		person.speak();
		
		System.out.println(person);
		
		((FileSystemXmlApplicationContext)context).close();
		
		/* Usual way of creating a class object and using it:
		 		
		Person person = new Person();
		person.speak();
		
		*/

	}

}
