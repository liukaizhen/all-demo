package com.sean.springboot;

import com.sean.springboot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @Bean
    public Person myPerson(){
        return new Person();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//        Map<String, Object> systemEnvironment = context.getEnvironment().getSystemEnvironment();
//        Map<String, Object> systemProperties = context.getEnvironment().getSystemProperties();
//        System.out.println(systemEnvironment);
//        System.out.println("----");
//        System.out.println(systemProperties);
//        String[] names = context.getBeanDefinitionNames();
//        System.out.println(names);
//        List<String> list = Arrays.asList(names);
//        System.out.println(list);
    }

}
