package com.springweb.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;



@Component
class ClassA{

}

@Component
@Lazy
class ClassB{

    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("init");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("do something");
    }
}

@Configuration
@ComponentScan
public class LazyInitLauncherApplication {


    public static void main(String[] args) {


        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyInitLauncherApplication.class)){
            System.out.println("init context completed");
            context.getBean(ClassB.class).doSomething();
        }

    }
}
