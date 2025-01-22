package org.example.config;

import org.example.database.pool.ConnectionPool;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "org.example")
public class ApplicationConfiguration {

    @Bean("pool2")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public ConnectionPool pool2(){
        return new ConnectionPool(
                "username",
                12,
                new ArrayList<>(),
                new HashMap<>()
                );
    }
}
