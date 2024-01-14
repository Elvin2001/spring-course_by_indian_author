package com.in28minutes.learnspringframework.game.meeting;

import com.in28minutes.learnspringframework.game.meeting.configuration.MyConfiguration;
import com.in28minutes.learnspringframework.game.meeting.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class LearnSpringframeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringframeworkApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        System.out.println(context.getBean(Person.class));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println();
        System.out.printf("Number of beans defining in IOC container = %d", context.getBeanDefinitionCount());

        context.close();
    }
}
