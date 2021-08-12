package com.vannanas.vannanas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WaterInfluxController extends BaseController {

    long waterInflux;
    public final String endpoint_name = "WaterInflux";

    @GetMapping("/waterinflux")
    public double waterInflux() throws IOException, InterruptedException {
        // TODO: convert string to float
        String response_body = super.handleRequest(endpoint_name);
        return 4.0;
    }
}