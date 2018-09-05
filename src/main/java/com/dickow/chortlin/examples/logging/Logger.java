package com.dickow.chortlin.examples.logging;

public interface Logger {
    <T> void log(T arg);

    <T> void info(T arg);
}
