package com.in28minutes.learnspringframework.configuration;

import com.in28minutes.learnspringframework.domain.Address;
import com.in28minutes.learnspringframework.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfiguration {

    @Bean
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

    @Bean(name = "firstAddressBean")
    public Address myAddress() {
        return new Address("Russia", "Budennovsk", "Severniy", 1);
    }

    @Bean(name = "secondAddressBean")
    public Address hisAddress() {
        return new Address("Russia", "Stavropol", "Dzerjinskogo", 23);
    }

    @Bean(name = "firstPersonBean")
    public Person person() {
        return new Person(firstName(), lastName(), age(), hobbies(), myAddress());
    }

    @Bean(name = "secondPersonBean")
    public Person personWithParameters(String firstName, String lastName, int age, String[] hobbies, Address firstAddressBean) {
        return new Person(firstName, lastName, age, hobbies, firstAddressBean);
    }


}
