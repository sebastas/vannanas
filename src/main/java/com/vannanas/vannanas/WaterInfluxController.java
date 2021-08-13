package com.vannanas.vannanas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WaterInfluxController extends BaseController {

    long waterInflux;
    public final String endpoint_name = "WaterInflux";

    @GetMapping("/waterinflux")
    public String waterInflux() throws IOException, InterruptedException {
        return handleRequest(endpoint_name);
    }
}