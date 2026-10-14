package com.practicing.spring_framework.examples.B.a1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDbDataService implements DataService{
    public int[] retrieveData(){
        return new int[] {1,22};
    }
}
