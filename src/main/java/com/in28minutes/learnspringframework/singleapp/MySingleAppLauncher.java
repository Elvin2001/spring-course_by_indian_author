package com.in28minutes.learnspringframework.singleapp;

import com.in28minutes.learnspringframework.singleapp.domain.MySQLDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MySingleAppLauncher {
    public static void main(String[] args) {
        SpringApplication.run(MySingleAppLauncher.class, args);

//        try (AnnotationConfigApplicationContext context =
//                     new AnnotationConfigApplicationContext(MyConfig.class)) {
//
//            BusinessCalculationService service = context.getBean(BusinessCalculationService.class);
//            MySQLDataService firstBean = context.getBean(MySQLDataService.class);
//            MySQLDataService secondBean = context.getBean(MySQLDataService.class);
//
//            MongoDBDataService thirdBean = context.getBean(MongoDBDataService.class);
//            System.out.println(service.findMax());

        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("contextConfiguration.xml")) {

            System.out.println(context.getBean("myDataService", MySQLDataService.class));
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
