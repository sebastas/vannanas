package com.vannanas.vannanas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaterLevelController {

    private long WaterLevel;

    @GetMapping("/waterlevel")
    public long waterLevel() {
        //return WaterInflux.getWaterInflux();
        return 5;
    }
}