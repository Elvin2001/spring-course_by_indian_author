package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.configuration.MyConfiguration;
import com.in28minutes.learnspringframework.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class LearnSpringframeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringframeworkApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

//		System.out.println(context.getBean("secondPersonBean"));

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println();
        System.out.printf("Number of beans defining in IOC container = %d", context.getBeanDefinitionCount());

        context.close();
    }
}
