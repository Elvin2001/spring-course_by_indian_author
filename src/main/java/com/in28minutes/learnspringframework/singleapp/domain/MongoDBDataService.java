package com.in28minutes.learnspringframework.singleapp.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MongoDBDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{11, 22, 33, 44, 55};
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy");
    }
}
