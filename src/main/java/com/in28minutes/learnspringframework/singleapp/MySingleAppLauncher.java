package com.in28minutes.learnspringframework.singleapp;

import com.in28minutes.learnspringframework.singleapp.configuration.MyConfig;
import com.in28minutes.learnspringframework.singleapp.domain.BusinessCalculationService;
import com.in28minutes.learnspringframework.singleapp.domain.MongoDBDataService;
import com.in28minutes.learnspringframework.singleapp.domain.MySQLDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MySingleAppLauncher {
    public static void main(String[] args) {
        SpringApplication.run(MySingleAppLauncher.class, args);

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(MyConfig.class)) {

            BusinessCalculationService service = context.getBean(BusinessCalculationService.class);
            MySQLDataService firstBean = context.getBean(MySQLDataService.class);
            MySQLDataService secondBean = context.getBean(MySQLDataService.class);

            MongoDBDataService thirdBean = context.getBean(MongoDBDataService.class);
            System.out.println(service.findMax());
        }

    }
}
