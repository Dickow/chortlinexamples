package com.dickow.chortlin.examples.story1;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;

import java.net.URI;
import java.util.concurrent.ExecutionException;

public class Story1ClassA {
    public void callB() throws ExecutionException, InterruptedException {
        String value = "Hello world";
        HttpClient client = HttpClient.newBuilder().build();
        var request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublisher.fromString(value))
                .uri(URI.create("http://serviceb"))
                .build();
        var response = client.sendAsync(request, (statusCode, responseHeaders) -> null);
        response.get();
    }
}
