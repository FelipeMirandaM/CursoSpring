package com.springweb.learnspringframework.examples.h1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;



@ComponentScan
public class XmlConfigurationContextLauncherApp {


    public static void main(String[] args) {


        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
            Arrays.stream(context.getBeanDefinitionNames()).forEach((System.out::println));
            System.out.println(context.getBean("name"));
        }

    }
}
