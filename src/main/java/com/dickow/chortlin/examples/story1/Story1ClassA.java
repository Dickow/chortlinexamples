package com.dickow.chortlin.examples.story1;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;

public class Story1ClassA {
    public void callB() {
        String value = "Hello world";
        HttpClient client = HttpClient.newBuilder().build();
        var request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublisher.fromString(value))
                .header("Content-Type", "application/json")
                .uri(URI.create("http://localhost:8080/serviceb"))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandler.asString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}
