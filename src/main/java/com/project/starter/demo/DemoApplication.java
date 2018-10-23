package com.project.starter.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.project.starter.entities"})
@EnableJpaRepositories("com.project.starter.repository")
@ComponentScan("com.project.starter")
public class DemoApplication {
private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        LOGGER.info("--------------------------Starting application----------------------------------");
        SpringApplication.run(DemoApplication.class, args);
    }
}
