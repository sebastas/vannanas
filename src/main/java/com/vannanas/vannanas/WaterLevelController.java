package com.vannanas.vannanas;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaterLevelController extends BaseController {

    private long WaterLevel;
    // API has no waterlevel?
    public final String endpoint_name = "Turbines";

        @GetMapping("/waterlevel")
        public long waterLevel () throws IOException, InterruptedException {
            // return WaterInflux.getWaterInflux();

            // TODO: process json string to int
            String response_body = super.handleRequest(endpoint_name);
            return 1234;
        }

    }
