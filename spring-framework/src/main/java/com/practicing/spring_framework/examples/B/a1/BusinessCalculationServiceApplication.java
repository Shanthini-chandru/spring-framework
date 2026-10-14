package com.practicing.spring_framework.examples.B.a1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
public class BusinessCalculationServiceApplication {

    private final DataService dataService;
    BusinessCalculationServiceApplication(DataService dataService){
        this.dataService = dataService;
    }

            int findMax(){
                return Arrays.stream(dataService.retrieveData()).max().orElse(0);

        }
        public String toString(){
        return "DataService: "+findMax();
        }

}
