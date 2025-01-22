package org.example;

import org.example.config.ApplicationConfiguration;
import org.example.database.pool.ConnectionPool;
import org.example.database.repository.CompanyRepository;
import org.example.database.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//        ConnectionPool connectionPool = context.getBean("pool1", ConnectionPool.class);
        ConnectionPool connectionPool = context.getBean("pool2", ConnectionPool.class);
         System.out.println(connectionPool);
    }
}