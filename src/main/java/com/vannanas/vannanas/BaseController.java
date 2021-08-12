package com.vannanas.vannanas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
public class BaseController {
    public final String apiUrl = "https://innafjord.azurewebsites.net/api/";

    //@GetMapping("/base")
    public String handleRequest(String endpoint) throws IOException, InterruptedException
    {
        String target = apiUrl + endpoint;

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(target))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .setHeader("GroupId", "Gruppe 1")
                .setHeader("GroupKey", "I2HddS20ZEm71CSXwB2dgQ==")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // return response.statusCode();
        return response.body();
    }
}
