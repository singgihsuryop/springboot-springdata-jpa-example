package com.singgihsuryop.springboot.springdata.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.telkomsigma")
//@EnableTransactionManagement
//@EntityScan(basePackages="com")
//@EnableJpaRepositories(basePackages = "com")
public class Application  {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
