package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.configuration.MyConfiguration;
import com.in28minutes.learnspringframework.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LearnSpringframeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringframeworkApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

		System.out.println(context.getBean("firstNameBean"));
		System.out.println(context.getBean("lastName"));
		Person person = context.getBean(Person.class);

		context.close();
	}
}
