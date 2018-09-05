package com.dickow.chortlin.examples.logging;

import org.springframework.stereotype.Component;

@Component
public class ConsoleLogger implements Logger {
    @Override
    public <T> void log(T arg) {
        System.out.println(String.valueOf(arg));
    }

    @Override
    public <T> void info(T arg) {
        System.out.println(String.valueOf(arg));
    }
}
