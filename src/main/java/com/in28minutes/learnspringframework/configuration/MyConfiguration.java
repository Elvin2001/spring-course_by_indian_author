package com.in28minutes.learnspringframework.configuration;

import com.in28minutes.learnspringframework.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean(name = "firstNameBean")
    public String firstName() {
        return "Elvin";
    }

    @Bean
    public String lastName() {
        return "Abaev";
    }

    @Bean
    public String[] hobbies() {
        return new String[]{"Programming", "Soccer", "Armwrestling"};
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean(name = "personBean")
    public Person person() {
        return new Person(firstName(), lastName(), age(), hobbies());
    }


}
