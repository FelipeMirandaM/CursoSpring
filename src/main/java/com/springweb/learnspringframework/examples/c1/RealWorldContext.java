package com.springweb.learnspringframework.examples.c1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class RealWorldContext {


    public static void main(String[] args) {


        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RealWorldContext.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach((System.out::println));
            System.out.println(context.getBean(BussinessCalculationService.class).findMax());
        }

    }
}
 