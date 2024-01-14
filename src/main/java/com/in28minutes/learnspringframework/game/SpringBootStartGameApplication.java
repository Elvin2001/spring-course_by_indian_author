package com.in28minutes.learnspringframework.game;

import com.in28minutes.learnspringframework.game.configuration.GameConfiguration;
import com.in28minutes.learnspringframework.game.domain.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootStartGameApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStartGameApplication.class, args);

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(GameConfiguration.class)) {

            GameRunner gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        }
    }
}
