package com.vannanas.vannanas;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@RestController
public class WaterLevelController extends BaseController {

    public final String endpoint_name = "Turbines";

    @GetMapping("/waterlevel")
    public String waterLevel() throws IOException, InterruptedException {
        return super.handleRequest(endpoint_name);
    }

//        Map<Object, Object> data = new HashMap<>();
//        data.put("username", "abc");
//        data.put("password", "123");
//        data.put("custom", "secret");
//        data.put("ts", System.currentTimeMillis());
//
//        HttpRequest request = HttpRequest.newBuilder()
//                .POST(buildFormDataFromMap(data))
//                .uri(URI.create("https://httpbin.org/post"))
//                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
//                .header("Content-Type", "application/x-www-form-urlencoded")
//                .build();
//
//        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//
//        // print status code
//        System.out.println(response.statusCode());
//
//        // print response body
//        System.out.println(response.body());
    }

//    private void sendGet() throws Exception {
//
//        HttpRequest request = HttpRequest.newBuilder()
//                .GET()
//                .uri(URI.create("https://httpbin.org/get"))
//                .setHeader("User-Agent", "Java 11 HttpClient Bot")
//                .build();
//
//        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//
//    }
//
//    private void sendPost() throws Exception {
//
//        // form parameters
//
//
//    }
//
//    private static HttpRequest.BodyPublisher buildFormDataFromMap(Map<Object, Object> data) {
//        var builder = new StringBuilder();
//        for (Map.Entry<Object, Object> entry : data.entrySet()) {
//            if (builder.length() > 0) {
//                builder.append("&");
//            }
//            builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
//            builder.append("=");
//            builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
//        }
//        System.out.println(builder.toString());
//        return HttpRequest.BodyPublishers.ofString(builder.toString());
//    }


