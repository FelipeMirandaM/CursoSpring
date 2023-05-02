package com.springweb.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
class YourBusinessClass{


    //@Autowired
    Dependecy1 dependecy1;


    //@Autowired
    Dependecy2 dependecy2;


    //Injecta las dependencias sin necesidad del autowired, es el recomendado para spring
    public YourBusinessClass(Dependecy1 dependecy1, Dependecy2 dependecy2) {
        this.dependecy1 = dependecy1;
        this.dependecy2 = dependecy2;
    }

    //@Autowired
    public void setDependecy1(Dependecy1 dependecy1) {
        this.dependecy1 = dependecy1;
    }

    //@Autowired
    public void setDependecy2(Dependecy2 dependecy2) {
        this.dependecy2 = dependecy2;
    }

    @Override
    public String toString() {
        return "YourBusinessClass{" +
                "dependecy1=" + dependecy1 +
                ", dependecy2=" + dependecy2 +
                '}';
    }
}
@Component
class Dependecy1{

}
@Component
class Dependecy2{

}
@Configuration
@ComponentScan
public class DependecyInjection {


    public static void main(String[] args) {


        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DependecyInjection.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach((System.out::println));
            System.out.println(context.getBean(YourBusinessClass.class));
        }

    }
}
