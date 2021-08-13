package com.vannanas.vannanas;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaterLevelController extends BaseController {

    private long WaterLevel;
    // API has no waterlevel?
    public final String endpoint_name = "GroupState";

        @GetMapping("/waterlevel")
        public String waterLevel () throws IOException, InterruptedException {
            // return WaterInflux.getWaterInflux();

            //JsonObject jsonObject = new JsonParser().parse("{\"name\": \"John\"}").getAsJsonObject();
            //System.out.println(jsonObject.get("name").getAsString()); //John

            // TODO: HOW TO EXTRACT JSON TO DOUBLE??
            String response_body = super.handleRequest(endpoint_name);
            return response_body;
        }
    }
