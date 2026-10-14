package com.practicing.spring_framework.examples.B.a1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Qualifier("MySQLQualifier")
public class MySQLDataService implements DataService{
    public int[] retrieveData(){
        return new int[] {1,2};
    }
}
