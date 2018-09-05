package com.dickow.chortlin.examples.app;

import com.dickow.chortlin.examples.logging.ConsoleLogger;
import com.dickow.chortlin.examples.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> { };
    }

    @Bean
    Logger log() {return new ConsoleLogger(); }
}
